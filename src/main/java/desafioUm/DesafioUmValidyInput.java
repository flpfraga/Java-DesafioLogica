package desafioUm;

import validations.ValidyInputAndData;

public class DesafioUmValidyInput implements ValidyInputAndData<Integer> {

	public void validyEntrada(Integer entrada) throws NullPointerException {
		if (entrada == null || entrada < 1) {
			throw new NullPointerException("O valor da entrada deve ser maior que 0!");
		}
	}

	public void validyDados(Integer[] valoresEntrada) throws NullPointerException {
		for (int c = 0; c < valoresEntrada.length; c++) {
			if (valoresEntrada[c] == null || valoresEntrada[c] < 1) {
				throw new NullPointerException();
			}
		}
	}


}
