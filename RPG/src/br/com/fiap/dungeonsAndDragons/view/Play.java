package br.com.fiap.dungeonsAndDragons.view;

import java.util.Scanner;

import br.com.fiap.dungeonsAndDragons.dao.Dao;
import br.com.fiap.dungeonsAndDragons.model.Atributo;
import br.com.fiap.dungeonsAndDragons.model.Item;
import br.com.fiap.dungeonsAndDragons.model.Personagem;

public class Play {

	public static void main(String[] args) {

		Dao dao = new Dao();
		Scanner entrada = new Scanner(System.in);
//
		int jow = 0;
		entrada.useDelimiter("[\r\n]+");

		System.out.println("Developed by Till's Tech.\nBem vindo ao Mundo de Dugeons & Dragons!!");
		
		
		System.out.print("Digite o nome do Jogador: ");

		String name = entrada.next();

		System.out.println(
				"------------------------------------------------------------\n\rPara comecar " + name + ", voce deve criar sua Guilda que pode conter ate 3 "
						+ "persoangens\n\r------------------------------------------------------------");

		System.out.print("1-Quantos personagens tera sua Guilda: ");
		int qtd = entrada.nextInt();
		System.out.print("Qual o nome da sua Guilda: ");
		String guilda = entrada.next();

		int i = 1;
		do {
			System.out.println("Guilda: " + guilda);
			System.out.println("Criacao do Personangem  " + i);

			int id = (int) (51 * Math.random() * 1000);

			System.out.print("Digite o nome de Do persoangem:");
			String nome = entrada.next();

			System.out.println("------------------Racas Disponiveis--------------------------------");
			System.out.println("Raças Disponíveis: Humano");
			System.out.println("Raças Disponíveis: Elfos");
			System.out.println("Raças Disponíveis: Anao");
			System.out.println("Raças Disponíveis: Halfling");
			System.out.println("Raças Disponíveis: Draconatos");
			System.out.println("Raças Disponíveis: Tiefling");
			System.out.println("Raças Disponíveis: Orc");

			System.out.print("Digite a Raca:");
			String raca = entrada.next();

			System.out.print("Digite a Classe:");
			String classe = entrada.next();

			System.out.println("Chegou a Hora de Definir o valor de atributos defina um valor de 1-10: ");

			System.out.print("id:1-Forca:");
			Atributo forca = new Atributo(1, "Forca", entrada.nextInt());
			dao.incluirAtributo(forca);

			System.out.print("id:2-Destreza:");
			Atributo destreza = new Atributo(2, "Destreza", entrada.nextInt());
			dao.incluirAtributo(destreza);

			System.out.print("id:3-Constituicao:");
			Atributo constituicao = new Atributo(3, "Constituicao", entrada.nextInt());
			dao.incluirAtributo(constituicao);

			System.out.print("id:4-Inletigencia:");
			Atributo inteligencia = new Atributo(4, "Inteligencia", entrada.nextInt());
			dao.incluirAtributo(inteligencia);

			System.out.print("id:5-Sabedoria:");
			Atributo sabedoria = new Atributo(5, "Sabedoria", entrada.nextInt());
			dao.incluirAtributo(sabedoria);

			System.out.print("id:6-Carisma:");
			Atributo carisma = new Atributo(6, "Carisma", entrada.nextInt());
			dao.incluirAtributo(carisma);

			System.out.println("Está na hora de incluir alguns items no seu inventário vamos lá?");

			String flag = "S";

			int cod = 1;
			do {

				System.out.print("Digite o nome do item:");
				String iName = entrada.next();

//				System.out.println("Digite A Quantidade idade");
				System.out.println("Digite a quantidade:");
				int iQtd = entrada.nextInt();

				System.out.println("Digite a descricao do Item");
				String iDes = entrada.next();

				Item item = new Item(cod, iName, iQtd, iDes);
				dao.incluirItem(item);
				
				System.out.println("Deseja incluir mais itens: S -sim | N-nao: ");
				flag = entrada.next();
				cod++;
			} while (flag.equalsIgnoreCase("S"));

			// instacia de personagem
			Personagem personagem = new Personagem(id, nome, raca, classe, guilda, 0, 0, dao.getAtributo(),
					dao.getItem());
			// dao de inclusao na lista de personagens
			dao.incluirPersonagem(personagem);

			i++;
		} while (i <= qtd);
		entrada.close();
	}// main

}// class
