package input;

import java.io.IOException;

public interface InputReader<T> {

	T lerEntrada() throws IOException;

}