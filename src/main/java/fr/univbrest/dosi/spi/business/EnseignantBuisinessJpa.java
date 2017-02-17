package fr.univbrest.dosi.spi.business;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import fr.univbrest.dosi.spi.bean.Enseignant;
import fr.univbrest.dosi.spi.dao.EnseignantRepository;


@Component 
public class EnseignantBuisinessJpa implements EnseignantBuisiness{
	
	
	
 private EnseignantRepository Repo;
 
 @Autowired
 public EnseignantBuisinessJpa(EnseignantRepository Repo) {
	this.Repo = Repo;
}
	
 @Override
	public List<Enseignant> listerEnseignants(){
		return (List<Enseignant>) Repo.findAll();
		
	}
	
 @Override
	public Long CompterEnseignants(){
		return Repo.count();
		
	}

}
