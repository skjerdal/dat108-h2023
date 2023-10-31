package no.hvl.dat108;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistreringController {
	
	@RequestMapping(value = "/registrer")
	public String mottaRegistrering(Model model, 
			@RequestParam(name = "fornavn") String fornavn, 
			@RequestParam(name = "etternavn") String etternavn,
			@RequestParam(name = "aar") int aar) {
		
		Person person = new Person(fornavn, etternavn, aar);
		
		model.addAttribute("p", person);
		return "kvittering";
	}
	
	
}
