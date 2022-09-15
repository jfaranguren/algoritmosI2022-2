package ui;

import java.util.Scanner;

public class Zero {

	static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Promedio simple: Sumar numeros y dividirlos frente al total de veces
		// ingresadas

		double numero = 1;
		double suma = 0;
		double promedio = 0;
		double contador = 0;

		while (numero != 0) {

			System.out.println("Digite un numero. Si digita 0 el programa parará y calculará la suma y el promedio");
			numero = lector.nextDouble();
			suma += numero;

			if (numero != 0) {
				contador++;
			}

		}

		promedio = suma / contador;

		System.out.println("La suma es: " + suma + " y el promedio es: " + promedio);

	}

}
