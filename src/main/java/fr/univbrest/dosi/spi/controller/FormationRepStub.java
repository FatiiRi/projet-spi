package fr.univbrest.dosi.spi.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


import fr.univbrest.dosi.spi.bean.Formation;
import fr.univbrest.dosi.spi.dao.FormationRepository;

public class FormationRepStub implements FormationRepository{
	
	private  List<Formation> formations = new ArrayList();
	
	public FormationRepStub(){
	Formation f1 = new Formation("F1",null,"DOSI","Oui",null,BigDecimal.valueOf(2L),"formation1");
	Formation f2 = new Formation("F2",null,"DOSI","Oui",null,BigDecimal.valueOf(2L),"formation2");
	this.formations.add(f1);
	this.formations.add(f2);
	}

	@Override
	public long count() {
		
		return this.formations.size();
	}

	@Override
	public void delete(String arg0) {
		for(Formation formation : this.formations){
			if(formation.getCodeFormation()==arg0){
				this.formations.remove(formation);
				break;
			}
		}	
	}

	@Override
	public void delete(Formation arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Formation> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Formation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Formation> findAll(Iterable<String> arg0) {
		
		return this.formations;
	}

	@Override
	public Formation findOne(String arg0) {
		Formation f = new Formation();
		for(Formation formation : this.formations){
			if(formation.getCodeFormation()==arg0){
				 f = formation;
				break;
			}
		}	
		return f;
	}

	@Override
	public <S extends Formation> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Formation> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Formation> findByNomFormation(String nomFormation) {
		List<Formation> f = new ArrayList<Formation>();
		for(Formation formation : this.formations){
			if(formation.getNomFormation()==nomFormation){
				 f.add(formation);
				break;
			}
		}	
		return f;
	}

}
