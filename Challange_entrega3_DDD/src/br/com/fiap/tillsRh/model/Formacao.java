package br.com.fiap.tillsRh.model;

public class Formacao {
	
	private int id;
	private String titulo;
	private String dataInicio;
	private String dataFim;
	private String instituicao;
	private String curso;
	private boolean cursando;

	public Formacao() {
	}

	public Formacao(String titulo, String dataInicio, String dataFim, String instituicao, String curso,
			boolean cursando, int id) {
		super();
		this.titulo = titulo;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.instituicao = instituicao;
		this.curso = curso;
		this.cursando = cursando;
		this.id = id;
	}

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

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public boolean isCursando() {
		return cursando;
	}

	public void setCursando(boolean cursando) {
		this.cursando = cursando;
	}
}
