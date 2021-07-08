package ernadas_simboliai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
		
	@RequestMapping(path="/kulturos-tvarkymas", method={ RequestMethod.GET, RequestMethod.POST })
	public String kulturosForma (
			@RequestParam(name="id", required=false, defaultValue="0") String id 	
			, @RequestParam(name="pav", required=false, defaultValue="") String pav
			, @RequestParam(name="pradzia", required=false, defaultValue="") String pradzia	
			, @RequestParam(name="pabaiga", required=false, defaultValue="") String pabaiga
			, @RequestParam(name="plotas_teritorijos", required=false, defaultValue="1") String plotas_teritorijos
			, @RequestParam(name="skaicius_artefaktu", required=false, defaultValue="0") String skaicius_artefaktu
			, @RequestParam(name="aprasymas", required=false, defaultValue="") String aprasymas
			, @RequestParam(name="elementai_egzistuoja", required=false, defaultValue="0") String elementai_egzistuoja_dabar			
			, @RequestParam(name="saugoti", required=false, defaultValue="nesaugoti") String saugoti
			
		) {
		
		if ( ( saugoti != null ) && saugoti.equals ("saugoti") ) {
			
		}
		
		return "kulturos_forma";
	}
}
