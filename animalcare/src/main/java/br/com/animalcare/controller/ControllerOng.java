package br.com.animalcare.controller;

import java.sql.SQLException;
import java.util.List;

import br.com.animalcare.bean.Ong;
import br.com.animalcare.dao.DaoOng;

public class ControllerOng {
	
	DaoOng ongDao = null;
	
	public Ong inserir(Ong ong) throws SQLException, ClassNotFoundException{
		
		ongDao = new DaoOng();
		return ongDao.inserir(ong);
	}
	
	public Ong alterar(Ong ong) throws SQLException, ClassNotFoundException{
		
		ongDao = new DaoOng();
		return ongDao.alterar(ong);
	}
	
	public Ong excluir(Ong ong) throws SQLException, ClassNotFoundException{
		
		ongDao = new DaoOng();
		return ongDao.excluir(ong);
	}
	
	public Ong buscar(Ong ong) throws SQLException, ClassNotFoundException{
		
		ongDao = new DaoOng();
		return ongDao.buscar(ong);
	}
	
	public List<Ong> listar(Ong ong)throws SQLException, ClassNotFoundException{
		
		ongDao = new DaoOng();
		return ongDao.listar(ong);
	}
}
