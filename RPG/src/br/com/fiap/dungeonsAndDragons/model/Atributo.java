package br.com.fiap.dungeonsAndDragons.model;

public class Atributo {

	private int id;
	private String nome;
	private int valor;

	public Atributo() {
	}

	public Atributo(int id, String nome, int valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

}
