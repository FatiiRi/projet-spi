package fr.univbrest.dosi.spi.dao;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.spi.bean.Promotion;
import fr.univbrest.dosi.spi.bean.PromotionPK;

public interface PromotionRepository extends CrudRepository<Promotion,PromotionPK> {

	
}
