package desafioDois;

import java.io.IOException;
import java.util.InputMismatchException;

import input.InputReader;

public class Guloso {

	private InputReader<Float> input;

	private int[] notas;

	private int[] moedas;

	private final int[] valorNotas = new int[] { 2, 5, 10, 20, 50, 100 };
	private final int[] valorMoedas = new int[] { 1, 5, 10, 25, 50, 100 };

	public Guloso() {
		this.notas = new int[6];
		this.moedas = new int[6];
		this.input = new DesafioDoisInputReader();
	}

	public void resolveDesafio() {
		
		
		try {
			Float valor = getEntrada();
			
			int parteInteira = (int) (valor * 1);

			int parteDecimal = (int) ((valor * 100) - parteInteira * 100);

			parteDecimal += trocarPorNotas(parteInteira) * 100;

			trocarPorMoedas(parteDecimal);

			printNotas();
			printMoedas();

		} catch (InputMismatchException e) {
			System.out.println("Erro! " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Erro! " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Erro! " + e.getMessage());
		}

	}

	public int trocarPorNotas(int parteInteira) {

		for (int c = 5; c >= 0; c--) {
			notas[c] = parteInteira / valorNotas[c];
			parteInteira = parteInteira % valorNotas[c];
		}
		return parteInteira;
	}

	public void trocarPorMoedas(int parteDecimal) {

		for (int c = 5; c >= 0; c--) {
			moedas[c] = parteDecimal / valorMoedas[c];
			parteDecimal = parteDecimal % valorMoedas[c];
		}

	}

	public void printNotas() {
		System.out.println("NOTAS:");
		for (int c = 5; c >= 0; c--) {
			System.out.println(notas[c] + " nota(s) de R$" + valorNotas[c]);
		}
	}

	public void printMoedas() {
		System.out.println("MOEDAS:");
		for (int c = 5; c >= 0; c--) {
			System.out.println(moedas[c] + " nota(s) de R$" + valorMoedas[c]);
		}
	}
	
	public Float getEntrada() throws IOException {
		try {
			Float entrada = input.lerEntrada();
			return entrada;
		} catch (IOException e) {
			throw new IOException(e.getMessage());
		}
	}

}
