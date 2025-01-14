/*
 * Dette er et eksempel på en Spring MVC Controller.
 * 
 * En controller sin rolle i en web-applikasjon er å ta imot
 * requests (forespørsler) fra web-klienter (f.eks. weblesere).
 * 
 * I eksemplet så vi på hvordan vi får tak i request-parameteren "person",
 * og hvordan vi kan gi svar via 3 ulike responstyper (text/plain, 
 * application/json og text/html).
 * 
 * Vanligvis vil en web-applikasjon ha mange controllere ...
 */
package no.hvl.dat108;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HalloController {

	@GetMapping(value = "/teksthilsen", produces = "text/plain")
	@ResponseBody //Betyr at responsen er direkte fra returverdien herfra.
	public String plainHallo(@RequestParam String person) {
		return "Hallo " + person + "!";
	}
	
	@GetMapping(value = "/jsonhilsen")
	@ResponseBody //Betyr at responsen er direkte fra returverdien herfra.
	public Hilsen jsonHallo(@RequestParam String person) {
		return new Hilsen(person);
	}
	
	//Uten @ResponseBody vil returverdien være navnet på Viewet.
	//Her ser vi altså hvordan Model-View-Controller gjøres i Spring MVC. 
	@GetMapping(value = "/htmlhilsen")
	public String htmlHallo(Model model, @RequestParam String person) {
		model.addAttribute("person", person); //Modellen fylles med data
		return "hilsen"; 	//Navnet på viewet. Se application.properties
							//for hvilket filnavn dette mappes til.
	}
	


}
