package exer.strategy.matematica;

import java.util.List;
//SAM
@FunctionalInterface
public interface Matematica2 <T>{
	void operar(List<? extends T> items);
}
