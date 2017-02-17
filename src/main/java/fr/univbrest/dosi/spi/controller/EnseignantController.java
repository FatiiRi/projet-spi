package fr.univbrest.dosi.spi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.spi.bean.Enseignant;
import fr.univbrest.dosi.spi.business.EnseignantBuisiness;

@RestController
@RequestMapping(value="/enseignants")
public class EnseignantController {
	
	private EnseignantBuisiness business;
	
	@Autowired
	public EnseignantController(EnseignantBuisiness enseignantBuisiness){
		this.business = enseignantBuisiness;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Enseignant> getFormations(){
		return business.listerEnseignants();
	}
	
	@RequestMapping(value="/nbEnseignats")
	public Long Count()
	{
		return business.CompterEnseignants();
	}

}
