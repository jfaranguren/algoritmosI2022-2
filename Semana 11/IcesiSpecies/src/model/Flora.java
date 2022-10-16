package model;

public class Flora extends Species {

	private boolean hasFlowers;
	private boolean hasFruits;
	private double maxHeigth;
	
	public Flora(String name, String scientificName, boolean hasFlowers, boolean hasFruits, double maxHeigth) {
		super(name, scientificName);
		this.hasFlowers = hasFlowers;
		this.hasFruits = hasFruits;
		this.maxHeigth = maxHeigth;
	}

	public boolean hasFlowers() {
		return hasFlowers;
	}

	public void setHasFlowers(boolean hasFlowers) {
		this.hasFlowers = hasFlowers;
	}

	public boolean hasFruits() {
		return hasFruits;
	}

	public void setHasFruits(boolean hasFruits) {
		this.hasFruits = hasFruits;
	}

	public double getMaxHeigth() {
		return maxHeigth;
	}

	public void setMaxHeigth(double maxHeigth) {
		this.maxHeigth = maxHeigth;
	}

	@Override
	public String toString() {
		return "Flora [hasFlowers=" + hasFlowers + ", hasFruits=" + hasFruits + ", maxHeigth=" + maxHeigth + "]";
	}
	
	
	
	
}
