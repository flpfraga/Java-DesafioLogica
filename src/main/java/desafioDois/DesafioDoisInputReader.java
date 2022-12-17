package desafioDois;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import input.InputReader;

public class DesafioDoisInputReader implements InputReader<Float>{
private Scanner ler;
	

	public DesafioDoisInputReader() {
		this.ler = new Scanner(System.in);
		this.ler.useLocale(Locale.US);
	}

	public Float lerEntrada() throws IOException{

		System.out.println("Digite um numero com duas casas decimais. Utilize \".\" para separa os inteiros dos decimais.");
		Float valor = ler.nextFloat();
		return valor;

	}




}
