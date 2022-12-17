import java.util.Scanner;

import desafioDois.Guloso;
import desafioQuatro.Impressora;
import desafioTres.DiferencaDosPares;
import desafioUm.SortByType;

public class Startup {

	public static void Menu(Scanner ler) {
		Integer entrada = 0;
		do {
			System.out.println("Para selecionar:");
			System.out.println("Desafio 1 - Digite 1");
			System.out.println("Desafio 2 - Digite 2");
			System.out.println("Desafio 3 - Digite 3");
			System.out.println("Desafio 4 - Digite 4");
			System.out.println("Sair      - Digite 0");
			entrada = ler.nextInt();
			switch (entrada) {
			case 1:
				SortByType sort = new SortByType();
				sort.resolveDesafio();
				break;

			case 2:
				Guloso goluso = new Guloso();
				goluso.resolveDesafio();
				break;
				
			case 3:
				DiferencaDosPares diferencaDosPares = new DiferencaDosPares();
				diferencaDosPares.resolveDesafio();
				break;
			case 4:
				Impressora impressora = new Impressora();
				impressora.resolveDesafio();
				break;

			case 0:
				break;
			default:
				System.out.println("Opcao invalida!");
			}
		} while (entrada != 0);

	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Menu(ler);

	}

}
