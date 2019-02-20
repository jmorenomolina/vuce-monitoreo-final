package vuce.gob.pe.app.service.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UtilRow {

	public static List<Integer> getPosistionTable(String xml,String tag) {
		List<Integer> lista = new ArrayList<>();
		int start = 0;
		while (true) {
			int found = xml.indexOf(tag, start);
			if (found != -1) {
				lista.add(found);
			}
			if (found == -1)
				break;
			start = found + 2; 
		}
		return lista;
	}
	
	
	public static String getTablesN45(String xml) {
		List<Integer> position = UtilRow.getPosistionTable(xml,"tabla");
		String word  = "";
		if (Optional.ofNullable(position).isPresent() && !position.isEmpty()) {
			int i = 1;
			for (Integer p : position) {
				if (i % 2 != 0) {
					if("".equals(word)) {
						word = xml.substring(p+6,position.get(i)-6);	
					}else {
						word = word+","+xml.substring(p+6,position.get(i)-6);
					}
				}
				i++;
			}
		}
		return word;		
	}
	
	public static String getTablesN44(String xml) {
		List<Integer> position = UtilRow.getPosistionTable(xml,"fecha");
		String word  = "";
		if (Optional.ofNullable(position).isPresent() && !position.isEmpty()) {
			int i = 1;
			for (Integer p : position) {
				if (i % 2 != 0) {
					word = xml.substring(p+6,position.get(i)-2);
				}
				i++;
			}
		}
		return word;		
	}
	
}
