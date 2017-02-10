package fr.univbrest.dosi.spi.dao;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.spi.bean.Formation;

public interface FormationRepository extends CrudRepository<Formation,String> {
 
	List<Formation> findByNomFormation(String nomFormation);
	
}
