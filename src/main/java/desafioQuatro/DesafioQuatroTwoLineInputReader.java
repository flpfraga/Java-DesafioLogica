package desafioQuatro;

import java.io.IOException;
import java.util.Scanner;

import input.TwoLineInputReader;

public class DesafioQuatroTwoLineInputReader implements TwoLineInputReader<String>{

	private Scanner ler;


	public DesafioQuatroTwoLineInputReader() {
		this.ler = new Scanner(System.in);
	}


	public String lerEntrada() throws IOException {
		System.out.println("Digite o número de linhas de casos teste.");
		return ler.nextLine();
	}


	public String[] lerDados(Integer tamEntrada) throws IOException {
		int cont = 0;
		String [] dados = new String [tamEntrada];
		do {
			cont++;
			System.out.println("Digite a linha " + cont + " de casos teste.");
			dados[cont - 1] = ler.nextLine();

		} while (cont < tamEntrada);
		System.out.println("Leitura de valores terminada");
		return dados;
	}
}
