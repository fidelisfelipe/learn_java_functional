package exer.strategy.matematica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class Teste {
	private List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3));

	@Test
	public void inline() {
		calcular((v1, v2) -> v1 + v2);
		calcular((v1, v2) -> v1 - v2);
		calcular((v1, v2) -> v1 * v2);
	}
	
	@Test
	public void inblock() {
		calcular((v1, v2) -> {
			return v1+v2;
		});
	}
	
	@Test
	public void typed() {
		calcular((Integer v1,Integer v2) -> {
			return v1/v2;
		});
	}
	
	@Test
	public void methodReferency() {
		Matematica2<Integer> m = println();
		calcular(m);
	}

	private Matematica2<Integer> println(){
		return items -> items.forEach(System.out::println);
	}
	
	private void calcular(Matematica m) {
		System.out.println(m.operar(10, 10));
	}
	private void calcular(Matematica2 m) {
		m.operar(lista);
	}
	
}
