package desafioQuatro;

import validations.ValidyInput;

public class DesafioQuatroValidyInput implements ValidyInput<Integer>{

	public void validyEntrada(Integer entrada) throws NullPointerException {
		if (entrada == null) {
			throw new NullPointerException("Entrada para número de casos teste deve ser un numero valido, maior que 0.");
		}
		if (entrada.equals("")) {
			throw new NullPointerException("Entrada para número de casos teste deve ser un numero valido, maior que 0.");
		}
		if (entrada < 1) {
			throw new NullPointerException("A entrada deve ser um valor positivo.");
		}
		
	}

}
