package jogo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;

public class Questionario2 {
	public void iniciar2() {

		Scanner scan = new Scanner(System.in);
		List<String> nomes = new ArrayList<>();
		List<Integer> ponto = new ArrayList<>();
		int pontos = 0;
		int resposta;

		String nome;

		System.out.println("Informe seu nome !");
		nome = scan.nextLine();
		nomes.add(nome);
		System.out.println("QUESTIONARIO MEDIUM INICIADO...");
		System.out.println("Vamos iniciar o Quiz " + nome);
		System.out.println("###################################");
		int erro = 5;

		// PERGUNTA 01
		System.out.println("Pergunta 01 ");
		System.out.println("###################################");
		System.out.println("Em que ano ocorreu a Revolucao Francesa? ");
		System.out.println("###################################");
		System.out.println("1- 1776");
		System.out.println("2- 1789");
		System.out.println("3- 1804");
		System.out.println("4- 1832");
		System.out.println("###################################");
		try {
			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("Pergunta 01 ");
				System.out.println("###################################");
				System.out.println("Em que ano ocorreu a Revolucao Francesa? ");
				System.out.println("###################################");
				System.out.println("1- 1776");
				System.out.println("2- 1789");
				System.out.println("3- 1804");
				System.out.println("4- 1832");
				System.out.println("###################################");
				resposta = scan.nextInt();
			}

			switch (resposta) {
			case 2:
				System.out.println(nome + " A resposta correta.");
				System.out.println("###################################");
				pontos++;
				break;
			default:

				System.out.println("Resposta errada.");
				System.out.println("###################################");
				break;
			}

			// Verifica se o usuÃƒÂ¡rio deseja continuar respondendo o quiz
			// erro encontradp se o jogador digite qualquer coisa que nao seja um numero
			// volta para o menu iniciar

			// PERGUNTA 02
			System.out.println("PERGUNTA 02");
			System.out.println("###################################");
			System.out.println("2. Qual foi a primeira dinastia a governar o Império Romano?");
			System.out.println("###################################");
			System.out.println("1- Júlio-Claudiana");
			System.out.println("2- Antonina");
			System.out.println("3- Flaviana");
			System.out.println("4- Augustana");
			System.out.println("###################################");
			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("PERGUNTA 02");
				System.out.println("###################################");
				System.out.println(" Qual foi a primeira dinastia a governar o Império Romano?");
				System.out.println("###################################");
				System.out.println("1- Júlio-Claudiana");
				System.out.println("2- Antonina");
				System.out.println("3- Flaviana");
				System.out.println("4- Augustana");
				System.out.println("###################################");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			// ALTERNATIVA CORRETA
			case 4:
				System.out.println(nome + " A resposta esta correta: ");
				System.out.println("###################################");
				pontos++;
				break;
			default:

				System.out.println("Resposta errada.");
				System.out.println("###################################");
				break;
			}
			// PERGUNTA 03
			System.out.println("PERGUNTA 03");
			System.out.println("###################################");
			System.out.println("Quem foi o líder da Revolução Russa em 1917?");
			System.out.println("###################################");
			System.out.println("1- Vladimir Lenin");
			System.out.println("2- Josef Stalin");
			System.out.println("3- Leon Trotsky");
			System.out.println("4- Mikhail Gorbachev");
			;
			System.out.println("###################################");
			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("PERGUNTA 03");
				System.out.println("###################################");
				System.out.println("Quem foi o líder da Revolução Russa em 1917?");
				System.out.println("###################################");
				System.out.println("1- Vladimir Lenin");
				System.out.println("2- Josef Stalin");
				System.out.println("3- Leon Trotsky");
				System.out.println("4- Mikhail Gorbachev");
				System.out.println("###################################");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			case 1:
				System.out.println(nome + " Resposta correta: ");
				System.out.println("###################################");
				pontos++;
				break;
			default:
				System.out.println("Resposta errada.");
				System.out.println("###################################");
				break;
			}
			// PERGUNTA 04
			System.out.println("PERGUNTA 4");
			System.out.println("###################################");
			System.out.println(" Qual foi a causa imediata da Primeira Guerra Mundial?");
			System.out.println("###################################");
			System.out.println("1-  Assassinato do arquiduque Francisco Ferdinando ");
			System.out.println("2-  Conflito territorial entre Alemanha e França");
			System.out.println("3-  Disputa pelo controle dos Bálcãs");
			System.out.println("4-  Ataque japonês a Pearl Harbor");
			System.out.println("###################################");

			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("PERGUNTA 4");
				System.out.println("###################################");
				System.out.println(" Qual foi a causa imediata da Primeira Guerra Mundial?");
				System.out.println("###################################");
				System.out.println("1-  Assassinato do arquiduque Francisco Ferdinando ");
				System.out.println("2-  Conflito territorial entre Alemanha e França");
				System.out.println("3-  Disputa pelo controle dos Bálcãs");
				System.out.println("4-  Ataque japonês a Pearl Harbor");
				System.out.println("###################################");

				resposta = scan.nextInt();
			}
			switch (resposta) {
			case 1:

				System.out.println(" Resposta correta: ");
				System.out.println("###################################");

				System.out.println();
				pontos++;
				break;
			default:
				System.out.println("Resposta errada.");
				System.out.println("###################################");

				break;
			}
			// PERGUNTA 05
			System.out.println("###################################");
			System.out.println("PERGUNTA 5");
			System.out.println("###################################");
			System.out.println("Qual foi o último imperador do Império Romano do Ocidente?");
			System.out.println("###################################");
			System.out.println("1- Júlio César");
			System.out.println("2- Augusto");
			System.out.println("3- Constantino");
			System.out.println("4- Rômulo Augusto (CORRETA)");
			System.out.println("###################################");
			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("###################################");
				System.out.println("PERGUNTA 5");
				System.out.println("###################################");
				System.out.println("Qual foi o último imperador do Império Romano do Ocidente?");
				System.out.println("###################################");
				System.out.println("1- Júlio César");
				System.out.println("2- Augusto");
				System.out.println("3- Constantino");
				System.out.println("4- Rômulo Augusto (CORRETA)");
				System.out.println("###################################");

				resposta = scan.nextInt();
			}
			switch (resposta) {
			// ALTERNATIVA DA RESPOSTA CORRETA
			case 4:

				System.out.println(" Resposta correta: ");
				System.out.println("###################################");
				pontos++;
				break;
			default:
				System.out.println("Resposta errada.");
				System.out.println("###################################");
				break;
			}
			// PERGUNTA 06
			System.out.println("###################################");
			System.out.println("PERGUNTA 06");
			System.out.println("###################################");
			System.out.println("Quem foi o líder político responsável pela independência da Índia em 1947?");
			System.out.println("###################################");
			System.out.println("1- Mahatma Gandhi");
			System.out.println("2- Jawaharlal Nehru");
			System.out.println("3- Indira Gandhi");
			System.out.println("4- Rajiv Gandhi");
			System.out.println("###################################");
			resposta = scan.nextInt();

			while (resposta >= erro) {
				System.out.println("###################################");
				System.out.println("PERGUNTA 06");
				System.out.println("###################################");
				System.out.println("Quem foi o líder político responsável pela independência da Índia em 1947?");
				System.out.println("###################################");
				System.out.println("1- Mahatma Gandhi ");
				System.out.println("2- Jawaharlal Nehru");
				System.out.println("3- Indira Gandhi");
				System.out.println("4- Rajiv Gandhi");
				System.out.println("###################################");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			case 1:

				System.out.println("Resposta correta: ");
				System.out.println("###################################");
				pontos++;
				break;
			default:
				System.out.println("Resposta errada.");
				System.out.println("###################################");
				break;
			}
			// PERGUNTA 07
			System.out.println("###################################");
			System.out.println("PERGUNTA 7");
			System.out.println("###################################");
			System.out.println(" Qual foi a famosa batalha em que Napoleão Bonaparte foi derrotado em 1815?");
			System.out.println("###################################");
			System.out.println("1- Batalha de Austerlitz");
			System.out.println("2- Batalha de Waterloo (CORRETA)");
			System.out.println("3- Batalha de Trafalgar");
			System.out.println("4- Batalha de Leipzig");
			System.out.println("###################################");
			resposta = scan.nextInt();

			while (resposta >= erro) {
				System.out.println("###################################");
				System.out.println("PERGUNTA 7");
				System.out.println("###################################");
				System.out.println(" Qual foi a famosa batalha em que Napoleão Bonaparte foi derrotado em 1815?");
				System.out.println("1- Batalha de Austerlitz");
				System.out.println("2- Batalha de Waterloo (CORRETA)");
				System.out.println("3- Batalha de Trafalgar");
				System.out.println("4- Batalha de Leipzig");
				System.out.println("###################################");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			// ALTERNATIVA DA RESPOSTA CORRETA
			case 2:

				System.out.println(" Resposta correta: ");
				System.out.println("###################################");
				pontos++;
				break;
			default:
				System.out.println("Resposta errada.");
				System.out.println("###################################");
				break;
			}
			// PERGUNTA 08
			System.out.println("###################################");
			System.out.println("PERGUNTA 8");
			System.out.println("###################################");
			System.out.println("Qual foi o evento que marcou o início da Segunda Guerra Mundial?");
			System.out.println("###################################");
			System.out.println("1- Invasão da Polônia pela Alemanha ");
			System.out.println("2- Ataque japonês a Pearl Harbor");
			System.out.println("3- Queda de Paris para as tropas alemãs");
			System.out.println("4- Bombardeio de Londres");
			System.out.println("###################################");
			resposta = scan.nextInt();

			while (resposta >= erro) {
				System.out.println("PERGUNTA 8");
				System.out.println("###################################");
				System.out.println("Qual foi o evento que marcou o início da Segunda Guerra Mundial?");
				System.out.println("###################################");
				System.out.println("1- Invasão da Polônia pela Alemanha ");
				System.out.println("2- Ataque japonês a Pearl Harbor");
				System.out.println("3- Queda de Paris para as tropas alemãs");
				System.out.println("4- Bombardeio de Londres");
				System.out.println("###################################");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			case 1:
				System.out.println(" Resposta correta: ");
				System.out.println("###################################");
				System.out.println();
				pontos++;
				break;
			default:

				System.out.println("Resposta errada.");
				System.out.println("###################################");
				break;
			}
			// PERGUNTA 09
			System.out.println("###################################");
			System.out.println("PERGUNTA 10");
			System.out.println("###################################");
			System.out.println(" Quem foi o primeiro presidente dos Estados Unidos?");
			System.out.println("###################################");
			System.out.println("1- Thomas Jefferson");
			System.out.println("2- George Washington ");
			System.out.println("3- Abraham Lincoln");
			System.out.println("4- Franklin D. Roosevelt");
			System.out.println("###################################");
			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("###################################");
				System.out.println("PERGUNTA 10");
				System.out.println("###################################");
				System.out.println(" Quem foi o primeiro presidente dos Estados Unidos?");
				System.out.println("###################################");
				System.out.println("1- Thomas Jefferson");
				System.out.println("2- George Washington");
				System.out.println("3- Abraham Lincoln");
				System.out.println("4- Franklin D. Roosevelt");
				System.out.println("###################################");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			case 2:

				System.out.println("Resposta correta: ");
				System.out.println("###################################");
				System.out.println();
				pontos++;
				break;
			default:
				System.out.println("Resposta errada.");
				System.out.println("###################################");
				break;
			}
			// PERGUNTA 10
			System.out.println("###################################");
			System.out.println("PERGUNTA 10");
			System.out.println("###################################");
			System.out.println("Qual foi a capital do Império Inca?");
			System.out.println("###################################");
			System.out.println("1- Cusco ");
			System.out.println("2- Machu Picchu");
			System.out.println("3- Lima");
			System.out.println("4- Quito");
			System.out.println("###################################");
			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("###################################");
				System.out.println("PERGUNTA 10");
				System.out.println("###################################");
				System.out.println("Qual foi a capital do Império Inca?");
				System.out.println("###################################");
				System.out.println("1- Cusco ");
				System.out.println("2- Machu Picchu");
				System.out.println("3- Lima");
				System.out.println("4- Quito");
				System.out.println("###################################");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			case 1:
				System.out.println(" Resposta correta: ");
				System.out.println("###################################");
				pontos++;
				break;
			}
			if (pontos <= 4) {
				System.out.println();
				System.out.println(" GAME OVER ");
				System.out.println("###################################");
				System.out.println("Sua pontuaçao no jogo foi de " + pontos + "pontos");
				System.out.println("###################################");
				System.out.println(" Retornaremos ao menu inicial");
				System.out.println("###################################");
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
					System.out.println("Quem pintou a Mona Lisa? ");
					System.out.println("###################################");
					System.out.println(" 1- Pablo Picasso ");
					System.out.println(" 2- Calude Monet ");
					System.out.println(" 3- Vincent van gogh ");
					System.out.println(" 4- Leonardo da Vinci ");
					System.out.println("###################################");
					resposta = scan.nextInt();
					while (resposta >= erro) {
						System.out.println(" pergunta bonus");
						System.out.println("###################################");
						System.out.println("Quem pintou a Mona Lisa? ");
						System.out.println("###################################");
						System.out.println(" 1- Pablo Picasso ");
						System.out.println(" 2- Calude Monet ");
						System.out.println(" 3- Vincent van gogh ");
						System.out.println(" 4- Leonardo da Vinci ");
						System.out.println("###################################");
						resposta = scan.nextInt();
					}
				}
				if (resposta < 4) {

					System.out.println(" Retornaremos ao menu inicial");
					System.out.println("###################################");
					ponto.add(pontos);
					for (int i = 0; i < nomes.size(); i++) {
						String jogador = nomes.get(i);
						int pontuacao = ponto.get(i);
						System.out.println("Nome: " + jogador + ", Pontos: " + pontuacao);
					}

					principal Principal = new principal();
					principal.main(null);
				} else if (resposta == 4) {
					System.out.println(" FIM DE JOGO");
					System.out.println("###################################");
					System.out.println("Resposta correta ");
					System.out.println("###################################");
					pontos++;
					ponto.add(pontos);
					for (int i = 0; i < nomes.size(); i++) {
						String jogador = nomes.get(i);
						int pontuacao = ponto.get(i);
						System.out.println("Nome: " + jogador + ", Pontos: " + pontuacao);
					}

					principal Principal = new principal();
					principal.main(null);
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Resposta invalida apenas numeros. retornaremos ao menu inicial");
			scan.nextLine(); // Limpar o buffer do scanner
		}
	}
}
