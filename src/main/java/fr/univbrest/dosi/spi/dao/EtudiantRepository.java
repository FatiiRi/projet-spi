package fr.univbrest.dosi.spi.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.spi.bean.Etudiant;

public interface EtudiantRepository extends CrudRepository<Etudiant, String> {
	
	List<Etudiant> findByNomAndPrenom(String nom, String prenom);
	
	List<Etudiant> findByNationalite(String nationalite);
	

}
