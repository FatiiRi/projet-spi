package fr.univbrest.dosi.spi.business;


import static org.assertj.core.api.Assertions.assertThat;







import java.math.BigDecimal;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.univbrest.dosi.spi.AppTestConfig;
import fr.univbrest.dosi.spi.bean.Formation;
import fr.univbrest.dosi.spi.business.FormationBuisinessJpa;
import fr.univbrest.dosi.spi.business.FormationBusiness;
import fr.univbrest.dosi.spi.dao.FormationRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppTestConfig.class)

public class FormationBusinessTest {
	
	
	private FormationBuisinessJpa business;
	private FormationBusinessStub formationStub;
	

	
	@Before
	public void init(){
		this.formationStub = new FormationBusinessStub();
		this.business = new FormationBuisinessJpa(this.formationStub);
	}
	
	@Test
	public void doitCompterlesFormation(){
		long resultat = business.CompterFormations();
		
		assertThat(resultat).isEqualTo(2L);
	}
	
	@Test
	public void doitlisterFormations(){
		Iterable<Formation> resultats = business.listerFormations();
	
		
	}
	
	
	@Test
	public void doitRetournerUneFormation(){
		List<Formation> formation = business.troverFormationParNom("formation1");
		assertThat(formation.get(0).getNomFormation().equals("formation1"));
		
	}
	
	

}
