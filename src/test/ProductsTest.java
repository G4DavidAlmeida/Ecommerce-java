package test;

import java.util.Calendar;

import app.*;

public class ProductsTest {
	public static void main(String[] args) {
		
		Televisao televisao = new Televisao("Televisão1", "fabricante televisão", 1000, 2, "100x300", "1000 polegadas");
		Computador computador = new Computador("computador1", "fabricante computador", 3500, "HD 2TB", "RAM 8GB DDR4", "Intel Core I5 10th Geração");
		
		Calendar validade = Calendar.getInstance();
		Cerveja cerveja = new Cerveja("cerveja1", "fabricante cerveja", 5, 2.5, validade);
		System.out.println("Referencia tv: " + televisao);
		System.out.println("Referencia computador: " + computador);
		System.out.println("Referencia cerveja: " + cerveja);
	}
}
