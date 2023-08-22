package practica;

public class ej2 {
	public static boolean esPrimo(int n) {
		
		for (int i = 2; i < n-1; i++) {
			if (n % i == 0) return false;
		}
		if (n == 1) return false;
		return true;
	}
	
	public static void divisores(int n) {
		System.out.print("Sus divisores son: ");
		for (int i = 1; i < n; i++) {
			if(n % i == 0) System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		for (int i = 50; i <= 100; i++) {
			if (esPrimo(i)) System.out.println("El numero es primo: " + i);
			else divisores(i);
		}
	}
}
