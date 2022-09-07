package br.com.fiap.tillsRh.model;

public class SoftSkill {

	// Atributos

	private int id;
	private String softSkill;

	// Construtores
	public SoftSkill() {
	}

	public SoftSkill(String softSkill, int id) {
		this.softSkill = softSkill;
		this.id = id;
	}

	// Getters e Setters

	public int getId() {
		return id;
	}

	public void setTipo(int id) {
		this.id = id;
	}

	public String getsoftSkill() {
		return softSkill;
	}

	public void setsoftSkill(String softSkill) {
		this.softSkill = softSkill;
	}

}
