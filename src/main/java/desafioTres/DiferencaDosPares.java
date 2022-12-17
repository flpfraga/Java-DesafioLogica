package desafioTres;

import java.io.IOException;
import java.util.InputMismatchException;

import input.TwoLineInputReader;
import validations.ValidyInputAndData;

public class DiferencaDosPares {

	private TwoLineInputReader<String> input;

	private ValidyInputAndData<String> validy;

	private Integer alvo;

	private Integer[] arr;
	
	private Integer resultado;

	public DiferencaDosPares() {
		this.input = new DesafioTresTwoLineInputReader();

		this.validy = new DesafioTresValidyInputAndData();
		
		this.resultado = 0;
	}

	public void resolveDesafio() {
		try {
			String entrada = getEntrada();
			validy.validyEntrada(entrada);
			Integer[] resp = converter(entrada);
			atribuiValores(resp);
			String [] dados = getDados();
			arr = converter(dados[0]);
			diferencaIgualAoAlvo();
			print();

		} catch (IOException e) {
			System.out.println("Erro! " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Erro! " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Erro! " + e.getMessage());
		} 

	}
	
	private void diferencaIgualAoAlvo() {
		int size = arr.length;
		for (int c = 0; c <  size; c++) {
			for (int k = 0; k < size; k++) {
				Integer subtracao = arr[c] - arr[k];
				if (subtracao == alvo) {
					this.resultado++;
				}
			}
		}
	}

	private void atribuiValores(Integer[] resp) {
		this.arr = new Integer[resp[0]];
		this.alvo = resp[1];
	}

	private Integer[] converter(String entrada) throws NumberFormatException {
		String[] aux = entrada.split(" ");
		int size = aux.length;
		Integer[] convertidos = new Integer[size];
		try {
			for (int c = 0; c < size; c++) {
				convertidos[c] = Integer.parseInt(aux[c]);
			}
			return convertidos;
		} catch (NumberFormatException e) {
			throw new NumberFormatException("O valor informado não é um número válido!");
		}

	}

	private String getEntrada() throws IOException {
		try {
			String entrada = input.lerEntrada();
			return entrada;
		} catch (IOException e) {
			throw new IOException(e.getMessage());
		}
	}

	private String [] getDados() throws IOException {
		try {
			String[] dados = input.lerDados(1);
			return dados;
		} catch (IOException e) {
			throw new IOException(e.getMessage());
		}
	}
	
	private void print () {
		System.out.println(this.resultado);
	}
}
