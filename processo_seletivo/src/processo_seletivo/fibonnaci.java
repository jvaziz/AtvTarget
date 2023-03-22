package processo_seletivo;
import java.util.Scanner;

public class fibonnaci {

	public static void main(String[] args) {
		System.out.print("Digite um número: ");
		Scanner scan = new Scanner(System.in);
	    int numero = scan.nextInt();

	    boolean pertence = false;
	    int a = 0, b = 1, c = 1;

	    while (c < numero) {
	      c = a + b;
	      a = b;
	      b = c;
	    }

	    if (c == numero) {
	      pertence = true;
	    }

	    if (pertence) {
	      System.out.println(numero + " pertence à sequência de Fibonacci.");
	    } else {
	      System.out.println(numero + " não pertence à sequência de Fibonacci.");
	    }

	}

}
