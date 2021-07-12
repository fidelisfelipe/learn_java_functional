package exer.strategy.pizza;

public class Napolitana implements Pizza {

	@Override
	public void preparar() {
		System.out.println("massa, presunto, queijo, tomate e oregano");
	}

}
