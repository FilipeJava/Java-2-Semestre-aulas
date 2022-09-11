package br.com.tills.dungeonsdragons.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.tills.dungeonsdragons.model.Atributo;

/***
 * Classe Dao para a Classe Atributo
 * 
 * @author Till's Tech
 * @version 1.0
 */

public class AtributoDao {

	// inclui atributo na lista de atributos

	/***
	 * Lista para armazenar os atributos do objeto Personagem do tipo Atributo
	 */
	List<Atributo> atributo = new ArrayList<>();

	/**
	 * Realiza a inclusão do objeto Atributo na lista
	 * 
	 * @param atributo Objeto Atributo que sera incluido
	 */
	public void incluir(Atributo atributo) {

		this.atributo.add(atributo);

	}

	/**
	 * remove todo o conteudo da lista atributo instanciando um novo obj do tipo
	 * Atributo
	 */
	public void zerar() {
		atributo = new ArrayList<Atributo>();

	}

	public List<Atributo> getAtributoDao() {
		return this.atributo;
	}

}
