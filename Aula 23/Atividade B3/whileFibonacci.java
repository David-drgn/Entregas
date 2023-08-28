package FibonacciFor;

public class whileFibonacci {

	public static void main(String[] args) {
		int aux = 0;
		int fibonacci = 1;
		System.out.println("Fibonacci: " + fibonacci +"\n");
		while(fibonacci < 89) {
			fibonacci = aux + fibonacci;
			aux = fibonacci - aux;
			System.out.println("Fibonacci: " + fibonacci +"\n");
		}
	}
}