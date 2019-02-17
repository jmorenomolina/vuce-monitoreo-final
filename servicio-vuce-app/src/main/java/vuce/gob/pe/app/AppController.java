package vuce.gob.pe.app;

import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		return "master";
	}
	
	@RequestMapping("/monitoreo")
	public String monitoreo(Map<String, Object> model) {
		return "monitoreo";
	}
	
	
	@RequestMapping("/mantenimientoentidad")
	public String mantenimientoentidad(Map<String, Object> model) {
		return "mantenimiento";
	}
	

}