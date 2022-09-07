package br.com.fiap.tillsRh.model;

public class Experiencia {

	// Atributos
	private int id;
	private String titulo;
	private String dataInicio;
	private String dataFim;
	private String empresa;
	private String descricao;
	private boolean atual;

	// Construtores
	public Experiencia() {
	}

	public Experiencia(String titulo, String dataInicio, String dataFim, String empresa, String descricao,
			boolean atual, int id) {
		super();
		this.titulo = titulo;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.empresa = empresa;
		this.descricao = descricao;
		this.atual = atual;
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

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getAtual() {
		return atual;
	}

	public void setAtual(Boolean atual) {
		this.atual = atual;
	}
}
