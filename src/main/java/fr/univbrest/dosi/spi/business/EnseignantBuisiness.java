package fr.univbrest.dosi.spi.business;

import java.util.List;

import fr.univbrest.dosi.spi.bean.Enseignant;

public interface EnseignantBuisiness {

	Long CompterEnseignants();
	List<Enseignant> listerEnseignants();
}
