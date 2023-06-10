package jogo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class principal {
	public static void main(String[] args) {

		// Alteracao realizada add uma var booleana para encerrar o game
		// ADICIONADO AS PERGUNTAS NAS DEMAIS CLASSES
		// CRIADO UM ARRAY-LIST PARA ARMAZENAR O NOME E A PONTUAÇAO E ESSES VALORES SAO
		// RETORNADOS NO FINAL DO GAME
		Scanner scan = new Scanner(System.in);
		int questionario = 0;
		boolean sair = false;

		while (!sair) {
			try {
				System.out.println("Escolha um dos questionarios para testarmos os seus conhecimentos :");
				System.out.println("1 - Modo Easy");
				System.out.println("2 - Modo Medium");
				System.out.println("3 - Modo Hard");
				System.out.println("4 - Encerrar o game");
				System.out.println("5 - Exibir Banco de Dados");
				questionario = scan.nextInt();

				switch (questionario) {
				case 1:
					Questionario questionario1 = new Questionario();
					questionario1.iniciar1();
					break;
				case 2:
					Questionario2 questionario2 = new Questionario2();
					questionario2.iniciar2();
					break;
				case 3:
					Questionario3 questionario3 = new Questionario3();
					questionario3.iniciar3();
					break;
				case 4:
					sair = true;
					System.out.println("Game encerrado muito obrigado");
					break;
				case 5:
					BancoDeDados bancoDeDados = new BancoDeDados();
					bancoDeDados.conectar();
					if (bancoDeDados.estaConectado()) {
						bancoDeDados.listarusuarios();
						bancoDeDados.desconectar();
					} else {
						System.out.println("conexao falhou");
					}
					
				}
			} catch (InputMismatchException exception) {

				System.out.println("Opcao invalida, escolhas um dos questionarios atraves da numeração.");
				System.out.println();
				scan.nextLine();
				continue;
			}
		}
	}
}