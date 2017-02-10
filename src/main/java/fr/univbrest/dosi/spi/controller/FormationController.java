package fr.univbrest.dosi.spi.controller;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.spi.bean.Formation;

import fr.univbrest.dosi.spi.business.FormationBusiness;


@RestController
public class FormationController {
	
	
	private FormationBusiness business;
	
	
	@Autowired
	public FormationController(FormationBusiness formationBusiness){
		
		this.business = formationBusiness;
	
	}
	
	@RequestMapping(value="/formation")
	public List<Formation> getFormations(){
		return business.listerFormations();
	}
	
	@RequestMapping(value="/nbformations")
	public Long Count()
	{
		return business.CompterFormations();
	}
	
	
	
	
	

}
