package ma.sqli.vehicules.factory;

import ma.sqli.vehicules.Consts;
import ma.sqli.vehicules.entities.Car;
import ma.sqli.vehicules.entities.Motorcycle;
import ma.sqli.vehicules.entities.Truck;
import ma.sqli.vehicules.entities.Vehicle;

public class VehicleFactory {

	public Vehicle createVehicle(String vehicle) {
		String[] vehicleInfo = vehicle.split(Consts.SEPARATOR2);
		String type = vehicleInfo[Consts.FIRST_ELT];
		String fuel = vehicleInfo[Consts.SECOND_ELT];
		Integer numberOfDoors = Integer.parseInt(vehicleInfo[Consts.THIRD_ELT]);

		switch (type) {
		case Consts.CAR:
			return new Car(type, fuel, numberOfDoors);
		case Consts.TRUCK:
			return new Truck(type, fuel, numberOfDoors);
		case Consts.MOTORCYCLE:
			return new Motorcycle(type, fuel);
		default:
			break;
		}
		return null;
	}
}
