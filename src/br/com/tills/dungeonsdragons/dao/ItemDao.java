package br.com.tills.dungeonsdragons.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.tills.dungeonsdragons.model.Item;

/***
 * Classe Dao para a Classe Item
 * 
 * @author Till's Tech
 * @version 1.0
 */

public class ItemDao {
	/***
	 * Lista para armazenar os atributos do objeto Personagem do tipo Item
	 */
	List<Item> item = new ArrayList<>();

	/**
	 * Realiza a inclusão do objeto Item na lista
	 * 
	 * @param item Objeto item que sera incluido
	 */

	public void incluirItem(Item item) {

		this.item.add(item);

	}

	/**
	 * remove todo o conteudo da lista item instanciando um novo obj do tipo
	 * Item
	 */

	public void zerar() {
		item = new ArrayList<Item>();
	}

	
	public List<Item> getItem() {
		return item;
	}

}
