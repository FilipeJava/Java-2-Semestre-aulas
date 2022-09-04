package br.com.fiap.dungeonsAndDragons.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.dungeonsAndDragons.model.Atributo;
import br.com.fiap.dungeonsAndDragons.model.Item;
import br.com.fiap.dungeonsAndDragons.model.Personagem;

public class Dao {

	List<Personagem> personagem = new ArrayList<>();
	List<Atributo> atributo = new ArrayList<>();
	List<Item> item = new ArrayList<>();

	
	
	public void incluir(Personagem personagem) {

		this.personagem.add(personagem);

	}

	public void incluir(Atributo atributo) {

		this.atributo.add(atributo);

	}

	public void incluir(Item item) {

		this.item.add(item);

	}
	
	
	
	public void excluir ( int id) {
		for (int i = 0; i < this.personagem.size(); i++) {
			if (this.personagem.get(i).getId()==id) {
				this.personagem.remove(i);
								
			}
			
		}
				
				
	}
	
	
	
	

}
