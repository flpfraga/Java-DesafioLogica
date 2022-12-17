package desafioTres;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import input.TwoLineInputReader;

public class DesafioTresTwoLineInputReader implements TwoLineInputReader<String>{
	
	private Scanner ler;


	public DesafioTresTwoLineInputReader() {
		this.ler = new Scanner(System.in);
	}

	public String lerEntrada() throws IOException {
		System.out.println("Digite o tamanho do array e o valor alvo. Os valores devem ser separados por apenas um espaco.");
		return ler.nextLine();
	}

	public String[] lerDados(Integer tamEntrada) throws IOException {
		System.out.println("Digite os valores do array separados por apeans um espaco.");
		String [] leitura = new String [1];
		leitura[0] = ler.nextLine();
		return leitura;
	}

}
