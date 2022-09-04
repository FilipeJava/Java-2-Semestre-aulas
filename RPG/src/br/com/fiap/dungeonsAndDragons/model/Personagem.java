package br.com.fiap.dungeonsAndDragons.model;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.dungeonsAndDragons.dao.Dao;

public class Personagem extends Dao {
	
	private int id;
	private String nome;
	private String raca;
	private String classe;
	private int experiencia;
	private int level;
	private List<Atributo> listaAtributo = new ArrayList<>();
	private List<Item> inventario = new ArrayList<>();
	
	
	
	//costrutor padrao
	public Personagem() {
		
	}
	
	
	// construtor com fields
	public Personagem(int id, String nome, String raca, String classe, int experiencia, int level,
			List<Atributo> listaAtributo, List<Item> inventario) {
		super();
		this.id = id;
		this.nome = nome;
		this.raca = raca;
		this.classe = classe;
		this.experiencia = experiencia;
		this.level = level;
		this.listaAtributo = listaAtributo;
		this.inventario = inventario;
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


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public String getClasse() {
		return classe;
	}


	public void setClasse(String classe) {
		this.classe = classe;
	}


	public int getExperiencia() {
		return experiencia;
	}


	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public List<Atributo> getListaAtributo() {
		return listaAtributo;
	}


	public void setListaAtributo(List<Atributo> listaAtributo) {
		this.listaAtributo = listaAtributo;
	}


	public List<Item> getInventario() {
		return inventario;
	}


	public void setInventario(List<Item> inventario) {
		this.inventario = inventario;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}