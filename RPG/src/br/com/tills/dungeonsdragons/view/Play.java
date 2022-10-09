package br.com.tills.dungeonsdragons.view;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.tills.dungeonsdragons.dao.AtributoDao;
import br.com.tills.dungeonsdragons.dao.ItemDao;
import br.com.tills.dungeonsdragons.dao.PersonagemDao;
import br.com.tills.dungeonsdragons.exceptions.GildaLessThanOneException;
import br.com.tills.dungeonsdragons.exceptions.InputLessOrEqualThanZeroException;
import br.com.tills.dungeonsdragons.exceptions.SNException;
import br.com.tills.dungeonsdragons.model.Atributo;
import br.com.tills.dungeonsdragons.model.Item;
import br.com.tills.dungeonsdragons.model.Personagem;

/***
 * Classe que exibe/coleta as informações do programa e realiza o input de dados
 * do usuario
 * 
 * @author Till's Tech
 * @version 1.0
 */

public class Play {

	public static void main(String[] args) {

		PersonagemDao personagemDao = new PersonagemDao();

		ItemDao itemDao = new ItemDao();

		AtributoDao atributo = new AtributoDao();

		Scanner entrada = new Scanner(System.in);

		entrada.useDelimiter("[\r\n]+");

		System.out.println("Developed by Till's Tech.");

		System.out.println("Bem vindo ao nosso prototipo em JAVA de RPG do mundo Dugeons & Dragons!");
		System.out.print("Poderia informar o nome do jogador: ");

		String name = entrada.next();

		System.out.println("------------------------------------------------------------\r\nBoooa " + name
				+ "!! Para inicar o jogo voce deve criar sua Guilda. "
				+ "\r\n------------------------------------------------------------");
		criarPersonagem(personagemDao, itemDao, atributo, entrada);

		menuPersonagem(personagemDao, entrada);

		System.out.println(
				"Obrigado por testar nossa alfa do nosso protipo D&D!!\nFique antenado para novos updates.\nAté breve!!");

		entrada.close();
	}// main

	private static void menuPersonagem(PersonagemDao personagemDao, Scanner entrada) {
		System.out.println(
				"Antes de iniciarmos nossa jornada, gostariamos de confirmar se os dados preenchidos estão corretos. \r");
		System.out.println("Segue abaixo as funções disponiveis:\r");

		String menuMetodos = "1-Excluir personagem\n2-Realizar busca do personagem\n3-Listar o(s) personagem(s)\n4-Alterar o nome do personagem\n5-Listar os atributos do personagem\n6-listar os personagens utilizando a classe\n7-Listar iventario\n8-Gerar JSON";

		String resposta = "s";
		int rmetodo;
		while (resposta.equalsIgnoreCase("s")) {
			while (true) {
				try {
					System.out.println(menuMetodos + "\n");
					System.out.println("selecione uma das opções: ");
					rmetodo = entrada.nextInt();
					if (rmetodo <= 0) {
						throw new InputLessOrEqualThanZeroException();

					}
					break;
				} catch (InputMismatchException e) {
					entrada.next();
					System.out.println("Escrever somente números!");

				} catch (InputLessOrEqualThanZeroException e) {
					System.out.println("Valor deve ser maior que zero!");
				}
			}
			switch (rmetodo) {

			case 1: // 1-Excluir personagem
				while (true) {
					try {
						System.out.println("Digite o numero de identificação do personangem (id): ");
						rmetodo = entrada.nextInt();
						if (rmetodo <= 0) {
							throw new InputLessOrEqualThanZeroException();
						}
						personagemDao.excluir(rmetodo);
						break;
					} catch (InputMismatchException e) {
						entrada.next();
						System.out.println("Escrever somente números!");

					} catch (InputLessOrEqualThanZeroException e) {
						System.out.println("Valor deve ser maior que zero!");
					} catch (GildaLessThanOneException e) {
						System.out
								.println("Não é possivel realizar a exclusão.\nSua gilda possui apenas um personagem.");
						break;
					}
				}

				break;

			case 2: // 2-Realizar busca do personagem
				while (true) {
					try {
						System.out.println("Digite o numero de identificação do personangem (id): ");
						rmetodo = entrada.nextInt();
						if (rmetodo <= 0) {
							throw new InputLessOrEqualThanZeroException();
						}
						System.out.println(personagemDao.buscar(rmetodo));
						break;
					} catch (InputMismatchException e) {
						entrada.next();
						System.out.println("Escrever somente números!");

					} catch (InputLessOrEqualThanZeroException e) {
						System.out.println("Valor deve ser maior que zero!");
					}
				}
				break;

			case 3:// 3-listar o(s) personagem(s)

				personagemDao.listar();

				break;
			case 4:// 4-Alterar o nome do personagem
				while (true) {
					try {
						System.out.println("Digite o numero de identificação do personangem (id): ");
						rmetodo = entrada.nextInt();
						if (rmetodo <= 0) {
							throw new InputLessOrEqualThanZeroException();
						}
						break;
					} catch (InputMismatchException e) {
						entrada.next();
						System.out.println("Escrever somente números!");

					} catch (InputLessOrEqualThanZeroException e) {
						System.out.println("Valor deve ser maior que zero!");
					}
				}
				System.out.println("Digite o novo nome: ");
				String n = entrada.next();

				personagemDao.alteraNome(rmetodo, n);

				break;
			case 5: // 5-listar os atributos do personagem
				while (true) {
					try {
						System.out.println("Digite o numero de identificação do personangem (id): ");
						rmetodo = entrada.nextInt();
						if (rmetodo <= 0) {
							throw new InputLessOrEqualThanZeroException();
						}
						break;
					} catch (InputMismatchException e) {
						entrada.next();
						System.out.println("Escrever somente números!");

					} catch (InputLessOrEqualThanZeroException e) {
						System.out.println("Valor deve ser maior que zero!");
					}
				}
				personagemDao.nome(rmetodo);
				System.out.println(personagemDao.listarAtributos(rmetodo));

				break;

			case 6: // 6-listar os personagens utilizando a classe
				System.out.println("Digite a classe: ");
				String c = entrada.next();

				personagemDao.listaClasse(c);

				break;

			case 7: // 7-listar o iventario
				while (true) {
					try {
						System.out.println("Digite o numero de identificação do personangem (id): ");
						rmetodo = entrada.nextInt();
						if (rmetodo <= 0) {
							throw new InputLessOrEqualThanZeroException();
						}
						break;
					} catch (InputMismatchException e) {
						entrada.next();
						System.out.println("Escrever somente números!");
					} catch (InputLessOrEqualThanZeroException e) {
						System.out.println("Valor deve ser maior que zero!");
					}
				}
				personagemDao.nome(rmetodo);
				System.out.println(personagemDao.iventario(rmetodo));

				break;

			case 8: // gerar JSON
				while (true) {
					try {
						System.out.println("Gostaria que fosse gravado em um arquivo? (s/n) ");
						String r = entrada.next();
						if ((!r.equalsIgnoreCase("s")) && (!r.equalsIgnoreCase("n"))) {
							throw new SNException();
						} else if (r.equalsIgnoreCase("s")) {
							try {
								System.out.println("Digite o nome do arquivo: ");
								personagemDao.gravar(personagemDao.json(), entrada.next());
								System.out.println("Arquivo gerado com o tipo .json!");
							} catch (IOException e) {
								e.printStackTrace();
							}
						} else if (r.equalsIgnoreCase("n")) {

							System.out.println("Segue abaixo o JSON gerado:");
							System.out.println(personagemDao.json());

						}
						break;
					} catch (SNException e) {
						System.out.println("Digite apenas S ou N.");
					}
				}

				break;
			default:

				if (rmetodo > 8 || rmetodo <= 0) {
					System.out.print("Digite somente numeros entre 1 e 8. \n");

				}
				break;

			}// switch
			while (true) {
				try {
					System.out.println("Deseja retornar ao menu anterior? S-sim | N-nao:");
					resposta = entrada.next();
					if ((!resposta.equalsIgnoreCase("s")) && (!resposta.equalsIgnoreCase("n"))) {
						throw new SNException();
					}
					break;
				} catch (SNException e) {
					System.out.println("Digite apenas S ou N.");
				}

			}
		} // while
	}

	private static void criarPersonagem(PersonagemDao personagemDao, ItemDao itemDao, AtributoDao atributo,
			Scanner entrada) {
		int qtd = 0;
		while (true) {
			try {
				System.out.print("Quantos personagens voce vai adicionar na sua gilda? ");
				qtd = entrada.nextInt();
				if (qtd <= 0) {
					throw new InputLessOrEqualThanZeroException();
				}
				break;
			} catch (InputMismatchException e) {
				entrada.next();
				System.out.println("Escrever somente números!");
			} catch (InputLessOrEqualThanZeroException e) {
				System.out.println("Valor deve ser maior que zero!");
			}
		}
		System.out.println("------------------------------------------------------------");
		System.out.print("Qual será o nome da sua Guilda: ");
		String guilda = entrada.next();
		System.out.println("------------------------------------------------------------");
		int i = 1;
		do {

			int id = (int) (51 * Math.random() * 100);

			System.out.println("Guilda: " + guilda);
			System.out.println("Numero de identificação do Personangem (id): " + id);

			System.out.print("Digite o nome do personagem: ");
			String nome = entrada.next();

			System.out.println("------------------Raças Disponiveis--------------------------------\r");
			String inputRaca = "Raças Disponíveis: 1-Humano\nRaças Disponíveis: 2-Elfo\nRaças Disponíveis: 3-Anao\nRaças Disponíveis: 4-Halfling\nRaças Disponíveis: 5-Draconato\nRaças Disponíveis: 6-Tiefling\nRaças Disponíveis: 7-Orc\n";
			int rmetodo = 0;
			String raca = "";
			while (true) {
				try {
					System.out.println(inputRaca);
					System.out.print("Selecione a Raça: ");
					rmetodo = entrada.nextInt();
					if (rmetodo <= 0) {
						throw new InputLessOrEqualThanZeroException();
					}
					break;

				} catch (InputMismatchException e) {
					entrada.next();
					System.out.println("Escrever somente números!");
				} catch (InputLessOrEqualThanZeroException e) {
					System.out.println("Valor deve ser maior que zero!");
				}

			}
			switch (rmetodo) {
			case 1:
				raca = "Humano";
				break;
			case 2:
				raca = "Elfo";
				break;
			case 3:
				raca = "Anao";
				break;
			case 4:
				raca = "Halfling";
				break;
			case 5:
				raca = "Draconato";
				break;
			case 6:
				raca = "Tiefling";
				break;
			case 7:
				raca = "Orc";
				break;

			default:

				while (rmetodo > 8 || rmetodo <= 0) {
					while (true) {
						try {
							System.out.println(inputRaca);
							System.out.print("Digite um dos numeros que estão no intevalo: ");
							rmetodo = entrada.nextInt();
							if (rmetodo <= 0) {
								throw new InputLessOrEqualThanZeroException();
							}
							break;
						} catch (InputMismatchException e) {
							entrada.next();
							System.out.println("Escrever somente números!!");
						} catch (InputLessOrEqualThanZeroException e) {
							System.out.println("Valor deve ser maior que zero!");
						}

					}
				} // while
				break;
			}// switch

			System.out.println("------------------Classes Disponiveis--------------------------------\r");
			String inputClasses = "Classes Disponíveis: 1-Barabaro\nClasses Disponíveis: 2-Bardo\nClasses Disponíveis: 3-Clerico\nClasses Disponíveis: 4-Bruxo\nClasses Disponíveis: 5-Paladino\nClasses Disponíveis: 6-Senhor da guerra\nClasses Disponíveis: 7-Guerreiro\n";
			while (true) {
				try {
					System.out.println(inputClasses);
					System.out.print("Selecione a Classe: ");
					rmetodo = entrada.nextInt();
					if (rmetodo <= 0) {
						throw new InputLessOrEqualThanZeroException();
					}
					break;
				} catch (InputMismatchException e) {
					entrada.next();
					System.out.println("Escrever somente números!");
				} catch (InputLessOrEqualThanZeroException e) {
					System.out.println("Valor deve ser maior que zero!");
				}
			}
			String classe = "";
			switch (rmetodo) {
			case 1:
				classe = "Barbaro";
				break;
			case 2:
				classe = "Bardo";
				break;
			case 3:
				classe = "Clerico";
				break;
			case 4:
				classe = "Bruxo";
				break;
			case 5:
				classe = "Paladino";
				break;
			case 6:
				classe = "Senhor da guerra";
				break;
			case 7:
				classe = "Guerreiro";
				break;

			default:
				while (rmetodo > 7 || rmetodo <= 0) {
					while (true) {
						try {
							System.out.println(inputClasses);
							System.out.print("Digite um dos numeros que estão no intevalo: ");
							rmetodo = entrada.nextInt();
							if (rmetodo <= 0) {
								throw new InputLessOrEqualThanZeroException();
							}
							break;
						} catch (InputMismatchException e) {
							entrada.next();
							System.out.println("Escrever somente números!");
						} catch (InputLessOrEqualThanZeroException e) {
							System.out.println("Valor deve ser maior que zero!");
						}
					}
				}
				break;
			}

			int total = 6;
			rmetodo = 0;
			System.out.println("\rvocê posui cerca de 5 pontos para distribuir nos atributos: ");

			Atributo forca = new Atributo(1, "Forca", 5);
			atributo.incluir(forca);
			Atributo destreza = new Atributo(2, "Destreza", 5);
			atributo.incluir(destreza);
			Atributo constituicao = new Atributo(3, "Constituicao", 5);
			atributo.incluir(constituicao);
			Atributo inteligencia = new Atributo(4, "Inteligencia", 5);
			atributo.incluir(inteligencia);
			Atributo sabedoria = new Atributo(5, "Sabedoria", 5);
			atributo.incluir(sabedoria);
			Atributo carisma = new Atributo(6, "Carisma", 5);
			atributo.incluir(carisma);
			String inputAtributo = "Atributo: 1-Força\nAtributo: 2-Destreza\nAtributo: 3-Constituição\nAtributo: 4-Inteligencia\nAtributo: 5-Sabedoria\nAtributo: 6-Carisma\n";
			while (true) {
				try {
					System.out.println(inputAtributo);
					System.out.print("\nSelecione o atributo que deseja upar: ");
					rmetodo = entrada.nextInt();
					if (rmetodo <= 0) {
						throw new InputLessOrEqualThanZeroException();
					}
					break;

				} catch (InputMismatchException e) {
					entrada.next();
					System.out.println("Escrever somente números!");
				} catch (InputLessOrEqualThanZeroException e) {
					System.out.println("Valor deve ser maior que zero!");
				}
			}
			while (total > 1) {
				switch (rmetodo) {
				case 1:
					forca.add();
					total--;

					break;
				case 2:
					destreza.add();
					total--;

					break;
				case 3:
					constituicao.add();
					total--;

					break;
				case 4:
					inteligencia.add();
					total--;

					break;
				case 5:
					sabedoria.add();
					total--;

					break;
				case 6:
					carisma.add();
					total--;

					break;

				default:
					while (rmetodo > 6 || rmetodo <= 0) {
						while (true) {
							try {
								System.out.println(inputAtributo);
								System.out.print("Digite um dos numeros que estão no intevalo: ");
								rmetodo = entrada.nextInt();
								if (rmetodo <= 0) {
									throw new InputLessOrEqualThanZeroException();
								}
								break;
							} catch (InputMismatchException e) {
								entrada.next();
								System.out.println("Escrever somente números!");
							} catch (InputLessOrEqualThanZeroException e) {
								System.out.println("Valor deve ser maior que zero!");
							}
						}
					} // while
					break;

				}
				while (true) {
					try {
						System.out.println(inputAtributo);
						System.out.print("\nVocê possui " + total
								+ " pontos para utilizar.\nSelecione o atributo que deseja subir: \r");
						rmetodo = entrada.nextInt();
						if (rmetodo <= 0) {
							throw new InputLessOrEqualThanZeroException();
						}
						break;
					} catch (InputMismatchException e) {
						entrada.next();
						System.out.println("Escrever somente números!");

					} catch (InputLessOrEqualThanZeroException e) {
						System.out.println("Valor deve ser maior que zero!");
					}
				}

			}

			System.out.println("Está na hora de incluir alguns items no seu inventário, vamos lá!");

			String flag = "S";
			int cod = 1;
			do {

				System.out.print("Digite o nome do item: ");
				String iName = entrada.next();
				int iQtd;
				while (true) {
					try {
						System.out.print("Digite a quantidade: ");
						iQtd = entrada.nextInt();
						if (iQtd <= 0) {
							throw new InputLessOrEqualThanZeroException();
						}
						break;
					} catch (InputMismatchException e) {
						entrada.next();
						System.out.println("Escrever somente números!");

					} catch (InputLessOrEqualThanZeroException e) {
						System.out.println("Valor deve ser maior que zero!");
					}
				}

				System.out.print("Digite a descricao do item: ");
				String iDes = entrada.next();

				itemDao.incluirItem(new Item(cod, iName, iQtd, iDes));

				while (true) {
					try {
						System.out.print("\rDeseja incluir mais itens? S-sim | N-nao: ");
						flag = entrada.next();
						if ((!flag.equalsIgnoreCase("s")) && (!flag.equalsIgnoreCase("n"))) {
							throw new SNException();
						}

						break;

					} catch (SNException e) {
						System.out.println("Digite apenas S ou N.");
					}

				}
				cod++;
			} while (flag.equalsIgnoreCase("S"));

			// dao de inclusao na lista de personagens

			personagemDao.incluir(
					new Personagem(id, nome, raca, classe, guilda, 0, 0, atributo.getAtributoDao(), itemDao.getItem()));

			atributo.zerar();
			itemDao.zerar();
			i++;
		} while (i <= qtd);

		System.out.println(
				"-------------------------Fim do Cadastro de Personagem-------------------------------------------------\r");
	}

}// class
