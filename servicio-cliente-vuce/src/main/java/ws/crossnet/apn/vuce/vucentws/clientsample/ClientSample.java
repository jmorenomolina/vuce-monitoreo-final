package ws.crossnet.apn.vuce.vucentws.clientsample;

import java.util.Iterator;
import java.util.List;

import javax.activation.DataHandler;

import ws.crossnet.apn.vuce.vucentws.VucentWS;
import ws.crossnet.apn.vuce.vucentws.VucentWSPortType;

public class ClientSample {

	public static void main(String[] args) {
		System.out.println("***********************");
		System.out.println("Create Web Service Client...");
		VucentWS service1 = new VucentWS();
		System.out.println("Create Web Service...");
		try {
			VucentWSPortType port1 = service1.getVucentWSHttpSoap11Endpoint();
			List<DataHandler> result = port1.obtenerTransaccionesPendientes(75);
			if (result != null) {
				System.out.println("Se recuperaron " + result.size() + " transacciones");
				System.out.println("Call Web Service Operation...");
				for (Iterator<DataHandler> iterator = result.iterator(); iterator.hasNext();) {
					DataHandler dataHandler = (DataHandler) iterator.next();
					System.out.println(dataHandler.getContentType());
					System.out.println(dataHandler.toString());
				}
			} else
				System.out.println("Ningún resultado!");
			System.out.println("Call Over!");
		} catch (Throwable e) {
			System.out.println("Error! " + e);
		}
	}
}
