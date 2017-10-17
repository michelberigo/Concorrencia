package condicaoCorrida;

public class Thread implements Runnable {
	private final Counter counter;
	private final int value;

	public Thread (Counter counter, int value) {
        this.counter = counter;
        this.value = value;
    }

	public void run() {
		System.out.println("Meu valor é: " + value);
        counter.add(value);
    }
}
