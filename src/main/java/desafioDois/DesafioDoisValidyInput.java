package desafioDois;

import validations.ValidyInput;

public class DesafioDoisValidyInput implements ValidyInput<Float> {

	public void validyEntrada(Float entrada) throws NullPointerException {
		if (entrada == null || entrada < 0) {
			throw new NullPointerException();
		}
	}

}
