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

	
	// inclui persoangem na lista de Personagem
	public void incluirPersonagem(Personagem personagem) {

		this.personagem.add(personagem);

	}
	// inclui atributo na lista de atributos
	public void incluirAtributo(Atributo atributo) {

		this.atributo.add(atributo);

	}
	// inclui item no inventario
	public void incluirItem(Item item) {

		this.item.add(item);

	}
	
	
	
		
	public List<Personagem> getPersonagem() {
		return personagem;
	}
	
	public List<Atributo> getAtributo() {
		return atributo;
	}

	public List<Item> getItem() {
		return item;
	}

	
	
	// método de exclusão por id de Persnagem 
	public void excluirPersoangem ( int id) {
		for (int i = 0; i < this.personagem.size(); i++) {
			if (this.personagem.get(i).getId()==id) {
				this.personagem.remove(i);
								
			}
			
		}
					
	}
		
	// método de Buscar  por id de Persnagem 
	public Personagem buscaPersonagem ( int id) {
			int index =0;
			
			for (int i = 0; i < this.personagem.size(); i++) {
				if (this.personagem.get(i).getId()== id){
					index = i;
				}
			}	
								
			return	this.personagem.get(index);
		}
	
	
	
	
	
	// metodo listar personagem
	
	public void listarPersonagem() {
		
		for (Personagem p :this.personagem ) {
			
			System.out.println(p);;
		}
	}
	
	
	// metodo de edição de nome
	public void alteraNome (int id, String nome) {
		for (Personagem p  : this.personagem) {
			if (p.getId()==id) {
				
				p.setNome(nome);
				
			}
		}
		
	}
	
	// pesquisar por classe
	public void listaClasse(String raca) {
		for (Personagem p : this.personagem) {
			if (p.getRaca().equalsIgnoreCase(raca)){
				
				System.out.println(p);
			}
			
		}
		
	}
	
				
				
	}//class
	
	
	
	


