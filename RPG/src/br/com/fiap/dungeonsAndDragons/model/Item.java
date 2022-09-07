package br.com.fiap.dungeonsAndDragons.model;

public class Item {

	private int id;
	private String nome;
	private int quantidade;
	private String descricao;

	public Item() {
	}

	public Item(int id, String nome, int quantidade, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

}
