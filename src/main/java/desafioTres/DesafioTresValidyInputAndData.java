package desafioTres;

import java.io.IOException;

import validations.ValidyInputAndData;

public class DesafioTresValidyInputAndData implements ValidyInputAndData<String>{

	public void validyEntrada(String entrada) throws NullPointerException, IOException {
		if (entrada.length() < 3) {
			throw new IOException("Parametros insulficientes!");
		}
		if (!entrada.contains(" ")) {
			throw new IOException("Insira um espaco em branco entre os numeros de entrada!");
		}
		String [] aux = entrada.split(" ");
		if (aux.length < 2) {
			throw new IOException("Parametros insulficientes! Insira apenas um espaco em branco entre os numeros de entrada!");
		}
		if (aux[0]==null || aux[0].equalsIgnoreCase("")) {
			throw new IOException("Parametros inválidos! O primeiro valor deve ser maior que 0 e o segundo deve ser maior ou igual a zero. Insira um espaco em branco entre os numeros!");
		}
		if (aux[1]==null || aux[0].equalsIgnoreCase("")) {
			throw new IOException("Parametros inválidos! O primeiro valor deve ser maior que 0 e o segundo deve ser maior ou igual a zero. Insira um espaco em branco entre os numeros!");
		}
		
	}


	public void validyDados(String[] entrada) throws NullPointerException {
		// TODO Auto-generated method stub
		
	}

}
