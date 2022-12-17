package validations;

import java.io.IOException;

public interface ValidyInputAndData<D> extends ValidyInput<D>{

	void validyDados(D [] entrada) throws NullPointerException, IOException;

}