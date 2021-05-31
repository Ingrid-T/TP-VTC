package model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Association {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_association;
	private String conducteur;
	private String vehicule;

}
