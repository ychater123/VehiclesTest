package ma.sqli.vehicules.entities;

import ma.sqli.vehicules.Consts;
import ma.sqli.vehicules.utilities.Utilities;

public abstract class Vehicle {
	protected String type;
	protected String fuel;

	protected static final String MOVING = "DOORS OK, MOVING. The %s will consume %s L";
	
	public Vehicle(String type, String fuel) {
		this.type = type;
		this.fuel = fuel;
	}
	
	public abstract String move(String doors, String distance);
	
	private String consumedFuelVolume(Integer distance) {
		Integer percentage = Utilities.getPercentage(fuel);
		return String.format("%.2f", (distance * percentage) / 100.).replaceFirst(",", ".");
	}
	
	protected String reportForMovingState(String distance_unit) {
		Integer distance = Integer.parseInt(distance_unit.split(Consts.SEPARATOR3)[Consts.FIRST_ELT]); 
		return String.format(MOVING, type, consumedFuelVolume(distance));
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getFuel() {
		return fuel;
	}
	
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
}
