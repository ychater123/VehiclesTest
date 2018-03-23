package ma.sqli.vehicules.entities;

import ma.sqli.vehicules.Consts;

public class Car extends VehicleWithDoors {

	public Car(String type, String fuel, Integer numberOfDoors) {
		super(type, fuel, numberOfDoors);
	}

	@Override
	protected void addClosedDoorToFrameSchema(StringBuilder schema, int door_number) {
		switch (door_number) {
		case 1:
			schema.append(Consts.CAR_FRONT_LEFT_DOOR_CLOSED);
			break;
		case 2:
			schema.append(Consts.CAR_FRONT_RIGHT_DOOR_CLOSED);
			break;
		case 3:
			schema.append(Consts.CAR_BACK_LEFT_DOOR_CLOSED);
			break;
		case 4:
			schema.append(Consts.CAR_BACK_RIGHT_DOOR_CLOSED);
			break;
		default:
			break;
		}
	}

	@Override
	protected void addOpenedDoorToFrameSchema(StringBuilder schema, int door_number) {
		switch (door_number) {
		case 1:
			schema.append(Consts.CAR_FRONT_LEFT_DOOR_NOT_CLOSED);
			break;
		case 2:
			schema.append(Consts.CAR_FRONT_RIGHT_DOOR_NOT_CLOSED);
			break;
		case 3:
			schema.append(Consts.CAR_BACK_LEFT_DOOR_NOT_CLOSED);
			break;
		case 4:
			schema.append(Consts.CAR_BACK_RIGHT_DOOR_NOT_CLOSED);
			break;
		default:
			break;
		}
	}
}
