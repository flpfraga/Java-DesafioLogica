package validations;

import java.io.IOException;

public interface ValidyInput<D> {

	void validyEntrada(D entrada) throws NullPointerException, IOException;

}