package br.com.animalcare.controller;

import java.sql.SQLException;
import java.util.List;

import br.com.animalcare.bean.Adotante;
import br.com.animalcare.dao.DaoAdotante;

public class ControllerAdotante {
	
	DaoAdotante adotanteDao = null;
	
	public Adotante inserir (Adotante adotante) throws SQLException, ClassNotFoundException {
		
		adotanteDao = new DaoAdotante();
		return adotanteDao.inserir(adotante);
	}
	
	public Adotante alterar(Adotante adotante) throws SQLException, ClassNotFoundException{
		adotanteDao = new DaoAdotante();
		return adotanteDao.alterar(adotante);
	}
	
	public Adotante excluir(Adotante adotante)throws SQLException, ClassNotFoundException{
		adotanteDao = new DaoAdotante();
		return adotanteDao.excluir(adotante);
	}
	
	public Adotante buscar(Adotante adotante) throws SQLException, ClassNotFoundException{
		adotanteDao = new DaoAdotante();
		return adotanteDao.buscar(adotante);
	}

	public List<Adotante> listar(Adotante adotante)throws SQLException, ClassNotFoundException{
		adotanteDao = new DaoAdotante();
		return adotanteDao.listar(adotante);
	}
}
