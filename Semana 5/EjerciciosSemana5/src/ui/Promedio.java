package ui;

import java.util.Scanner;

public class Promedio {

	static double[] ponderaciones = { 0.15, 0.20, 0.20, 0.15, 0.20, 0.10 };
	static String[] descripciones = { "Tarea Integradora 1", "Tarea Integradora 2", "Tarea Integradora 3",
			"Seguimientos", "Evaluaciones Prácticas", "Controles y Partcipación" };
	static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {

		// Promedio simple: Sumar notas y dividirlas frente al total

		// Promedio ponderado: Suma de las notas multiplicadas por su ponderación

		// formaUno();
		formaDos();
	}

	public static void formaUno() {
		double nota = 0;
		double acumulado = 0;

		System.out.println("Este programa le permite calcular su promedio en Algoritmos I");

		for (int i = 0; i < descripciones.length; i++) {

			System.out.println("Digite por favor la nota correspondiente a: " + descripciones[i]);
			nota = lector.nextDouble();
			acumulado += ponderaciones[i] * nota;
			System.out.println("Su nota acumulada es: " + acumulado);

		}

		System.out.println("La nota final es: " + acumulado);
	}

	public static void formaDos() {

		double[] arregloNotas = new double[ponderaciones.length];

		double nota = 0;
		double acumulado = 0;

		System.out.println("Este programa le permite calcular su promedio en Algoritmos I");

		for (int i = 0; i < descripciones.length; i++) {

			System.out.println("Digite por favor la nota correspondiente a: " + descripciones[i]);
			nota = lector.nextDouble();
			arregloNotas[i] = nota;

		}

		for (int i = 0; i < arregloNotas.length; i++) {

			acumulado += ponderaciones[i] * arregloNotas[i];
			System.out.println("Su nota acumulada es: " + acumulado);

		}

		System.out.println("La nota final es: " + acumulado);

	}

}
