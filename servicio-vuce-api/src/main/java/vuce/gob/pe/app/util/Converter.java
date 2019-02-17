package vuce.gob.pe.app.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Converter {

	public static Date convertToDate(String fecha, String pattern) {
		SimpleDateFormat sf = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			if (fecha != null && fecha !="") {
				date = sf.parse(fecha);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

}
