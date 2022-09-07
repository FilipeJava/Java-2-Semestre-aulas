package br.com.fiap.tillsRh.model;

public class HardSkill {
	// Atributos
	private int id;
	private String titulo;
	private String descricao;

	// Construtores

	public HardSkill() {
	};

	public HardSkill(String titulo, String descricao, int id) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.id = id;
	}

	// Getters e Setters
	
	public int getId() {
		return id;
	}

	public void setTipo(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
