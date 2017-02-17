package fr.univbrest.dosi.spi.business;

import java.util.List;

import fr.univbrest.dosi.spi.bean.Formation;

public interface FormationBusiness {

	 void créerFormation(Formation f);
	 void updateFromation(Formation f);
	 List<Formation> listerFormations();
	 Long CompterFormations();
	 void supprimerFormation(Formation f);
	 public Formation trouverFormation(String code);
	 public List<Formation> troverFormationParNom(String nom);
		 
}
