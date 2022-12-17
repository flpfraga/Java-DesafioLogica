package desafioUm;

import java.io.IOException;
import java.util.InputMismatchException;

import input.TwoLineInputReader;
import validations.ValidyInputAndData;

public class SortByType {

	private TwoLineInputReader<Integer> input;

	private ValidyInputAndData<Integer> validy;
	
	private Integer[] dados;

	public SortByType() {
		this.input = new DesafioUmTwoLineInputReader();
		this.validy = new DesafioUmValidyInput();
	}

	public void resolveDesafio() {

		Integer entrada;
		try {
			entrada = getEntrada();
			dados = getDados(entrada);
			separarParImpar();
			ordenaParCrescente();
			ordenaImparDecrescente();
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	private void separarParImpar() {
		int tam = dados.length;

		Integer[] aux = new Integer[tam];

		int indexPar = 0;
		int indexImpar = tam - 1;

		for (int c = 0; c < tam; c++) {
			if (dados[c] % 2 == 0) {
				aux[indexPar++] = dados[c];
			} else {
				aux[indexImpar--] = dados[c];
			}
		}
	}

	private void ordenaParCrescente() {
		int tam = dados.length;
		for (int c = 0; c < tam; c++) {
			for (int k = c + 1; k < tam; k++) {
				if (dados[k] % 2 != 0) {
					continue;
				}
				if (dados[c] > dados[k]) {
					Integer aux = dados[c];
					dados[c] = dados[k];
					dados[k] = aux;
				}
			}

		}
	}

	private void ordenaImparDecrescente() {
		int tam = dados.length - 1;
		for (int c = tam; c > 0; c--) {
			for (int k = c - 1; k > 0; k--) {
				if (dados[k] % 2 == 0) {
					continue;
				}
				if (dados[c] > dados[k]) {
					Integer aux = dados[c];
					dados[c] = dados[k];
					dados[k] = aux;
				}
			}
		}
	}

	private void print() {
		int tam = dados.length;
		for (int c = 0; c < tam; c++) {
			System.out.println(dados[c]);
		}
	}

	public Integer getEntrada() throws IOException, NullPointerException, InputMismatchException {
		try {
			Integer entrada = input.lerEntrada();
			validy.validyEntrada(entrada);
			return entrada;
		} catch (IOException e) {
			throw new IOException("Erro ao ler entrada! " + e.getMessage());
		}

	}
	
	public Integer [] getDados(Integer entrada) throws IOException, NullPointerException, InputMismatchException{
		try {
			Integer [] dados = input.lerDados(entrada);
			validy.validyDados(dados);
			return dados;
		} catch (IOException e) {
			throw new IOException("Erro ao ler dados! " + e.getMessage());
		}
	}

}
