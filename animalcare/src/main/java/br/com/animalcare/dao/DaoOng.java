package br.com.animalcare.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.animalcare.bean.Ong;
import br.com.animalcare.util.Conexao;

public class DaoOng {
	
private final Connection c;
	
	public DaoOng() throws SQLException, ClassNotFoundException {
		this.c = new Conexao().getConnection();
	}

	public Ong inserir(Ong ong) throws SQLException {
		String sql = "INSERT INTO tb_ong" + "(nome_ong,  email, telefone, "
				+ "cnpj, cep, logradouro, numero, complemento ,bairro, cidade,uf)" 
				+ "VALUES (?,?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		stmt.setString(1, ong.getNome_ong());
		stmt.setString(2, ong.getEmail());
		stmt.setString(3, ong.getTelefone());
		stmt.setInt(4, ong.getCnpj());
		stmt.setInt(5, ong.getCep());
		stmt.setString(6, ong.getLogradouro());
		stmt.setString(7, ong.getNumero());
		stmt.setString(8, ong.getComplemento());
		stmt.setString(9, ong.getBairro());
		stmt.setString(10, ong.getCidade());
		stmt.setString(11, ong.getUf());

		stmt.executeUpdate();
		ResultSet rs = stmt.getGeneratedKeys();
		if (rs.next()) {
			int id = rs.getInt(1);
			ong.setId_ong(id);
		}
		stmt.close();
		return ong;
	}

	public Ong alterar(Ong ong) throws SQLException, ClassNotFoundException {
		String sql = "UPDATE tb_ong SET nome_ong = ?, email = ?, telefone = ?, cnpj = ?,"
				+ "cep = ?,logradouro = ?, numero = ?, complemento = ?, bairro = ?, cidade = ?, uf = ?" 
				+ "WHERE id_ong = ?";

		PreparedStatement stmt = c.prepareStatement(sql);

		stmt.setString(1, ong.getNome_ong());
		stmt.setString(2, ong.getEmail());
		stmt.setString(3, ong.getTelefone());
		stmt.setInt(4, ong.getCnpj());
		stmt.setInt(5, ong.getCep());
		stmt.setString(6, ong.getLogradouro());
		stmt.setString(7, ong.getNumero());
		stmt.setString(8, ong.getComplemento());
		stmt.setString(10, ong.getBairro());
		stmt.setString(11, ong.getCidade());
		stmt.setString(12, ong.getUf());
		stmt.setInt(13, ong.getId_ong());

		stmt.execute();
		stmt.close();
		return ong;
	}

	public Ong buscar(Ong ong) throws SQLException, ClassNotFoundException {
		String sql = "SELECT * FROM tb_ong WHERE id_ong = ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);

		stmt.setInt(1, ong.getId_ong());

		ResultSet rsOng = stmt.executeQuery();
		Ong retornoOng = null;
		while (rsOng.next()) {

			retornoOng = new Ong(
					rsOng.getInt(1), 
					rsOng.getString(2), 
					rsOng.getString(3), 
					rsOng.getString(4), 
					rsOng.getInt(5), 
					rsOng.getInt(6), 
					rsOng.getString(7),
					rsOng.getString(8),
					rsOng.getString(9),
					rsOng.getString(10),
					rsOng.getString(11),
					rsOng.getString(12));
		}
		stmt.close();
		return retornoOng;
	}
	
	public Ong excluir(Ong ong) throws SQLException, ClassNotFoundException {
		String sql = "DELETE FROM tb_ong WHERE id_ong = ?";

		PreparedStatement stmt = c.prepareStatement(sql);

		stmt.setInt(1, ong.getId_ong());

		stmt.execute();
		stmt.close();
		c.close();
		return ong;
	}

	public List<Ong> listar(Ong ongEnt) throws SQLException, ClassNotFoundException {

		List<Ong> listOng = new ArrayList<>();

		String sql = "SELECT * FROM tb_ong WHERE nome_ong LIKE ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);

		stmt.setString(1, "%" + ongEnt.getNome_ong() + "%");

		ResultSet rsOng = stmt.executeQuery();

		while (rsOng.next()) {

			Ong ong = new Ong(
					rsOng.getInt(1), 
					rsOng.getString(2), 
					rsOng.getString(3), 
					rsOng.getString(4), 
					rsOng.getInt(5), 
					rsOng.getInt(6), 
					rsOng.getString(7),
					rsOng.getString(8),
					rsOng.getString(9),
					rsOng.getString(10),
					rsOng.getString(11),
					rsOng.getString(12));

			listOng.add(ong);
		}

		rsOng.close();
		stmt.close();
		return listOng;
	}
}
