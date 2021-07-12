package exer.strategy.pizza;

import org.junit.Test;

public class Teste {

	@Test
	public void test() {
		Forno forno = new Forno();
		forno.assar(new Calabreza());
		forno.assar(new Napolitana());
	}
	
	@Test
	public void lambda() {
		Forno forno = new Forno();
		forno.assar(() -> System.out.println("Pizza lambda 1"));
		forno.assar(() -> System.out.println("Pizza lambda 2"));
	}
	
}
