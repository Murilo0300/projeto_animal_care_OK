package br.com.animalcare.bean;

public class Adotante {
	
	private int id_adotante;
	private String nome_adotante;
	private int cpf;
	private String email;
	private String telefone;
	private int cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
	
	public Adotante(String nome_adotante, int cpf, String email, String telefone, int cep, String logradouro,
			String numero, String complemento, String bairro, String cidade, String uf) {
		super();
		this.nome_adotante = nome_adotante;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}

	public Adotante(int id_adotante, String nome_adotante, int cpf, String email, String telefone, int cep,
			String logradouro, String numero, String complemento, String bairro, String cidade, String uf) {

		this.id_adotante = id_adotante;
		this.nome_adotante = nome_adotante;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}
	
	public Adotante(int id_adotante) {

		this.id_adotante = id_adotante;
	}
	
	public Adotante() {

	}

	public int getId_adotante() {
		return id_adotante;
	}

	public void setId_adotante(int id_adotante) {
		this.id_adotante = id_adotante;
	}

	public String getNome_adotante() {
		return nome_adotante;
	}

	public void setNome_adotante(String nome_adotante) {
		this.nome_adotante = nome_adotante;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
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
