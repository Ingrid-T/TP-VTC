package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import data.ConducteurDAO;
import model.Conducteur;

@Controller
public class ConductController {
	
		@Autowired
		private ConducteurDAO conducteurDAO;
		
		@GetMapping("/")
		public String Home() {
			return "Conducteur";
		}
	
		@GetMapping("/conducteur")
		public String showConducteur (Model model) {
			model.addAttribute("conductlist", conducteurDAO.findAll());
			model.addAttribute("conducteur", new Conducteur());
			return "Conducteur";
		}
		
		@PostMapping("/conducteur")
		public String getConducteur (@ModelAttribute Conducteur newConducteur) {
			Conducteur conducteur = new Conducteur(newConducteur.getNom(), newConducteur.getPrenom());
			conducteurDAO.save(conducteur);
			return "Conducteur";
		}
}


