package ma.sqli.vehicules.entities;

import ma.sqli.vehicules.Consts;

public class Truck extends VehicleWithDoors {

	public Truck(String type, String fuel, Integer numberOfDoors) {
		super(type, fuel, numberOfDoors);
	}
	
	@Override
	protected void addClosedDoorToFrameSchema(StringBuilder schema, int door_number) {
		switch (door_number) {
		case 1:
			schema.append(Consts.TRUCK_LEFT_DOOR_CLOSED);
			break;
		case 2:
			schema.append(Consts.TRUCK_RIGHT_DOOR_CLOSED);
			break;
		default:
			break;
		}
	}

	@Override
	protected void addOpenedDoorToFrameSchema(StringBuilder schema, int door_number) {
		switch (door_number) {
		case 1:
			schema.append(Consts.TRUCK_LEFT_DOOR_NOT_CLOSED);
			break;
		case 2:
			schema.append(Consts.TRUCK_RIGHT_DOOR_NOT_CLOSED);
			break;
		default:
			break;
		}
	}
}
