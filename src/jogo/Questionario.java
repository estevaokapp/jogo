package jogo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;

public class Questionario {
	private Object statement;
	public void iniciar1() {
		Scanner scan = new Scanner(System.in);
		String nome;
		List<String> nomes = new ArrayList<>();
		List<Integer> ponto = new ArrayList<>();
		
		int pontos = 0;
		int resposta;
		int bonus = 20;

		System.out.println("Informe seu nome !");
		nome = scan.next();
		nomes.add(nome);
		System.out.println("QUESTIONARIO EASY INICIADO...");
		System.out.println("Vamos iniciar o Quiz " + nome);
		System.out.println("###################################");
		int erro = 5;

		// PERGUNTA 01
		System.out.println("Pergunta 01 ");
		System.out.println("###################################");
		System.out.println("Qual e o maior oceano do mundo? ");
		System.out.println("1- Oceano Atlantico");
		System.out.println("2- Oceano Indico");
		System.out.println("3- Oceano Artico");
		System.out.println("4- Oceano Pacifico");
		System.out.println("###################################");
		try {
			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("Pergunta 01");
				System.out.println("###################################");
				System.out.println("Qual e o maior oceano do mundo? ");
				System.out.println("1- Oceano Atlantico");
				System.out.println("2- Oceano Indico");
				System.out.println("3- Oceano Artico");
				System.out.println("4- Oceano Pacifico");
				System.out.println("###################################");
				resposta = scan.nextInt();
			}

			switch (resposta) {
			case 4:
				System.out.println(nome + " A resposta correta.");
				pontos++;
				break;
			default:
				System.out.println("###################################");
				System.out.println("Resposta errada.");
				break;
			}

			// Verifica se o usuÃƒÂ¡rio deseja continuar respondendo o quiz
			System.out.println("###################################");
			// erro encontradp se o jogador digite qualquer coisa que nao seja um numero
			// volta para o menu iniciar
			// PERGUNTA 02
			System.out.println("PERGUNTA 02");
			System.out.println(" Qual e o maior planeta do sistema solar?");
			System.out.println("###################################");
			System.out.println(" 1-Jupiter ");
			System.out.println(" 2-Marte ");
			System.out.println(" 3-Saturno ");
			System.out.println(" 4-Venus  ");
			System.out.println("###################################");
			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("PERGUNTA 02");
				System.out.println(" Qual e o maior planeta do sistema solar?");
				System.out.println("###################################");
				System.out.println(" 1- Jupiter");
				System.out.println(" 2- Marte");
				System.out.println(" 3- Saturno");
				System.out.println(" 4- Venus");
				System.out.println("###################################");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			// ALTERNATIVA CORRETA
			case 1:
				System.out.println(nome + " A resposta esta correta: ");
				System.out.println("###################################");
				pontos++;
				break;
			default:
				System.out.println("###################################");
				System.out.println("Resposta errada.");
				break;
			}
			// PERGUNTA 03
			System.out.println("PERGUNTA 03");
			System.out.println("###################################");
			System.out.println("Quem pintou a Mona Lisa? ");
			System.out.println("###################################");
			System.out.println(" 1- Pablo Picasso ");
			System.out.println(" 2- Calude Monet ");
			System.out.println(" 3- Leonardo da Vinci ");
			System.out.println(" 4- Vincent van gogh ");
			System.out.println("###################################");

			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("PERGUNTA 03");
				System.out.println("###################################");
				System.out.println("Quem pintou a Mona Lisa? ");
				System.out.println("###################################");
				System.out.println(" 1- Pablo Picasso ");
				System.out.println(" 2- Calude Monet ");
				System.out.println(" 3- Leonardo da Vinci ");
				System.out.println(" 4- Vincent van gogh ");
				System.out.println("###################################");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			case 3:
				System.out.println(nome + " A resposta esta correta: ");
				System.out.println();
				pontos++;
				break;
			default:
				System.out.println("###################################");
				System.out.println("Resposta errada.");
				break;
			}
			// PERGUNTA 04
			System.out.println("PERGUNTA 04");
			System.out.println("###################################");
			System.out.println(" 1- Sao paulo ");
			System.out.println(" 2- Rio de janeiro");
			System.out.println(" 3- Brasilia ");
			System.out.println(" 4- Salvador ");
			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("PERGUNTA 04");
				System.out.println("###################################");
				System.out.println("Qual a capital do brasil ");
				System.out.println("###################################");
				System.out.println(" 1- Sao paulo ");
				System.out.println(" 2- Rio de janeiro");
				System.out.println(" 3- Brasilia ");
				System.out.println(" 4- Salvador ");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			case 3:
				System.out.println("###################################");
				System.out.println(nome + " A resposta esta correta: ");
				System.out.println();
				pontos++;
				break;
			default:
				System.out.println("###################################");
				System.out.println("Resposta errada.");
				break;
			}
			// PERGUNTA 05
			System.out.println("PERGUNTA 05");
			System.out.println("###################################");
			System.out.println(" Qual a montanha mais alta do mundo");
			System.out.println("###################################");
			System.out.println(" 1  Mont blanc ");
			System.out.println(" 2- Monte everest");
			System.out.println(" 3- Montanha k2");
			System.out.println(" 4- Monte fuji ");
			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("PERGUNTA 05");
				System.out.println("###################################");
				System.out.println(" Qual a montanha mais alta do mundo");
				System.out.println("###################################");
				System.out.println(" 1  Mont blanc ");
				System.out.println(" 2- Monte everest");
				System.out.println(" 3- Montanha k2");
				System.out.println(" 4- Monte fuji ");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			// ALTERNATIVA DA RESPOSTA CORRETA
			case 2:
				System.out.println("###################################");
				System.out.println(nome + " A resposta esta correta: ");
				System.out.println();
				pontos++;
				break;
			default:
				System.out.println("###################################");
				System.out.println("Resposta errada.");
				break;
			}
			// PERGUNTA 06
			System.out.println("PERGUNTA 06");
			System.out.println("###################################");
			System.out.println(" Quem escreveu o livro Dom Quixote  ");
			System.out.println(" 1- William shakespeare ");
			System.out.println(" 2- Miguel de cervantes ");
			System.out.println(" 3- J.R.R tolkien ");
			System.out.println(" 4- Jane austen ");
			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("PERGUNTA 06");
				System.out.println("###################################");
				System.out.println(" Quem escreveu o livro Dom Quixote  ");
				System.out.println(" 1- William shakespeare ");
				System.out.println(" 2- Miguel de cervantes ");
				System.out.println(" 3- J.R.R tolkien ");
				System.out.println(" 4- Jane austen ");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			case 2:
				System.out.println("###################################");
				System.out.println(nome + " A resposta esta correta: ");
				pontos++;
				break;
			default:
				System.out.println("###################################");
				System.out.println("Resposta errada.");
				break;
			}
			// PERGUNTA 07
			System.out.println("PERGUNTA 07");
			System.out.println("###################################");
			System.out.println(" qual e a moeda oficial do japao ");
			System.out.println(" 1- Yen ");
			System.out.println(" 2- Won ");
			System.out.println(" 3- Dolar  ");
			System.out.println(" 4- Euro");
			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("PERGUNTA 07");
				System.out.println("###################################");
				System.out.println(" qual e a moeda oficial do japao ");
				System.out.println(" 1- Yen ");
				System.out.println(" 2- Won ");
				System.out.println(" 3- Dolar  ");
				System.out.println(" 4- Euro");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			// ALTERNATIVA DA RESPOSTA CORRETA
			case 1:
				System.out.println("###################################");
				System.out.println(nome + " A resposta esta correta: ");
				pontos++;
				break;
			default:
				System.out.println("###################################");
				System.out.println("Resposta errada.");
				break;
			}
			// PERGUNTA 08
			System.out.println("PERGUNTA 08");
			System.out.println("###################################");
			System.out.println("qual e o maior pais da america do sul");
			System.out.println("###################################");
			System.out.println(" 1- Argentina ");
			System.out.println(" 2- Colombia ");
			System.out.println(" 3- Brasil");
			System.out.println(" 4- Peru");
			System.out.println("###################################");
			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("PERGUNTA 08");
				System.out.println("###################################");
				System.out.println("qual e o maior pais da america do sul");
				System.out.println("###################################");
				System.out.println(" 1- Argentina ");
				System.out.println(" 2- Colombia ");
				System.out.println(" 3- Brasil");
				System.out.println(" 4- Peru");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			case 3:
				System.out.println("###################################");
				System.out.println(nome + " A resposta esta correta: ");
				System.out.println();
				pontos++;
				break;
			default:
				System.out.println("###################################");
				System.out.println("Resposta errada.");
				break;
			}
			// PERGUNTA 09
			System.out.println("PERGUNTA 09");
			System.out.println("###################################");
			System.out.println(" quem foi o primeiro homem a pisar na lua ");
			System.out.println("###################################");
			System.out.println(" 1- Neil armstrong ");
			System.out.println(" 2- Buzz aldrin ");
			System.out.println(" 3- Yuri gagarin ");
			System.out.println(" 4- Alan shepard");
			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("PERGUNTA 09");
				System.out.println("###################################");
				System.out.println(" quem foi o primeiro homem a pisar na lua ");
				System.out.println("###################################");
				System.out.println(" 1- Neil armstrong ");
				System.out.println(" 2- Buzz aldrin ");
				System.out.println(" 3- Yuri gagarin ");
				System.out.println(" 4- Alan shepard");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			case 1:
				System.out.println("###################################");
				System.out.println(nome + " A resposta esta correta: ");
				System.out.println();
				pontos++;
				break;
			default:
				System.out.println("###################################");
				System.out.println("Resposta errada.");
				break;
			}
			// PERGUNTA 10
			System.out.println("PERGUNTA 10");
			System.out.println("###################################");
			System.out.println("Qual o instrumento musical mais comum no mundo");
			System.out.println("###################################");
			System.out.println(" 1- piano  ");
			System.out.println(" 2- violino");
			System.out.println(" 3- guitarra");
			System.out.println(" 4- flauta ");
			System.out.println("###################################");
			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("PERGUNTA 10");
				System.out.println("Qual o instrumento musical mais comum no mundo");
				System.out.println("###################################");
				System.out.println(" 1- piano  ");
				System.out.println(" 2- violino");
				System.out.println(" 3- guitarra");
				System.out.println(" 4- flauta ");
				System.out.println("###################################");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			case 2:
				System.out.println(nome + " A resposta esta correta: ");
				System.out.println("###################################");
				pontos++;
				break;
			}
			if (pontos <= 4) {
				System.out.println();
				System.out.println(" GAME OVER ");
				System.out.println("###################################");
				System.out.println("sua pontuaçao no jogo foi de " + pontos + "pontos");
				System.out.println("###################################");
				System.out.println(" Retornaremos ao menu inicial");
				pontos--;
				ponto.add(pontos);
				for (int i = 0; i < nomes.size(); i++) {
					String jogador = nomes.get(i);
					int pontuacao = ponto.get(i);
					System.out.println("Nome: " + jogador + ", Pontos: " + pontuacao);
				}

				principal Principal = new principal();
				Principal.main(null);
				scan.close();
			}
			// PERGUNTA BONUS
			else if (pontos >= 5) {

				System.out.println(" PARA RESPONDER A PERGUNTA BONUS DIGITE 1 ");
				System.out.println("###################################");
				System.out.println(" PARA NAO RESPONDER DIGITE 2 ");
				System.out.println("###################################");
				resposta = scan.nextInt();
				// BONUS
				if (resposta == 1) {
					System.out.println(" pergunta bonus");
					System.out.println("###################################");
					System.out.println("Quem foi a unica pessoa na historia a receber o Premio Nobel");
					System.out.println("em areas cinentificas diferentes");
					System.out.println("###################################");
					System.out.println(" 1- Albert Einstein");
					System.out.println(" 2- Linus Pauling");
					System.out.println(" 3- Mahatma Gandhi");
					System.out.println(" 4- Marie Curie");
					System.out.println("###################################");
					resposta = scan.nextInt();
					while (resposta >= erro) {
						System.out.println(" pergunta bonus");
						System.out.println("###################################");
						System.out.println("Quem foi a unica pessoa na historia a receber o Premio Nobel");
						System.out.println("em areas cinentificas diferentes");
						System.out.println("###################################");
						System.out.println(" 1- Albert Einstein");
						System.out.println(" 2- Linus Pauling");
						System.out.println(" 3- Mahatma Gandhi");
						System.out.println(" 4- Marie Curie");
						System.out.println("###################################");
						resposta = scan.nextInt();
					}
				}
				if (resposta < 4) {
					System.out.println(" Resposta errada " + pontos + " foi a sua pontuacao final ");
					System.out.println(" Retornaremos ao menu inicial");
					pontos--;
					ponto.add(pontos);
					for (int i = 0; i < nomes.size(); i++) {
						String jogador = nomes.get(i);
						int pontuacao = ponto.get(i);
						System.out.println("Nome: " + jogador + ", Pontos: " + pontuacao);
					}
					principal Principal = new principal();
					Principal.main(null);
				} else if (resposta == 4) {
					
					System.out.println(" FIM DE JOGO");
					System.out.println(nome + "SUA PONTUACAO FINAL FOI " + pontos);
					System.out.println("bonus de resposta correta " + bonus);
					
					pontos ++;
					ponto.add(pontos);
					for (int i = 0; i < nomes.size(); i++) {
						String jogador = nomes.get(i);
						int pontuacao = ponto.get(i);
						System.out.println("Nome: " + jogador + ", Pontos: " + pontuacao);
						

				

					}
				
					
				
				}
			
					principal Principal = new principal();
					Principal.main(null);
				
			}
		} catch (InputMismatchException e) {
			System.out.println("Resposta invalida apenas numeros. retornaremos ao menu inicial");
			scan.nextLine(); // Limpar o buffer do scanner
		}
	}
}
