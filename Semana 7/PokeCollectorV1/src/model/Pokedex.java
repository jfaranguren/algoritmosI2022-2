package model;

public class Pokedex {

	private String region;
	private int pokemonNumber;
	private int gymNumber;
	private String capitalCity;

	public Pokedex(String region, int pokemonNumber, int gymNumber, String capitalCity) {

		this.region = region;
		this.pokemonNumber = pokemonNumber;
		this.gymNumber = gymNumber;
		this.capitalCity = capitalCity;

	}

	public String getRegion() {

		return this.region;

	}

	public void setRegion(String region) {

		this.region = region;

	}

	public int getPokemonNumber() {
		return pokemonNumber;
	}

	public void setPokemonNumber(int pokemonNumber) {
		this.pokemonNumber = pokemonNumber;
	}

	public int getGymNumber() {
		return gymNumber;
	}

	public void setGymNumber(int gymNumber) {
		this.gymNumber = gymNumber;
	}

	public String getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	public String toString() {

		return "\nPokedex info:"
				+ "\nRegion: " + this.region
				+ "\nPokemon number: " + this.pokemonNumber
				+ "\nGym number: " + this.gymNumber 
				+ "\nCapital city: " + this.capitalCity;

	}

}
