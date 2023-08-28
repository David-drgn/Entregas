package FibonacciRecursividade;

public class recursividadeFibonacci {
	
	private static void fibonacciCalc(int anterior, int fibonacci) {
		if(fibonacci == 89) {
			return;
		}
		else {
			fibonacci = fibonacci + anterior;
			anterior = fibonacci - anterior;
			System.out.println("Fibonacci: " + fibonacci +"\n");
			fibonacciCalc(anterior, fibonacci);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fibonacci: " + 1 +"\n");
		int anterior = 0, fibonacci = 1;
		fibonacciCalc(anterior, fibonacci);
	}
}
