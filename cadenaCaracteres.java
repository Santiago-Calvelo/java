package practicando;
import java.util.Scanner;

public class cadenaCaracteres {
	public static void ingresarNombre() {
		Scanner scanner = new Scanner(System.in);
		String nombre;
		
		System.out.print("Ingrese su nombre: ");
		nombre = scanner.next();
		
		System.out.println("" + nombre);
	}
	
	public static void contarCaracteres() {
		Scanner scanner = new Scanner(System.in);
		String word;
		
		System.out.print("Ingrese una palabra: ");
		word = scanner.next();
		int count = word.length();
		
		System.out.println("Cantidad de caracteres: " + count);
	}
	
	public static void palindromo() {
		boolean check = true;
		Scanner scanner = new Scanner(System.in);
		String word;
		
		System.out.print("Ingrese una palabra ");
		word = scanner.next();
		
		int length = word.length();
		for (int i = 0; i < length /2; i++) {
			char ci = word.charAt(i);
			if (Character.isUpperCase(word.charAt(i))) ci = Character.toLowerCase(word.charAt(i));
			if (ci != word.charAt(length - 1 - i)) check = false; 
		}
		
		if (check) System.out.println("La palabra " + word + " es palindromo");
		else	   System.out.println("La palabra " + word + " no es palindromo");
	}
	
	public static void reemplazarCaracter() {
		Scanner scanner = new Scanner(System.in);
		String word, ch1, ch2;
		
		System.out.print("Ingrese una palabra: ");
		word = scanner.next();
		
		System.out.print("Ingrese el caracter a reemplazar: ");
		ch1 = scanner.next();
		System.out.print("Ingrese el caracter con el que reemplazar reemplazar: ");
		ch2 = scanner.next();
		
		int length = word.length();
		
		for (int i = 0; i < length; i++) {
			if (word.charAt(i) == ch1.charAt(0)) word = word.replace(word.charAt(i), ch2.charAt(0));
		}
		
		System.out.println("Palabra modificada: " + word);
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("1) Ejercicio 1: ingresar nombre");
			System.out.println("2) Ejercicio 2: contar caracteres");
			System.out.println("3) Ejercicio 3: es palindromo");
			System.out.println("4) Ejercicio 4: reemplazar caracter");
			System.out.println("5) Ejercicio 5: anagrama");
			System.out.println("6) Ejercicio 6: la mas larga");
			System.out.println("7) Salir");
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Elija una opcion");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				ingresarNombre();
				break;
			case 2:
				contarCaracteres();
				break;
			case 3:
				palindromo();
				break;
			case 4:
				reemplazarCaracter();
				break;
			case 5:
				//anagrama();
				break;
			case 6:
				//laMasLarga();
				break;
			case 7:
				System.exit(0);
			default:
				System.out.println("Ingrese una opcion valida");
				break;
				
			}
		}
	}
}
