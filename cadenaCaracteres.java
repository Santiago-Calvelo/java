package cadenaCaracteres;
import java.util.Scanner;

public class cadenaCaracteres {
	public static void ingresarNombre() {
		Scanner scanner = new Scanner(System.in);
		String nombre;
		
		System.out.print("Ingrese su nombre: ");
		nombre = scanner.next();
		
		System.out.println("" + nombre);
	}
	
	public static void contarVocales() {
		Scanner scanner = new Scanner(System.in);
		String word;
		
		System.out.print("Ingrese una palabra: ");
		word = scanner.next();
		int length = word.length();
		int count = 0;
		
		for (int i = 0; i < length; i++) {
			if (Character.toLowerCase(word.charAt(i)) == 'a') count++;
			else if (Character.toLowerCase(word.charAt(i)) == 'e') count++;
			else if (Character.toLowerCase(word.charAt(i)) == 'i') count++;
			else if (Character.toLowerCase(word.charAt(i)) == 'o') count++;
			else if (Character.toLowerCase(word.charAt(i)) == 'u') count++;
		}
		System.out.println("La cantidad de vocales de la palabra es: " + count);
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
	
	public static void anagrama() {
		Scanner scanner = new Scanner(System.in);
		String w1, w2;
		
		System.out.print("Ingrese dos palabras para revisar si son anagramas: ");
		w1 = scanner.next();
		w2 = scanner.next();
	
		if (w1.length() == w2.length()) {
			int count = 0;
			
			for (int i = 0; i < w1.length(); i++) {
				for (int j = 0; j < w1.length(); j++) {
					if (w1.charAt(i) == w2.charAt(j)) {
						count++;
						break;
					}
				}
			}
			if (count == w1.length()) System.out.println("La palabra " + w1 + " y " + w2 + " son anagramas");
			else 					  System.out.println("Las palabras no son anagramas");
		}
		else System.out.println("Las palabras no son anagramas");
	}
	
	public static void laMasLarga() {
		Scanner scanner = new Scanner(System.in);
		String w1, w2, w3, w4, w5;
		
		System.out.print("Ingrese 5 palabras: ");
		w1 = scanner.next();
		w2 = scanner.next();
		w3 = scanner.next();
		w4 = scanner.next();
		w5 = scanner.next();
		
		int l1 = w1.length();
		int l2 = w2.length();
		int l3 = w3.length();
		int l4 = w4.length();
		int l5 = w5.length();
		
		String[] words = {w1,w2,w3,w4,w5};
		int[] lengths = {l1,l2,l3,l4,l5};
		int max = 0;
		int idx = 0;
		
		for (int i = 0; i < 5; i++) {
			if (max < lengths[i]) { max = lengths[i]; idx = i; }
		}
		
		System.out.println("La palabra mas larga es: " + words[idx]);	
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("1) Ejercicio 1: ingresar nombre");
			System.out.println("2) Ejercicio 2: contar vocales");
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
				contarVocales();
				break;
			case 3:
				palindromo();
				break;
			case 4:
				reemplazarCaracter();
				break;
			case 5:
				anagrama();
				break;
			case 6:
				laMasLarga();
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
