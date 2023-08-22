package practica;
import java.util.Scanner;


public class ej3 {
	public static boolean esPrimo(int numero) {
		
		for (int i = 2; i < numero-1; i++) {
			if (numero % i == 0) return false;
		}
		if (numero == 1) return false;
		return true;
	}
	
	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Ingrese un numero: ");
				
			
			if (numero > 100) {
				if(esPrimo(numero)) {
					System.out.println("Es primo");
					System.exit(0);
				}	
			}
		}
	}
}
