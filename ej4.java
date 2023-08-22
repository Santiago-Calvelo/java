package practica;
import java.util.Scanner;
import java.util.ArrayList;


public class ej4 {
	public static void sumar() {
        ArrayList<Integer> numeros = new ArrayList<>();
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa números (0 para dejar de igresar):");

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            numeros.add(n);
        }
        
        // para cada espacio del array se crea un numero que se le asigna el valor de ese espacio
        for (int num : numeros) {
        	// se suman todos los numeros
        	sum += num;
        }
        System.out.println("Resultado: " + sum);
	}
	
	public static void restar() {
        ArrayList<Integer> numeros = new ArrayList<>();
        int res = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa números (0 para dejar de igresar):");

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            numeros.add(n);
        }
        
        // para cada espacio del array se crea un numero que se le asigna el valor de ese espacio
        for (int num : numeros) {
        	// reviso que no sea 
        	if (res == 0) res = num;
        	else res -= num;
        }
        System.out.println("Resultado: " + res);
	}
	
	public static void multiplicar() {
        ArrayList<Integer> numeros = new ArrayList<>();
        int mult = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa números (0 para dejar de igresar):");

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            numeros.add(n);
        }
        
        for (int num : numeros) {
        	if (mult == 0) mult = num;
        	else mult *= num;
        }
        System.out.println("Resultado: " + mult);
	}
	
	public static void dividir() {
        ArrayList<Integer> numeros = new ArrayList<>();
        int div = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa números (0 para dejar de ingresar):");

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            numeros.add(n);
        }
        
        for (int num : numeros) {
        	if (div == 0) div = num;
        	else div /= num;
        }
        System.out.println("Resultado: " + div);
	}
	
	public static void main(String[] args) {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("1) Sumar");
			System.out.println("2) Restar");
			System.out.println("3) Multiplicar");
			System.out.println("4) Dividir");
			
			System.out.println("5) Salir");
			System.out.println("Elija una opcion");
			
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1: 
				sumar();
				break;
			case 2:
				restar();
				break;
			case 3:
				multiplicar();
				break;
			case 4:
				dividir();
				break;
			case 5:
				System.exit(0);
			}
		}
	}
}
