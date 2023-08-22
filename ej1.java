package practica;

public class ej1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.printf("%d ", i);
				System.out.println("Par");
			}
			else System.out.printf("%d%n", i);
		}
	}
}