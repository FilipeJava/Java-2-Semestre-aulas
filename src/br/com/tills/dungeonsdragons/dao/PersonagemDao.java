package br.com.tills.dungeonsdragons.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.tills.dungeonsdragons.exceptions.GildaLessThanOneException;
import br.com.tills.dungeonsdragons.exceptions.IdNotFoundException;
import br.com.tills.dungeonsdragons.exceptions.ClasseNotFoundException;
import br.com.tills.dungeonsdragons.jdbc.Conexao;
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
	List<Object> lista = new ArrayList<Object>();
	Connection con = null ;

	/**
	 * Realiza a inclusão do objeto Personagem na lista
	 * 
	 * @param personagem Objeto personagem que sera incluido
	 * @throws SQLException 
	 */

	public void incluir(Personagem personagem) throws SQLException {

		con=Conexao.conecta();
		
		PreparedStatement stmt = con.prepareStatement("INSERT INTO TB_PERSONAGEM"
				+ "(ID_PERSONAGEM,NM_PERSONAGEM,NM_RACA,NM_CLASSE,NM_GUILDA,"
				+ "VL_EXPERIENCIA,VL_LEVEL) VALUES (?, ?, ?, ?,	?,?,?)");
		
		stmt.setInt(1, personagem.getId());
		stmt.setString(2, personagem.getNome());
		stmt.setString(3, personagem.getRaca());
		stmt.setString(4, personagem.getClasse());
		stmt.setString(5, personagem.getGuilda());
		stmt.setInt(6, personagem.getExperiencia());
		stmt.setInt(7, personagem.getLevel());
		
		
		stmt.executeUpdate();
	
	}

	
	
//	public void incluir(Personagem personagem) {
//
//		this.personagem.add(personagem);
//
//	}

	/**
	 * Realiza a exclusão do objeto Personagem da lista
	 * 
	 * @param id Codigo de idenficicação do personagem
	 * @throws GildaLessThanOneException exception acionada caso a gilda possuir
	 *                                   somente um personagem
	 */

	public void deletar(int codigo) throws SQLException, IdNotFoundException,GildaLessThanOneException {
		// Criar o PreparedStatement com o comando SQL de delete
		PreparedStatement stmt = con.prepareStatement("delete from TB_PERSONAGEM where ID_PERSONAGEM = ?");

		// Setar o valor para a query
		stmt.setInt(1, codigo);

		// Executar a query
		int qtd = stmt.executeUpdate();

		// Verificar se algum registro foi apagado do banco
		if (qtd == 0)
			throw new IdNotFoundException("Id n�o encontrado para remo��o");
	}
	
	
private Personagem parse (ResultSet resultSet) throws SQLException {

		
		int id = resultSet.getInt("ID_PERSONAGEM");
		String nome = resultSet.getString("NM_PERSONAGEM");
		String raca = resultSet.getString("NM_RACA");
		String classe = resultSet.getString("NM_CLASSE");
		String guilda = resultSet.getString("NM_GUILDA");
		int experiencia = resultSet.getInt("VL_EXPERIENCIA");
		int level = resultSet.getInt("VL_LEVEL");
		

		// Instancia o filme com os dados
		Personagem personagem = new Personagem(id, nome, raca, classe, guilda, experiencia, level);

		return personagem ;

	}
	
	


	/**
	 * Realiza a busca do objeto Personagem na lista
	 * 
	 * @param id Codigo de idenficicação do personagem
	 * @return Personagem com base no id
	 */

public Personagem buscarPorId(int codigo) throws SQLException, IdNotFoundException {
	// Criar o PreparedStatement com o comando SQL de select
	PreparedStatement stmt = con.prepareStatement("select * from TB_PERSONAGEM where ID_PERSONAGEM = ?");

	// Setar o codigo do filme no comando SQL
	stmt.setInt(1, codigo);

	// Executar o comando SQL obtendo o ResultSet
	ResultSet result = stmt.executeQuery();

	// Verificar se encontrou um filme
	if (!result.next()) {
		throw new IdNotFoundException("Personagem não encontrado");
	}
	// Recuperar os dados do filme no ResultSet
	// int id = result.getInt("cd_filme");

	// Instancia o filme com os dados
	Personagem persona = parse(result);
	return persona;
}

	/**
	 * gera uma lista dos personagens
	 */
	public List<Personagem> listar() throws SQLException {
		// Criar o PreparedStatement com o comando SQL de select
		PreparedStatement stmt = con.prepareStatement("select * from TB_PERSONAGEM");

		// Executar o comando SQL e obter o ResultSet
		ResultSet result = stmt.executeQuery();

		
		List<Personagem> lista = new ArrayList<Personagem>();

		// Percorre todos os registros encontrados
		while (result.next()) {
			// Recupera os dados do filme no resultSet
			Personagem persona = parse(result);
			lista.add(persona);
		}

		// Retorna a lista de filme
		return lista;
	}

	/**
	 * Altera o nome do personagem
	 * 
	 * @param id   Codigo de identificação
	 * @param nome Nome que será incluido
	 * @throws SQLException 
	 * @throws IdNotFoundException 
	 */
	public void alteraNome(int id, String nome) throws SQLException, IdNotFoundException {
		
		
		PreparedStatement stmt = con.prepareStatement("update TB_PERSONAGEM set NM_PERSONAGEM = ? where ID_PERSONAGEM = ?");

		// Setar os valores na query
		stmt.setString(1,nome);
		stmt.setInt(2, id);
		
		
		
		// Executar a query e recuperar a qtd de linhas afetadas no banco
		int qtd = stmt.executeUpdate();

		// Verifica se algum registro foi modificado no banco
		if (qtd == 0)
			throw new IdNotFoundException("personagem n�o encontrado para atualiza��o");
		
					
	}
	
	
	
	

	/**
	 * Lista o personagem com base na raça
	 * 
	 * @param raca Raça que será utilizada como base na busca
	 */
	public Personagem buscarPorClasse(String classe) throws SQLException, ClasseNotFoundException {
		// Criar o PreparedStatement com o comando SQL de select
		PreparedStatement stmt = con.prepareStatement("select * from TB_PERSONAGEM where NM_CLASSE = ?");

		// Setar o codigo do filme no comando SQL
		stmt.setString(1, classe);

		// Executar o comando SQL obtendo o ResultSet
		ResultSet result = stmt.executeQuery();

		// Verificar se encontrou um filme
		if (!result.next()) {
			throw new ClasseNotFoundException("Personagem não encontrado com essa classe");
		}
		// Recuperar os dados do filme no ResultSet
		// int id = result.getInt("cd_filme");

		// Instancia o filme com os dados
		Personagem persona = parse(result);
		return persona;
	}

	/**
	 * exibir o nome
	 * 
	 * @param id Codigo de identificação
	 */
	public void nome(int id) {
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

	public String json() {
		int i = 0;
		String json = "[";

		while (i < personagem.size()) {
			if (i == personagem.size() - 1) {
					json += "{" + personagem.get(i).obj() + ",\"Itens\":[";
				
				int j = 0;
				while (j < personagem.get(i).getInventario().size()) {
					if (j == personagem.get(i).getInventario().size() - 1) {
						json += "{" + personagem.get(i).getInventario().get(j).obj() + "}],\"Atributos\": [{";
					} else {
						json += "{" + personagem.get(i).getInventario().get(j).obj() + "},";
					}
					j++;
				}
				j = 0;
				while (j < personagem.get(i).getListaAtributo().size()) {
					if (j == personagem.get(i).getListaAtributo().size() - 1) {
						json += personagem.get(i).getListaAtributo().get(j).obj() + "}]}]";
					} else {
						json += personagem.get(i).getListaAtributo().get(j).obj() + ",";
					}
					j++;
				}
			} // if
			else {
				int j = 0;
				json += "{" + personagem.get(i).obj() + ",\"Itens\":[";
				while (j < personagem.get(i).getInventario().size()) {
					if (j == personagem.get(i).getInventario().size() - 1) {
						json += "{" + personagem.get(i).getInventario().get(j).obj() + "}],\"Atributos\": [{";
					} else {
						json += "{" + personagem.get(i).getInventario().get(j).obj() + "},";
					}
					j++;
				}
				j = 0;
				while (j < personagem.get(i).getListaAtributo().size()) {
					if (j == personagem.get(i).getListaAtributo().size() - 1) {
						json += personagem.get(i).getListaAtributo().get(j).obj() + "}]},";
					} else {
						json += personagem.get(i).getListaAtributo().get(j).obj() + ",";
					}
					j++;

				}

			}
			i++;
		}

		return json;

	}

	public void gravar(String json, String nomeArquivo) throws IOException {

		PrintWriter write = new PrintWriter(new FileWriter(nomeArquivo + ".json"));

		write.println(json);

		write.close();
	}

}// class
