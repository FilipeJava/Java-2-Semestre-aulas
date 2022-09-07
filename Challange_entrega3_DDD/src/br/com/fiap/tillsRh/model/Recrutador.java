package br.com.fiap.tillsRh.model;

import java.util.ArrayList;
import java.util.List;

public class Recrutador {
	
	//
	private int id;
	private String nome;
	private List<Contato> contato = new ArrayList<>();
	private String email;
	
	//contrutor
	public Recrutador() {}

	public Recrutador(int id, String nome, List<Contato> contato, String email) {
		this.id = id;
		this.nome = nome;
		this.contato = contato;
		this.email = email;
	}

	//getters and setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Contato> getContato() {
		return contato;
	}

	public void setContato(List<Contato> contato) {
		this.contato = contato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
