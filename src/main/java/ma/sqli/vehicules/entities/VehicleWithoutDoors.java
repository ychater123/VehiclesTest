package ma.sqli.vehicules.entities;

public class VehicleWithoutDoors extends Vehicle {

	public VehicleWithoutDoors(String type, String fuel) {
		super(type, fuel);
	}

	@Override
	public String move(String doors, String distance) {
		return reportForMovingState(distance);
	}
}
