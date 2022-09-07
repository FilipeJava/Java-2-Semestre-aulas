package br.com.fiap.tillsRh.model;

import java.util.ArrayList;
import java.util.List;

public class Vaga {

	// Atributos
	private int id;
	private String titulo;
	private double salario;
	private String tipoContrato;
	private String descricao;
	private List<SoftSkill> listaSoft = new ArrayList<>();
	private List<HardSkill> listaHard = new ArrayList<>();

	// Construtores

	public Vaga() {
	}

	public Vaga(int id, String titulo, String tipoContrato, String descricao, List<SoftSkill> listaSoft,
			List<HardSkill> listaHard,double salario) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.tipoContrato = tipoContrato;
		this.descricao = descricao;
		this.listaSoft = listaSoft;
		this.listaHard = listaHard;
		this.salario = salario;
	}

	// getters and setters

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<SoftSkill> getListaSoft() {
		return listaSoft;
	}

	public void setListaSoft(List<SoftSkill> listaSoft) {
		this.listaSoft = listaSoft;
	}

	public List<HardSkill> getListaHard() {
		return listaHard;
	}

	public void setListaHard(List<HardSkill> listaHard) {
		this.listaHard = listaHard;
	}

}
