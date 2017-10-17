package condicaoCorrida;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main (String[] args) {
		Counter counter = new Counter ();
		
		ExecutorService e = Executors.newFixedThreadPool(2);
		
		e.execute(new Thread(counter, 2));
	    e.execute(new Thread(counter, 3));
	     
	    e.shutdown();
	}
}
