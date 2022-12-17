package desafioUm;

import java.io.IOException;
import java.util.Scanner;

import input.TwoLineInputReader;
import validations.ValidyInput;

public class DesafioUmTwoLineInputReader implements TwoLineInputReader<Integer> {

	private Scanner ler;


	public DesafioUmTwoLineInputReader() {
		this.ler = new Scanner(System.in);
	}

	public Integer lerEntrada() throws IOException {
		System.out.println("Digite o numero de entradas que se deseja.");
		return ler.nextInt();
	}

	public Integer [] lerDados(Integer tamEntrada) throws IOException {
		int cont = 0;
		Integer[] dados = new Integer [tamEntrada];
		do {
			cont++;
			System.out.println("Digite o valor da entrada de numero " + cont);
			dados[cont - 1] = ler.nextInt();

		} while (cont < tamEntrada);
		System.out.println("Leitura de valores terminada");
		return dados;
	}



}
