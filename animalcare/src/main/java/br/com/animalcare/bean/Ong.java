package br.com.animalcare.bean;

public class Ong {
	
	private int id_ong;
	private String nome_ong;
	private String email;
	private String telefone;
	private int cnpj;
	private int cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
	
	public Ong(String nome_ong, String email, String telefone, int cnpj, int cep, String logradouro, String numero,
			String complemento, String bairro, String cidade, String uf) {

		this.nome_ong = nome_ong;
		this.email = email;
		this.telefone = telefone;
		this.cnpj = cnpj;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}
	public Ong(int id_ong, String nome_ong, String email, String telefone, int cnpj, int cep, String logradouro,
			String numero, String complemento, String bairro, String cidade, String uf) {

		this.id_ong = id_ong;
		this.nome_ong = nome_ong;
		this.email = email;
		this.telefone = telefone;
		this.cnpj = cnpj;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}
	
	public Ong(int id_ong) {

		this.id_ong = id_ong;
	}
	public int getId_ong() {
		return id_ong;
	}
	public void setId_ong(int id_ong) {
		this.id_ong = id_ong;
	}
	public String getNome_ong() {
		return nome_ong;
	}
	public void setNome_ong(String nome_ong) {
		this.nome_ong = nome_ong;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
}
