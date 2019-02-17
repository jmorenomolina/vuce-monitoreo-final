package ws.crossnet.apn.vuce.mediador.router;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.activation.DataHandler;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.apache.axiom.attachments.ByteArrayDataSource;
import org.apache.commons.io.FileUtils;

import ws.crossnet.apn.vuce.mediador.esquema.notificacion.NotificacionType;
import ws.crossnet.apn.vuce.mediador.esquema.notificacion.ObjectFactory;
import ws.crossnet.apn.vucentws.esquemas.TransaccionType;

public class RouterVUCEHelper {

    private static boolean debug = true;

    public static final String APN003_DR = "APN003_DR.vm";
    public static final String APN004_DR = "APN004_DR.vm";
    public static final String APN005_DR = "APN005_DR.vm";
    public static final String APN006_DR = "APN006_DR.vm";
    public static final String TMP = "./";

    public static DataHandler comprimirCadenaTexto(String data) throws IOException {
        String zipFileName = "ebXML.zip";
        ZipOutputStream os = null;
        FileInputStream fis = null;
        FileOutputStream file = null;

        try {

            file = new FileOutputStream(zipFileName);
            os = new ZipOutputStream(file);
            ZipEntry entrada = new ZipEntry("ebXML.xml");
            os.putNextEntry(entrada);
            os.write(data.getBytes("ISO-8859-1"));

        } finally {

            if (fis != null) {
                fis.close();
            }
            if (os != null) {
                os.closeEntry();
                os.close();
            }
            if (file != null) {
                file.close();
            }
        }

        File zipFile = new File(zipFileName);
        ByteArrayDataSource bads = new ByteArrayDataSource(FileUtils.readFileToByteArray(zipFile), "application/zip");
        DataHandler dataHandler = new DataHandler(bads);
        zipFile.delete();

        return dataHandler;
    }

    public boolean descomprimirAdjuntos(File file, TransaccionType transaccion) throws Exception {

        boolean tieneAdjuntos = false;
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(file))) {

            ZipEntry ze = zis.getNextEntry();
            if (ze != null) {
                tieneAdjuntos = true;
            }

            while (ze != null) {

                String entryName = ze.getName();
                int n;
                File fileAdjunto = new File(TMP + entryName);
                try (FileOutputStream fileoutputstream = new FileOutputStream(fileAdjunto)) {
                    byte[] buf = new byte[1024];
                    while ((n = zis.read(buf, 0, 1024)) > -1) {
                        fileoutputstream.write(buf, 0, n);
                    }
                    fileoutputstream.close();
          
                    zis.closeEntry();
                    ze = zis.getNextEntry();
                } finally {
                    fileAdjunto.delete();
                }

            }

        }
        return tieneAdjuntos;
    }


    /**
     * Este m�todo extrae los archivos adjuntos y los copia hacia una carpeta
     * en alfreso
     *
     * @param transaccion El mensaje xml de la transmisi�n
     * @param ziz stream Strem para leer el zip adjunto
     * @return
     * @throws IOException
     * @throws CMAdapterServiceException
     */
    public boolean extraerAdjuntos(TransaccionType transaccion, ZipInputStream zis) throws Exception {

        boolean tieneAdjuntos = false;
        String fileName = TMP + transaccion.getTipoMensaje() + "_" + transaccion.getDocumento().getNumero() + ".zip";
        File file = null;
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            file = new File(fileName);

            int read = 0;
            byte[] buf = new byte[1024];
            while ((read = zis.read(buf, 0, 1024)) > -1) {
                fos.write(buf, 0, read);
            }
            fos.flush();
            tieneAdjuntos = descomprimirAdjuntos(file, transaccion);
        } finally {
            if (file != null) {
                file.delete();
            }
        }
        return tieneAdjuntos;

    }

    /**
     * Este metodo es usado para extraer el mensaje xml de la transmision
     *
     * @param zis
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    public TransaccionType extraerMensajeXML(String xmlSB) throws ProcesadorMensajesVUCEException {
        TransaccionType transaccion = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(TransaccionType.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            transaccion = (TransaccionType) unmarshaller.unmarshal(new StreamSource(new StringReader(xmlSB)));
        } catch (Exception e) {
            throw new ProcesadorMensajesVUCEException(e);
        }
        return transaccion;
    }

    public String extraerXML(ZipInputStream zis) throws ProcesadorMensajesVUCEException {
        StringBuilder xmlSB = new StringBuilder();
        try {
            byte[] buffer = new byte[1024];
            int read;
            while ((read = zis.read(buffer, 0, 1024)) >= 0) {
                xmlSB.append(new String(buffer, 0, read,"ISO-8859-1"));
            }
        } catch (Exception e) {
            throw new ProcesadorMensajesVUCEException(e);
        }
        return xmlSB.toString();
    }

   
    public static File guardarDataHandler_(String prefijo, DataHandler dataHandler, String extension)
            throws ProcesadorMensajesVUCEException {
        File file = null;
        if (debug) {
            if (dataHandler != null) {

                try {
                    String fecha = new Date().toString();
                    String nombreArchivo = prefijo + "_" + dataHandler.hashCode() + "_"
                            + fecha.replaceAll(" ", "_").replaceAll(":", "_");
                    if (prefijo.equals("ebXML") || prefijo.equals("Adjuntos")) {
                        file = new File("C:/tmp/dh/" + nombreArchivo + "." + extension);
                    } else {
                        file = new File("C:/tmp/transacciones/" + nombreArchivo + "." + extension);
                    }
                    FileOutputStream fos = new FileOutputStream(file);
                    dataHandler.writeTo(fos);
                    fos.flush();
                    fos.close();
                } catch (Exception e) {
                    throw new ProcesadorMensajesVUCEException(e);
                }
            }
        }
        return file;
    }

    public static void guardarDataHandler(String id, DataHandler dataHandler) throws ProcesadorMensajesVUCEException {
        File file = null;
        if (debug) {
            try {
                file = new File("C://temp//" + id + ".zip");
                FileOutputStream fos = new FileOutputStream(file);
                dataHandler.writeTo(fos);
                fos.flush();
                fos.close();
            } catch (Exception e) {
                throw new ProcesadorMensajesVUCEException(e);
            }
        }
    }


    public static DataHandler getDataHandlerFromString(String param) {
        return new javax.activation.DataHandler(param, "text/plain; charset=UTF-8");
    }

    public static String convertirNotificacionXML(NotificacionType notificacion) throws JAXBException {
        ObjectFactory of = new ws.crossnet.apn.vuce.mediador.esquema.notificacion.ObjectFactory();
        JAXBElement<NotificacionType> obj = of.createNotificacion(notificacion);
        JAXBContext jaxbContext = JAXBContext.newInstance(NotificacionType.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        StringWriter sw = new StringWriter();
        jaxbMarshaller.marshal(obj, sw);
        return sw.toString();
    }

    public static String convertirTransaccionXML(TransaccionType transaccion) throws JAXBException {
        ws.crossnet.apn.vucentws.esquemas.ObjectFactory of = new ws.crossnet.apn.vucentws.esquemas.ObjectFactory();
        JAXBElement<TransaccionType> obj = of.createTransaccion(transaccion);
        JAXBContext jaxbContext = JAXBContext.newInstance(TransaccionType.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        StringWriter sw = new StringWriter();
        jaxbMarshaller.marshal(obj, sw);
        return sw.toString();
    }

    /**
     * Este metodo convierte una cadena que contiene un xml en un objeto
     *
     * @param xmlString
     * @param clase
     * @return
     * @throws ProcesadorMensajesVUCEException
     * @throws IOException
     * @throws JAXBException
     */
    @SuppressWarnings("unchecked")
    public static <T> Object getObjectFromXMLString(String xmlString, Class<?> objectFactory)
            throws ProcesadorMensajesVUCEException {
        Object object = null;
        try {
            // org.eclipse.persistence.jaxb.JAXBContextFactory x;
            JAXBContext jaxbContext = JAXBContext.newInstance(objectFactory);
            object = ((JAXBElement<T>) jaxbContext.createUnmarshaller()
                    .unmarshal(new StreamSource(new StringReader(xmlString)))).getValue();
        } catch (Exception e) {
            throw new ProcesadorMensajesVUCEException(e);
        }
        return object;
    }


}
