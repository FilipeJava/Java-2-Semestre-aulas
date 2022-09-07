package br.com.fiap.tillsRh.model;

public class Contato {
	// Atributos

	private int id;
	private String tipo;
	private String descricao;
	private String telefone;
	private String email;

	// Construtores
	public Contato() {
	}

	public Contato(int id, String tipo, String descricao, String telefone, String email) {
		this.tipo = tipo;
		this.descricao = descricao;
		this.id = id;
		this.telefone = telefone;
		this.email = email;
	}

	// Getters e Setters

	public String setEmail(String email) {
		return email;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setTipo(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
