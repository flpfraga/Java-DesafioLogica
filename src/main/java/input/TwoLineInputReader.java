package input;

import java.io.IOException;

public interface TwoLineInputReader<T> extends InputReader<T>{

	T lerEntrada() throws IOException;
	
	T [] lerDados(Integer tamEntrada) throws IOException;
	
	

}
