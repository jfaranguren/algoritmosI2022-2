package model;

public class Fauna extends Species {
	
	private boolean isMigratory;
	private double maxWeigth;
	
	public Fauna(String name, String scientificName, boolean isMigratory, double maxWeigth) {
		super(name, scientificName);
		this.isMigratory = isMigratory;
		this.maxWeigth = maxWeigth;
	}

	public boolean isMigratory() {
		return isMigratory;
	}

	public void setMigratory(boolean isMigratory) {
		this.isMigratory = isMigratory;
	}

	public double getMaxWeigth() {
		return maxWeigth;
	}

	public void setMaxWeigth(double maxWeigth) {
		this.maxWeigth = maxWeigth;
	}

	@Override
	public String toString() {
		return "Fauna [isMigratory=" + isMigratory + ", maxWeigth=" + maxWeigth + "]";
	}
	
	
	
	

}
