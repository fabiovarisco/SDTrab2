package br.unisinos.sd.Trab2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JSPController {
	
	@RequestMapping("/index")
	public String home(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name, @RequestParam(value="n", required=false, defaultValue="100") String number) {
		Integer n = 100;
		try {
			n = Integer.parseInt(number);
		} catch (Exception e) {
			
		}
		model.addAttribute("name", name);
		model.addAttribute("randomNumbers", RestExamples.generateRandomNumbers(n));
        return "index";
    }

}
