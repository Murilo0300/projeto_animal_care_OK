package br.com.animalcare.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.animalcare.bean.Adotante;
import br.com.animalcare.util.Conexao;

public class DaoAdotante {
	
private final Connection c;
	
	public DaoAdotante() throws SQLException, ClassNotFoundException {
		this.c = new Conexao().getConnection();
	}

	public Adotante inserir(Adotante adotante) throws SQLException, ClassNotFoundException {
		String sql = "INSERT INTO tb_adotante" + "(nome_adotante, cpf,  email, telefone, "
				+ "cep ,logradouro, numero, complemento, bairro, cidade,uf)" 
				+ " VALUES (?,?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		stmt.setString(1, adotante.getNome_adotante());
		stmt.setInt(2, adotante.getCpf());
		stmt.setString(3, adotante.getEmail());
		stmt.setString(4, adotante.getTelefone());
		stmt.setInt(5, adotante.getCep());
		stmt.setString(6, adotante.getLogradouro());
		stmt.setString(7, adotante.getNumero());
		stmt.setString(8, adotante.getBairro());
		stmt.setString(9, adotante.getComplemento());
		stmt.setString(10, adotante.getCidade());
		stmt.setString(11, adotante.getUf());

		stmt.executeUpdate();
		ResultSet rs = stmt.getGeneratedKeys();
		if (rs.next()) {
			int id = rs.getInt(1);
			adotante.setId_adotante(id);
		}
		stmt.close();
		return adotante;
	}

	public Adotante alterar(Adotante adotante) throws SQLException, ClassNotFoundException {
		String sql = "UPDATE tb_adotante SET nome_adotante = ?, cpf = ?, email = ?, "
				+ "telefone = ?, cep = ?,logradouro = ?, numero = ?, complemento = ?, "
				+ "bairro = ?, cidade = ?, uf = ?   WHERE id_adotante = ?";

		PreparedStatement stmt = c.prepareStatement(sql);

		stmt.setString(1, adotante.getNome_adotante());
		stmt.setInt(2, adotante.getCpf());
		stmt.setString(3, adotante.getEmail());
		stmt.setString(4, adotante.getTelefone());
		stmt.setInt(5, adotante.getCep());
		stmt.setString(6, adotante.getLogradouro());
		stmt.setString(7, adotante.getNumero());
		stmt.setString(8, adotante.getBairro());
		stmt.setString(9, adotante.getComplemento());
		stmt.setString(10, adotante.getCidade());
		stmt.setString(11, adotante.getUf());
		stmt.setInt(12, adotante.getId_adotante());

		stmt.execute();
		stmt.close();
		return adotante;
	}
	
	public Adotante buscar(Adotante adotante) throws SQLException, ClassNotFoundException {
		String sql = "SELECT * FROM tb_adotante WHERE id_adotante = ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);

		stmt.setInt(1, adotante.getId_adotante());

		ResultSet rsAdotante = stmt.executeQuery();
		Adotante retornoAdotante = null;
		while (rsAdotante.next()) {

			retornoAdotante = new Adotante(
					rsAdotante.getInt(1), 
					rsAdotante.getString(2), 
					rsAdotante.getInt(3), 
					rsAdotante.getString(4), 
					rsAdotante.getString(5), 
					rsAdotante.getInt(6), 
					rsAdotante.getString(7),
					rsAdotante.getString(8),
					rsAdotante.getString(9),
					rsAdotante.getString(10),
					rsAdotante.getString(11),
					rsAdotante.getString(12));
		}
		stmt.close();
		return retornoAdotante;
	}

	public Adotante excluir(Adotante adotante) throws SQLException, ClassNotFoundException {
		String sql = "DELETE FROM tb_adotante WHERE id_adotante = ?";

		PreparedStatement stmt = c.prepareStatement(sql);

		stmt.setInt(1, adotante.getId_adotante());

		stmt.execute();
		stmt.close();
		c.close();
		return adotante;
	}

	public List<Adotante> listar(Adotante adotEnt) throws SQLException, ClassNotFoundException {

		List<Adotante> listAdotante = new ArrayList<>();

		String sql = "SELECT * FROM tb_adotante WHERE nome_adotante LIKE ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);

		stmt.setString(1, "%" + adotEnt.getNome_adotante() + "%");

		ResultSet rsAdotante = stmt.executeQuery();

		while (rsAdotante.next()) {

			Adotante adotante = new Adotante(
					rsAdotante.getInt(1), 
					rsAdotante.getString(2), 
					rsAdotante.getInt(3), 
					rsAdotante.getString(4), 
					rsAdotante.getString(5), 
					rsAdotante.getInt(6), 
					rsAdotante.getString(7),
					rsAdotante.getString(8),
					rsAdotante.getString(9),
					rsAdotante.getString(10),
					rsAdotante.getString(11),
					rsAdotante.getString(12));

			listAdotante.add(adotante);
		}

		rsAdotante.close();
		stmt.close();
		return listAdotante;
	}
}
