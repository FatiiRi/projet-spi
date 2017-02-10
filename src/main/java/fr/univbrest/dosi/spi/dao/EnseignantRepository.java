package fr.univbrest.dosi.spi.dao;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.spi.bean.Enseignant;

public interface EnseignantRepository extends CrudRepository<Enseignant,Long> {

}
