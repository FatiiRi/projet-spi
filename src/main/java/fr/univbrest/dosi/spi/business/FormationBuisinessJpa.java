package fr.univbrest.dosi.spi.business;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.univbrest.dosi.spi.bean.Formation;
import fr.univbrest.dosi.spi.bean.Promotion;
import fr.univbrest.dosi.spi.bean.UniteEnseignement;
import fr.univbrest.dosi.spi.dao.FormationRepository;

@Component 
public class FormationBuisinessJpa implements FormationBusiness{
	
	
	
 private FormationRepository formationRepo;
 
 @Autowired
 public FormationBuisinessJpa(FormationRepository formationRepo) {
	this.formationRepo = formationRepo;
}

 @Override
public void créerFormation(Formation f){
		
		formationRepo.save(f);	
	}
	
 @Override
	public List<Formation> listerFormations(){
		return (List<Formation>) formationRepo.findAll();
		
	}
	
 @Override
	public Long CompterFormations(){
		return formationRepo.count();
		
	}
	
 @Override
	public void supprimerFormation(Formation f){
		formationRepo.delete(f);
		
	}
	
 @Override
	public Formation trouverFormation(String code){
		return formationRepo.findOne(code);
		
	}

	@Override
	public List<Formation> troverFormationParNom(String nom) {
		
		return formationRepo.findByNomFormation(nom);
	}

	@Override
	public void updateFromation(Formation f) {
		formationRepo.save(f);
		
	}

}
