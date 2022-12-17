package desafioQuatro;

import java.io.IOException;
import java.util.InputMismatchException;

import input.TwoLineInputReader;
import validations.ValidyInput;

public class Impressora {

	private TwoLineInputReader<String> input;
	
	private ValidyInput<Integer> validy;
	
	private String [] dados;
	
	
	public Impressora() {
		this.input = new DesafioQuatroTwoLineInputReader();
		
		this.validy = new DesafioQuatroValidyInput();
	}
	
	public void resolveDesafio() {
		try {
			String entrada = input.lerEntrada();
			Integer entradaInteiro = converter(entrada);
			validy.validyEntrada(entradaInteiro);
			dados = input.lerDados(entradaInteiro);
			reparaBug();
			print();
		} catch (IOException e) {
			System.out.println("Erro! "+ e.getMessage());
		}catch (InputMismatchException e) {
			System.out.println("Erro! "+ e.getMessage());
		}catch (NullPointerException e) {
			System.out.println("Erro! "+ e.getMessage());
		}catch (NumberFormatException e) {
			System.out.println("Erro! "+ e.getMessage());
		}
	}
	
	private void reparaBug() {
		int size = dados.length;
		
		for (int c = 0; c < size; c++) {
			String linha = dados[c];
			int meio = linha.length()/2;
			String inicio = new StringBuilder(linha.substring(0, meio)).reverse().toString();
			String fim = new StringBuilder(linha.substring(meio, linha.length())).reverse().toString();
			dados[c] = inicio + "" +fim;
		}
	}

	private Integer converter(String entrada) throws NumberFormatException{
		try {
			Integer resp = Integer.parseInt(entrada);
			return resp;
		}catch (NumberFormatException e) {
			throw new NumberFormatException("Insira um numero intero positivo valido.");
		}
	}
	
	private void print() {
		for (int c = 0; c < dados.length; c++) {
			System.out.println(dados[c]);
		}
	}

	
	
}
