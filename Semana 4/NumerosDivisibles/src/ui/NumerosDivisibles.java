package ui;

import java.util.Scanner;

/**
 * <pre>
 * <strong>Descripción del programa: </strong> 
 * La clase NumerosDivisibles es un programa que permite al usuario calcular la suma de todos los números enteros divisibles 
 * por 5 ubicados entre dos números enteros m y n. 
 * 
 * <strong>Inputs:</strong> int m, int n
 * <strong>Outputs:</strong> int sumDiv5
 *
 * Example: 
 * Sean int m = 2 e int n = 8  
 * Mensaje por consola: La suma de los enteros divisibles por 5 entre 2 y 8 (inclusivo) es: 5
 * </pre>
 */

public class NumerosDivisibles {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido a Numeros Divisibles");

		System.out.println("Digite el primer número");

		int m = sc.nextInt();

		System.out.println("Digite el segundo número");
		int n = sc.nextInt();

		int[] arregloNumeros = inicializarArreglo(m, n);

		int sumaDiv5 = sumaDivisibles(arregloNumeros);

		System.out.println("La suma de los enteros divisibles por 5 entre " + m + " y " + n + " (inclusivo) es: " + sumaDiv5);

	}
	
	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo inicializarArreglo permite crear un arreglo de números enteros a partir 
	 *de los números enteros límite proporcionados por el usuario
	 *@param m <strong>int</strong> Primer numero entero
	 *@param n <strong>int</strong> Segundo numero entero
	 *@return arregloNumeros <strong>int[]</strong> Arreglo de enteros con la sucesión de números enteros ubicada entre los números proporcionados
	 * </pre>
	 */
	public static int[] inicializarArreglo(int m, int n) {

		int[] arregloNumeros = new int[Math.abs(n - m) + 1];

		for (int i = 0; i < arregloNumeros.length; i++) {

			if(m<n) {
				arregloNumeros[i] = m++;
			}else {
				arregloNumeros[i] = n++;
			}
			

		}

		return arregloNumeros;

	}

	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo sumaDivisibles permite calcular la suma de los números enteros divisibles 
	 * por 5 almacenados en un arreglo.
	 *@param arregloNumeros <strong>int[]</strong> Arreglo de enteros
	 *@return sumaNumerosDivisibles <strong>int</strong> Entero correspondiente a la suma de los enteros divisibles entre 5 del arreglo.
	 * </pre>
	 */
	public static int sumaDivisibles(int[] arregloNumeros) {

		int sumaNumerosDivisibles = 0;

		for (int i = 0; i < arregloNumeros.length; i++) {

			if (arregloNumeros[i] % 5 == 0) {
				sumaNumerosDivisibles += arregloNumeros[i];

			}
		}

		return sumaNumerosDivisibles;

	}

}
