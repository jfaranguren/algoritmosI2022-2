package ui;

import java.util.Scanner;

import model.Controller;

public class Manager {

	private Scanner sc;
	private Controller controller;

	public Manager() {
		this.sc = new Scanner(System.in);
		this.controller = new Controller();
	}

	public void menu() {

		System.out.println("Welcome to Icesi Species");

		boolean exit = false;

		while (!exit) {

			System.out.println("1. Show species");
			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("1. Show all species");
				System.out.println("2. Show all fauna species");
				System.out.println("3. Show all flora species");
				int show = sc.nextInt();

				System.out.println(controller.showSpecies(show));

				break;
			case 2:

				getOrderedScores();//Recuerden que esto no se debería hacer en el Manager
				break;

			default:

				break;

			}

		}

	}

	public static void main(String[] args) {
		Manager m = new Manager();
		m.menu();

	}

	public int[] getTop(int[] array) {

		int mayor[] = new int[2];

		for (int x = 0; x < array.length; x++) {

			if (array[x] > mayor[0]) {
				mayor[0] = array[x];
				mayor[1] = x;
			}

		}

		return mayor;

	}

	public int[] getOrderedScores() {

		int[] puntajeActual = { 20, 50, 40, 30, 10 }; // Aqui esta faltando el metodo getAllScores()

		int[] puntajeOrdenado = new int[20];

		for (int y = 0; y < puntajeActual.length; y++) {

			int[] result = getTop(puntajeActual);
			puntajeOrdenado[y] = result[0];
			puntajeActual[result[1]] = -1;

		}

		showTop5(puntajeOrdenado);

		return puntajeOrdenado;

	}

	public void showTop5(int[] orderedArray) {

		for (int i = 0; i < orderedArray.length; i++) {

			System.out.println("Top " + (i + 1) + " . " + orderedArray[i]);

		}

	}

}
