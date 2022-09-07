package br.com.fiap.dungeonsAndDragons.dao;
//cadastrar,listar, pesquisar por código, editar, remover e pesquisar por algum outro atributo da classe Java Bean.
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.dungeonsAndDragons.model.Atributo;
import br.com.fiap.dungeonsAndDragons.model.Item;
import br.com.fiap.dungeonsAndDragons.model.Personagem;

public class Dao {

	List<Personagem> personagem = new ArrayList<>();
	List<Atributo> atributo = new ArrayList<>();
	List<Item> item = new ArrayList<>();
	
	public void incluirPersonagem(Personagem personagem) {

		this.personagem.add(personagem);

	}

	public void incluirAtributo(Atributo atributo) {

		this.atributo.add(atributo);
		

	}

	public void incluirItem(Item item) {

		this.item.add(item);
		System.out.println(item.getNome()+" adicionado com sucesso!");

	}

	public List<Atributo> getAtributo() {
		return atributo;
	}

	public List<Item> getItem() {
		return item;
	}

	// método de exclusão por id de Persnagem
	public void excluirPersoangem(int id) {
		for (int i = 0; i < this.personagem.size(); i++) {
			if (this.personagem.get(i).getId() == id) {
				this.personagem.remove(i);

			}

		}

	}

}// class
