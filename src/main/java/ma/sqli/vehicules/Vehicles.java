package ma.sqli.vehicules;

import java.util.ArrayList;
import java.util.List;
import ma.sqli.vehicules.entities.Vehicle;
import ma.sqli.vehicules.factory.VehicleFactory;

public class Vehicles {
	List<Vehicle> vehicles = new ArrayList<Vehicle>();

	public Vehicles(String string) {
		VehicleFactory vf = new VehicleFactory();
		String[] vehicles = string.split(Consts.SEPARATOR1);
		for (String vehicle : vehicles) {
			this.vehicles.add(vf.createVehicle(vehicle));
		}
	}

	public String move(String type, String doors, String distance) {
		Vehicle vehicle = getVehicleByType(type);
		if(vehicle != null) return vehicle.move(doors, distance);
		return "";
	}
	
	private Vehicle getVehicleByType(String type) {
		for (Vehicle vehicle : vehicles) {
			if(vehicle.getType().equals(type)) return vehicle;
		}
		return null;
	}

}
