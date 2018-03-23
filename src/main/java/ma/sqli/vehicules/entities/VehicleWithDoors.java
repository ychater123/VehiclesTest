package ma.sqli.vehicules.entities;

import ma.sqli.vehicules.Consts;
import ma.sqli.vehicules.utilities.Utilities;

public abstract class VehicleWithDoors extends Vehicle {
	protected Integer numberOfDoors;
	
	protected static final String BLOCKED = "DOORS KO, BLOCKED \n%s";

	public VehicleWithDoors(String type, String fuel, Integer numberOfDoors) {
		super(type, fuel);
		this.numberOfDoors = numberOfDoors;
	}
	
	protected abstract void addClosedDoorToFrameSchema(StringBuilder schema, int door_number);
	
	protected abstract void addOpenedDoorToFrameSchema(StringBuilder schema, int door_number);
	
	@Override
	public String move(String doors, String distance) {
		String[] doors_number = doors.split(Consts.SEPARATOR3);
		if(doors_number.length < numberOfDoors) {
			return reportForBlockedState(doors_number);
		} else {
			return reportForMovingState(distance);
		}
	}
	
	protected String reportForBlockedState(String[] doors_number) {
		StringBuilder schema = new StringBuilder("  _\n");
		for (int door_number = 1; door_number <= numberOfDoors; door_number++) {
			if(Utilities.containString(doors_number, door_number)) {
				addClosedDoorToFrameSchema(schema, door_number);
			} else {
				addOpenedDoorToFrameSchema(schema, door_number);
			}
		}
		return String.format(BLOCKED, schema.toString());
	}

}
