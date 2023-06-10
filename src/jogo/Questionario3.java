package jogo;



import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;

public class Questionario3 {
	public void iniciar3() {

		Scanner scan = new Scanner(System.in);
		List<String> nomes = new ArrayList<>();                                  
		List<Integer> ponto = new ArrayList<>();
		int pontos = 0;
		int resposta;
		String nome;

		System.out.println("Informe seu nome !");
		nome = scan.nextLine();
		nomes.add(nome);
        System.out.println("QUESTIONARIO HARD INICIADO...");

		System.out.println("Vamos iniciar o Quiz " + nome);
		System.out.println("###################################");
		int erro = 5;

		// PERGUNTA 01
		System.out.println("Pergunta 01 ");
		System.out.println("###################################");
		System.out.println("1. Qual filósofo grego é conhecido por sua teoria das ideias?");
		System.out.println("###################################");
		System.out.println("1- Sócrates");
		System.out.println("2- Platão ");
		System.out.println("3- Aristóteles");
		System.out.println("4- Heráclito");
		System.out.println("###################################");
		try {
			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("Pergunta 01 ");
				System.out.println("###################################");
				System.out.println("1. Qual filósofo grego é conhecido por sua teoria das ideias?");
				System.out.println("###################################");
				System.out.println("1- Sócrates");
				System.out.println("2- Platão ");
				System.out.println("3- Aristóteles");
				System.out.println("4- Heráclito");
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
			System.out.println(" Qual corrente filosófica pregava a busca do prazer como o bem supremo?");
			System.out.println("###################################");
			System.out.println("1- Estoicismo");
			System.out.println("2- Epicurismo");
			System.out.println("3- Ceticismo");
			System.out.println("4- Hedonismo");
			System.out.println("###################################");
			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("PERGUNTA 02");
				System.out.println("###################################");
				System.out.println(" Qual corrente filosófica pregava a busca do prazer como o bem supremo?");
				System.out.println("###################################");
				System.out.println("1- Estoicismo");
				System.out.println("2- Epicurismo");
				System.out.println("3- Ceticismo");
				System.out.println("4- Hedonismo");
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
			System.out.println("Qual evento marcou o fim da Idade Média e o início da Idade Moderna?");
			System.out.println("###################################");
			System.out.println("1- Queda do Império Romano");
			System.out.println("2- Renascimento Cultural");
			System.out.println("3- Revolução Industrial");
			System.out.println("4- Descobrimento da América");
			System.out.println("###################################");
			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("PERGUNTA 03");
				System.out.println("###################################");
				System.out.println("Qual evento marcou o fim da Idade Média e o início da Idade Moderna?");
				System.out.println("###################################");
				System.out.println("1- Queda do Império Romano");
				System.out.println("2- Renascimento Cultural");
				System.out.println("3- Revolução Industrial");
				System.out.println("4- Descobrimento da América");
				System.out.println("###################################");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			case 4:
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
			System.out.println("PERGUNTA 04");
			System.out.println("###################################");
			System.out.println(
					"Qual filósofo iluminista escreveu 'Discurso sobre a Origem e os Fundamentos da Desigualdade entre os Homens'?");
			System.out.println("1- John Locke");
			System.out.println("2- Immanuel Kant");
			System.out.println("3- Jean-Jacques Rousseau ");
			System.out.println("4- Voltaire");
			System.out.println("###################################");
			resposta = scan.nextInt();
			while (resposta >= erro) {

				System.out.println("PERGUNTA 04");
				System.out.println("###################################");

				System.out.println(
						"Qual filósofo iluminista escreveu 'Discurso sobre a Origem e os Fundamentos da Desigualdade entre os Homens'?");
				System.out.println("1- John Locke");
				System.out.println("2- Immanuel Kant");
				System.out.println("3- Jean-Jacques Rousseau ");
				System.out.println("4- Voltaire");
				System.out.println("###################################");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			case 3:
				System.out.println(nome + " Resposta correta: ");
				pontos++;
				break;
			default:

				System.out.println("Resposta errada.");
				System.out.println("###################################");

				break;
			}
			// PERGUNTA 05
			System.out.println("PERGUNTA 05");
			System.out.println("###################################");
			System.out.println("Quem foi o líder da Revolução Bolchevique na Rússia em 1917?");
			System.out.println("1- Josef Stalin");
			System.out.println("2- Vladimir Lenin ");
			System.out.println("3- Leon Trotsky");
			System.out.println("4- Mikhail Gorbachev");
			System.out.println("###################################");
			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("PERGUNTA 05");
				System.out.println("###################################");
				System.out.println("Quem foi o líder da Revolução Bolchevique na Rússia em 1917?");
				System.out.println("1- Josef Stalin");
				System.out.println("2- Vladimir Lenin ");
				System.out.println("3- Leon Trotsky");
				System.out.println("4- Mikhail Gorbachev");
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
			// PERGUNTA 06
			System.out.println("PERGUNTA 06");
			System.out.println("###################################");
			System.out.println("Qual filósofo pré-socrático afirmava que 'tudo é água'?");
			System.out.println("1- Parmênides");
			System.out.println("2- Empédocles");
			System.out.println("3- Heráclito");
			System.out.println("4- Tales de Mileto");
			System.out.println("###################################");
			resposta = scan.nextInt();

			while (resposta >= erro) {
				System.out.println("PERGUNTA 06");
				System.out.println("###################################");
				System.out.println("Qual filósofo pré-socrático afirmava que 'tudo é água'?");
				System.out.println("1- Parmênides");
				System.out.println("2- Empédocles");
				System.out.println("3- Heráclito");
				System.out.println("4- Tales de Mileto");
				System.out.println("###################################");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			case 4:
				System.out.println(nome + "  Resposta correta: ");
				System.out.println("###################################");
				pontos++;
				break;
			default:
				System.out.println("Resposta errada.");
				System.out.println("###################################");

				break;
			}
			// PERGUNTA 07
			System.out.println("PERGUNTA 07");
			System.out.println("###################################");
			System.out.println(" Qual foi a principal obra escrita por Karl Marx e Friedrich Engels?");
			System.out.println("###################################");
			System.out.println("1- O Príncipe");
			System.out.println("2- Manifesto Comunista");
			System.out.println("3- Leviatã");
			System.out.println("4- A República");
			System.out.println("###################################");
			resposta = scan.nextInt();

			while (resposta >= erro) {
				System.out.println("PERGUNTA 07");
				System.out.println("###################################");
				System.out.println(" Qual foi a principal obra escrita por Karl Marx e Friedrich Engels?");
				System.out.println("###################################");
				System.out.println("1- O Príncipe");
				System.out.println("2- Manifesto Comunista ");
				System.out.println("3- Leviatã");
				System.out.println("4- A República");
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
			System.out.println("PERGUNTA 08");
			System.out.println("###################################");
			System.out.println("Qual filósofo grego definiu a filosofia como 'a arte de morrer'?");
			System.out.println("###################################");
			System.out.println("1- Epicuro");
			System.out.println("2- Sócrates ");
			System.out.println("3- Platão");
			System.out.println("4- Aristóteles");
			System.out.println("###################################");
			resposta = scan.nextInt();

			while (resposta >= erro) {
				System.out.println("PERGUNTA 08");
				System.out.println("###################################");
				System.out.println("Qual filósofo grego definiu a filosofia como 'a arte de morrer'?");
				System.out.println("###################################");
				System.out.println("1- Epicuro");
				System.out.println("2- Sócrates ");
				System.out.println("3- Platão");
				System.out.println("4- Aristóteles");
				System.out.println("###################################");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			case 2:

				System.out.println(nome + " A resposta esta correta: ");
				System.out.println("###################################");
				pontos++;
				break;
			default:

				System.out.println("Resposta errada.");

				System.out.println("###################################");
				break;
			}
			// PERGUNTA 09
			System.out.println("PERGUNTA 09");
			System.out.println("###################################");
			System.out.println(
					"Qual foi a consequência imediata da Batalha de Stalingrado durante a Segunda Guerra Mundial?");
			System.out.println("###################################");
			System.out.println("1- Vitória dos Estados Unidos");
			System.out.println("2- Queda de Berlim");
			System.out.println("3- Rendição da Itália");
			System.out.println("4- Início da ofensiva soviética ");
			System.out.println("###################################");
			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("PERGUNTA 09");
				System.out.println("###################################");
				System.out.println(
						"Qual foi a consequência imediata da Batalha de Stalingrado durante a Segunda Guerra Mundial?");
				System.out.println("###################################");
				System.out.println("1- Vitória dos Estados Unidos");
				System.out.println("2- Queda de Berlim");
				System.out.println("3- Rendição da Itália");
				System.out.println("4- Início da ofensiva soviética ");
				System.out.println("###################################");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			case 4:
				System.out.println(" A resposta esta correta: ");
				System.out.println("###################################");
				pontos++;
				break;
			default:
				System.out.println("Resposta errada.");
				System.out.println("###################################");

				break;
			}
			// PERGUNTA 10
			System.out.println("PERGUNTA 10");
			System.out.println("###################################");
			System.out.println("Qual filósofo grego defendia a teoria das quatro causas?");
			System.out.println("1- Aristóteles ");
			System.out.println("2- Sócrates");
			System.out.println("3- Platão");
			System.out.println("4- Heráclito");
			System.out.println("###################################");

			resposta = scan.nextInt();
			while (resposta >= erro) {
				System.out.println("PERGUNTA 10");
				System.out.println("###################################");
				System.out.println("Qual filósofo grego defendia a teoria das quatro causas?");
				System.out.println("1- Aristóteles ");
				System.out.println("2- Sócrates");
				System.out.println("3- Platão");
				System.out.println("4- Heráclito");
				System.out.println("###################################");
				resposta = scan.nextInt();
			}
			switch (resposta) {
			case 1:
				System.out.println(" A resposta esta correta: ");
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
					System.out.println("PERGUNTA BONUS");
					System.out.println("###################################");
					System.out.println(
							"1. Qual filósofo desenvolveu a teoria do " + "cogito, ergo sum" + "(penso, logo existo)?");
					System.out.println("###################################");
					System.out.println("1- Immanuel Kant");
					System.out.println("2- René Descartes");
					System.out.println("3- Jean-Paul Sartre");
					System.out.println("4- Friedrich Nietzsche");
					System.out.println("###################################");
					resposta = scan.nextInt();
					while (resposta >= erro) {
						System.out.println("PERGUNTA BONUS");
						System.out.println("###################################");
						System.out.println("1. Qual filósofo desenvolveu a teoria do " + "cogito, ergo sum"
								+ "(penso, logo existo)?");
						System.out.println("###################################");
						System.out.println("1- Immanuel Kant");
						System.out.println("2- René Descartes");
						System.out.println("3- Jean-Paul Sartre");
						System.out.println("4- Friedrich Nietzsche");
						System.out.println("###################################");
						resposta = scan.nextInt();
					}
				}
				if (resposta == 2) {

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
					System.out.println("###################################");
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
