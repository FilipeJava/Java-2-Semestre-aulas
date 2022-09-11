package br.com.tills.dungeonsdragons.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.tills.dungeonsdragons.exceptions.InputLessOrEqualThenZeroException;
import br.com.tills.dungeonsdragons.model.Atributo;
import br.com.tills.dungeonsdragons.model.Item;
import br.com.tills.dungeonsdragons.model.Personagem;

/***
 * Classe Dao para a Classe Personagem
 * 
 * @author Till's Tech
 * @version 1.0
 */
public class PersonagemDao {
	/***
	 * Lista para armazenar os atributos do objeto Personagem do tipo Personagem
	 */
	List<Personagem> personagem = new ArrayList<>();

	/**
	 * Realiza a inclusão do objeto Personagem na lista
	 * 
	 * @param personagem Objeto personagem que sera incluido
	 */

	public void incluir(Personagem personagem) {

		this.personagem.add(personagem);

	}

	/**
	 * Realiza a exclusão do objeto Personagem da lista
	 * 
	 * @param id Codigo de idenficicação do personagem
	 */

	public void excluir(int id) {
		if (id < 0) {
			throw new InputLessOrEqualThenZeroException("Valor deve ser maior que zero.");
		}

		for (int i = 0; i < personagem.size(); i++) {
			if (personagem.get(i).getId() == id) {
				personagem.remove(i);
				System.out.println("Personagem removido!");

			} else if ((personagem.get(i).getId() != id) && i == personagem.size() - 1) {
				System.out.println("Personagem não encontrado!");
			}

		}
	}

	/**
	 * Realiza a busca do objeto Personagem na lista
	 * 
	 * @param id Codigo de idenficicação do personagem
	 * @return Personagem com base no id
	 */

	public String buscar(int id) {
		if (id < 0) {
			throw new InputLessOrEqualThenZeroException("Valor deve ser maior que zero.");
		}
		String personagem = "";
		String n = "Personagem não encontrado!";
		int i = 0;
		while (i < this.personagem.size()) {
			if (this.personagem.get(i).getId() == id) {
				personagem += this.personagem.get(i);
				return personagem;
			} else {
				i++;
			}

		}
		return n;
	}

	/**
	 * gera uma lista dos personagens
	 */
	public void listar() {
		System.out.println("Segue abaixo os personegens criados.");
		for (Personagem p : this.personagem) {

			System.out.println(p);
		}
	}

	/**
	 * Altera o nome do personagem
	 * 
	 * @param id   Codigo de identificação
	 * @param nome Nome que será incluido
	 */
	public void alteraNome(int id, String nome) {
		if (id < 0) {
			throw new InputLessOrEqualThenZeroException("Valor deve ser maior que zero.");
		}
		for (Personagem p : this.personagem) {
			if (p.getId() == id) {
				p.setNome(nome);
			} else {
				System.out.println("Personagem não encontrado!");
			}
		}
	}

	/**
	 * Lista o personagem com base na raça
	 * 
	 * @param raca Raça que será utilizada como base na busca
	 */
	public void listaClasse(String raca) {
		for (Personagem p : this.personagem) {
			if (p.getRaca().equalsIgnoreCase(raca)) {

				System.out.println(p);
			} else {
				System.out.println("Personagem não encontrado!");
			}

		}

	}

	/**
	 * exibir o nome
	 * 
	 * @param id Codigo de identificação
	 */
	public void nome(int id) {
		if (id < 0) {
			throw new InputLessOrEqualThenZeroException("Valor deve ser maior que zero.");
		}
		int i = 0;
		while (i < personagem.size()) {
			if (personagem.get(i).getId() == id) {
				System.out.println("Personagem: " + personagem.get(i).getNome() + "\n");
			}
			i++;
		}
	}

	/**
	 * 
	 * @param id
	 * @return retorna a lista de atributos com base no id
	 */
	public String listarAtributos(int id) {
		if (id < 0) {
			throw new InputLessOrEqualThenZeroException("Valor deve ser maior que zero.");
		}
		String atributo = "";
		String negativa = "Personagem não encontrado!!";
		int i = 0;
		while (i < personagem.size()) {
			if (personagem.get(i).getId() == id) {
				for (Atributo a : personagem.get(i).getListaAtributo()) {
					atributo += a + "\n";
				}
				return atributo;

			} else {
				i++;
			}

		}
		return negativa;
	}

	/**
	 * Coleta a lista de itens
	 * 
	 * @param id Codigo de identificação
	 * @return Retorna a lista de itens com base no id
	 */
	public String iventario(int id) {
		if (id < 0) {
			throw new InputLessOrEqualThenZeroException("Valor deve ser maior que zero.");
		}
		String item = "";
		String negativa = "Personagem não encontrado!!";
		int i = 0;
		while (i < personagem.size()) {
			if (personagem.get(i).getId() == id) {
				for (Item itens : personagem.get(i).getInventario()) {
					item += itens + "\n";
				}
				return item;

			} else {
				i++;
			}

		}
		return negativa;

	}
}// class
