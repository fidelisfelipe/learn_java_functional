package exer.strategy.referencia;

import org.junit.Test;

public class Teste {

	@Test
	public void ponteiroFuncional() throws Exception {
		Runnable r1 = () -> System.out.println("rodando em uma thread 1");
		Runnable r2 = () -> {
			System.out.println("rodando em uma thread 2");
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		Thread t2 = new Thread(r2);
		t2.start();
		
		new Thread(() -> System.out.println("outra thread...")).start();
		
		
	}
	
}
