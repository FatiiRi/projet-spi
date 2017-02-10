package fr.univbrest.dosi.spi.dao;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.spi.bean.ElementConstitutif;
import fr.univbrest.dosi.spi.bean.ElementConstitutifPK;

public interface ElementConstitutifRepository extends CrudRepository<ElementConstitutif,ElementConstitutifPK> {
	ElementConstitutif findByDesignation(String designation);
}
