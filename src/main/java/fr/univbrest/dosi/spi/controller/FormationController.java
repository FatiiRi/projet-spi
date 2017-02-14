package fr.univbrest.dosi.spi.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.spi.bean.Formation;
import fr.univbrest.dosi.spi.business.FormationBusiness;


@RestController
@RequestMapping(value="/formation")
public class FormationController {
	
	
	private FormationBusiness business;
	
	
	@Autowired
	public FormationController(FormationBusiness formationBusiness){
		
		this.business = formationBusiness;
	
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Formation> getFormations(){
		return business.listerFormations();
	}
	
	@RequestMapping(value="/{codeformation}",method= RequestMethod.GET)
	public Formation findByCodeFormation(
			@PathVariable("codeformation") final String codeFormation) {
		return this.business.trouverFormation(codeFormation);
	}
	
	@RequestMapping(value="/nbformations")
	public Long Count()
	{
		return business.CompterFormations();
	}
	
	
	
	
	

}
