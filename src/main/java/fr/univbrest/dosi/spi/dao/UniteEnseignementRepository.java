package fr.univbrest.dosi.spi.dao;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.spi.bean.UniteEnseignement;
import fr.univbrest.dosi.spi.bean.UniteEnseignementPK;

public interface UniteEnseignementRepository extends CrudRepository<UniteEnseignement,UniteEnseignementPK> {

}
