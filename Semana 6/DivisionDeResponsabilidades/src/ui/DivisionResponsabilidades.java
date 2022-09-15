package ui;

import java.util.Scanner;

/**
 * <pre>
 * <strong>Descripción del programa: </strong> La clase
 * DivisionResponsabilidades es un programa que permite al usuario inicializar
 * dos arreglos, mostrar su contenido, modificar su contenido dada una posición,
 * modificar todo su contenido, modificar solo las posiciones pares, modificar
 * solo las posiciones impares y obtener un arreglo resultante de la suma de
 * ambos arreglos.
 * 
 * <strong>Inputs:</strong> int Valores enteros para cada posición del arreglo
 * <strong>Outputs:</strong> Mensajes por consola con el identificador del
 * arreglo y la información de cada elemento del arreglo
 *
 */

public class DivisionResponsabilidades {

	// Variables globales
	static int[] numbers1, numbers2;
	static Scanner sc = new Scanner(System.in);

	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo init, de tipo constructor, permite inicializar los arreglos, 
	 *dado un tamaño, y el Scanner
	 *<strong>pre:</strong> numbers1 <strong>int[]</strong> debe estar declarado
	 *<strong>pre:</strong> numbers2 <strong>int[]</strong> debe estar declarado
	 *<strong>pre:</strong> lector <strong>Scanner</strong> debe estar declarado
	 *<strong>pos:</strong> numbers1 <strong>int[]</strong> queda inicializado con tamaño size
	 *<strong>pos:</strong> numbers2 <strong>int[]</strong> queda inicializado con tamaño size
	 *<strong>pos:</strong> lector <strong>int[]</strong> queda inicializado para leer entradas por consola
	 *@param size <strong>int</strong> Tamaño de los arreglos
	 *@return void
	 * </pre>
	 */
	public static void init(int size) {

		numbers1 = new int[size];
		numbers2 = new int[size];
		sc = new Scanner(System.in);

	}

	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo setValue, de tipo modificador, permite asignar el valor newValue, 
	 *en la posición index del arreglo numbers
	 *<strong>pre:</strong> numbers <strong>int[]</strong> debe estar inicializado
	 *<strong>pos:</strong> numbers <strong>int[]</strong> queda modificado en la posición index con el valor newValue
	 *@param numbers <strong>int[]</strong> Arreglo en el que se va a operar
	 *@param index <strong>int</strong> Indice, indica la posición en el arreglo
	 *@param newValue <strong>int</strong> Valor que se va a asignar en el arreglo
	 *@return void
	 * </pre>
	 */
	public static void setValue(int[] numbers, int index, int newValue) {

		numbers[index] = newValue;

	}

	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo setAllValues, de tipo modificador, permite asignar nuevos valores, 
	 *obtenidos por consola, a cada posición del arreglo numbers
	 *<strong>pre:</strong> numbers <strong>int[]</strong> debe estar inicializado
	 *<strong>pre:</strong> lector <strong>Scanner</strong> debe estar inicializado
	 *<strong>pos:</strong> numbers <strong>int[]</strong> queda modificado cada una de sus posiciones con cada nuevo valor obtenido por consola 
	 *@param numbers <strong>int[]</strong> Arreglo en el que se va a operar
	 *@return void
	 * </pre>
	 */
	public static void setAllValues(int[] numbers) {

		System.out.println("\nType the values for array: " + toString(numbers));

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Type the new value for the element " + (i + 1) + ", real position " + i);
			setValue(numbers, i, sc.nextInt());
		}

	}

	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo setOddValues, de tipo modificador, permite asignar nuevos valores, 
	 *obtenidos por consola, a cada posición impar del arreglo numbers
	 *<strong>pre:</strong> numbers <strong>int[]</strong> debe estar inicializado
	 *<strong>pre:</strong> lector <strong>Scanner</strong> debe estar inicializado
	 *<strong>pos:</strong> numbers <strong>int[]</strong> queda modificado cada una de sus posiciones impares con cada nuevo valor obtenido por consola 
	 *@param numbers <strong>int[]</strong> Arreglo en el que se va a operar
	 *@return void
	 * </pre>
	 */
	public static void setOddValues(int[] numbers) {

		System.out.println("\nType the odd position values for array: " + toString(numbers));

		for (int i = 0; i < numbers.length; i += 2) {
			System.out.println("Type the new value for the element " + (i + 1) + ", real position " + i);
			setValue(numbers, i, sc.nextInt());
		}

	}

	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo setEvenValues, de tipo modificador, permite asignar nuevos valores, 
	 *obtenidos por consola, a cada posición par del arreglo numbers
	 *<strong>pre:</strong> numbers <strong>int[]</strong> debe estar inicializado
	 *<strong>pre:</strong> lector <strong>Scanner</strong> debe estar inicializado
	 *<strong>pos:</strong> numbers <strong>int[]</strong> queda modificado cada una de sus posiciones pares con cada nuevo valor obtenido por consola 
	 *@param numbers <strong>int[]</strong> Arreglo en el que se va a operar
	 *@return void
	 * </pre>
	 */
	public static void setEvenValues(int[] numbers) {

		System.out.println("\nType the even position values for array: " + toString(numbers));

		for (int i = 1; i < numbers.length; i += 2) {
			System.out.println("Type the new value for the element " + (i + 1) + ", real position " + i);
			setValue(numbers, i, sc.nextInt());
		}

	}

	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo getValueOf, de tipo analizador, permite obtener un valor, 
	 *del arreglo numbers, según la posición index
	 *<strong>pre:</strong> numbers <strong>int[]</strong> debe estar inicializado
	 *@param numbers <strong>int[]</strong> Arreglo en el que se va a operar
	 *@param index <strong>int</strong> Indice, indica la posición en el arreglo
	 *@return <strong>int</strong> Valor del arreglo en la posición index
	 * </pre>
	 */
	public static int getValueOf(int[] numbers, int index) {

		return numbers[index];

	}

	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo getAllValues, de tipo analizador, permite imprimir por consola, 
	 *el id en memoria del arreglo numbers y todos los valores almacenados en el arreglo
	 *<strong>pre:</strong> numbers <strong>int[]</strong> debe estar inicializado
	 *@param numbers <strong>int[]</strong> Arreglo en el que se va a operar
	 *@return void
	 * </pre>
	 */
	public static void getAllValues(int[] numbers) {

		System.out.println("\nThe array " + numbers.toString() + " content is: " + toString(numbers));

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("The element " + (i + 1) + " is " + getValueOf(numbers, i));

		}

	}

	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo sumArrays, de tipo analizador, permite sumar dos arreglos
	 *numbers1 y numbers2 y retornar el arreglo numbers resultante
	 *<strong>pre:</strong> numbers1 <strong>int[]</strong> debe estar inicializado
	 *<strong>pre:</strong> numbers2 <strong>int[]</strong> debe estar inicializado
	 *@param numbers1 <strong>int[]</strong> El primer arreglo a sumar
	 *@param numbers2 <strong>int[]</strong> El segundo arreglo a sumar
	 *@return numbers <strong>int[]</strong> El arreglo resultante de la suma de numbers1 y numbers2
	 * </pre>
	 */
	public static int[] sumArrays(int[] numbers1, int[] numbers2) {

		int[] numbers = new int[numbers1.length];

		for (int i = 0; i < numbers.length; i++) {

			setValue(numbers, i, getValueOf(numbers1, i) + getValueOf(numbers2, i));
		}

		return numbers;
	}

	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo toString, de tipo analizador, permite convertir
	 *el arreglo numbers en una cadena de texto y retornarla
	 *<strong>pre:</strong> numbers <strong>int[]</strong>
	 *@param numbers <strong>int[]</strong> Arreglo en el que se va a operar
	 *@return msg <strong>String</strong> Cadena de texto resultante
	 * </pre>
	 */
	public static String toString(int[] numbers) {

		String msg = "";

		for (int i = 0; i < numbers.length; i++) {

			if (i == 0) {
				msg += "[ " + numbers[i] + " | ";
			} else if (i < numbers.length - 1) {
				msg += numbers[i] + " | ";
			} else {
				msg += numbers[i] + " ] ";
			}
		}
		return msg;
	}

	public static void main(String[] args) {

		System.out.println("Let's initialize both Arrays with size 5");
		init(5);

		getAllValues(numbers1);
		getAllValues(numbers2);

		System.out.println("\n----------------------------------------------------------------------------");

		System.out.println("\nLet's fill Array 1:");
		setAllValues(numbers1);
		System.out.println("\nAfter setting all its values, Array 1 content is: " + toString(numbers1));

		System.out.println("\n----------------------------------------------------------------------------");

		System.out.println("\nLet's fill Array 2:");
		setAllValues(numbers2);
		System.out.println("\nAfter setting all its values, Array 2 content is: " + toString(numbers2));

		System.out.println("\n----------------------------------------------------------------------------");

		System.out.println("\nLet's change Array 1 even positions (from the user point of view):");
		setEvenValues(numbers1);

		System.out.println("\nAfter setting all even positions, Array 1 content is: " + toString(numbers1));

		System.out.println("\n----------------------------------------------------------------------------");

		System.out.println("\nLet's change Array 2 odd positions (from the user point of view):");
		setOddValues(numbers2);

		System.out.println("\nAfter setting all odd positions, Array 2 content is: " + toString(numbers2));

		System.out.println("\n----------------------------------------------------------------------------");

		System.out.println("\nThe sum of Array 1 and Array 2 is:");
		System.out.println(toString(numbers1) + " + ");
		System.out.println(toString(numbers2));
		System.out.println("________________________");
		System.out.println(toString(sumArrays(numbers1, numbers2)));
		
		
	}

}
