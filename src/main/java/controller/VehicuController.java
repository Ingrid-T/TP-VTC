package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import data.VehiculeDAO;
import model.Vehicule;

@Controller
public class VehicuController {
	
	@Autowired
	private VehiculeDAO vehiculeDAO;
	

	@GetMapping("/vehicule")
	public String showVehicule (Model model) {
		model.addAttribute("vehiculist", vehiculeDAO.findAll());
		model.addAttribute("vehicule", new Vehicule());
		return "Vehicule";
	}
	
	@PostMapping("/vehicule")
	public String getVehicule (@ModelAttribute Vehicule newVehicule) {
		Vehicule vehicule = new Vehicule(newVehicule.getCouleur(), newVehicule.getImmatriculation(), newVehicule.getMarque(), newVehicule.getModele());
		vehiculeDAO.save(vehicule);
		return "Vehicule";
	}
	
}
