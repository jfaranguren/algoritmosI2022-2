package ui;

import model.Pokedex;

import java.util.Scanner;

public class PokeCollectorManager {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Hola entrenador!");
		
		Pokedex pd = new Pokedex("Kanto", 151, 8, "Bogota");
		
		System.out.println(pd.toString());
		
		System.out.println("\nHay un error!, digite la capital correcta");
		
		//String nuevaCapital = sc.nextLine();
		
		//pd.setCapitalCity(nuevaCapital);
		
		pd.setCapitalCity(sc.nextLine());
		
		System.out.println(pd);
		
		
		
		
		
		
	}

}
