package ma.sqli.vehicules;

public final class Consts {
	public static final Integer DIESEL_CONSOMATION = 5;
	public static final Integer GASOLINE_CONSOMATION = 6;
	public static final Integer HYBRID_CONSOMATION = 3;
	
	// Car
	public static final String CAR_FRONT_LEFT_DOOR_NOT_CLOSED = " / ";
	public static final String CAR_BACK_RIGHT_DOOR_NOT_CLOSED = "\\";
	public static final String CAR_FRONT_RIGHT_DOOR_NOT_CLOSED = "\\\n";
	public static final String CAR_BACK_LEFT_DOOR_NOT_CLOSED = " /_";
	
	public static final String CAR_FRONT_LEFT_DOOR_CLOSED = " | ";
	public static final String CAR_BACK_RIGHT_DOOR_CLOSED = "|";
	public static final String CAR_FRONT_RIGHT_DOOR_CLOSED = "|\n";
	public static final String CAR_BACK_LEFT_DOOR_CLOSED = " |_";

	// Truck
	public static final String TRUCK_LEFT_DOOR_NOT_CLOSED = " /_";
	public static final String TRUCK_RIGHT_DOOR_NOT_CLOSED = "\\";
	
	public static final String TRUCK_LEFT_DOOR_CLOSED = " |_";
	public static final String TRUCK_RIGHT_DOOR_CLOSED = "|";
	
	
	//
	public static final String HYBRID = "Hybrid";
	public static final String DIESEL = "Diesel";
	public static final String GASOLINE = "Gasoline";

	public static final String SEPARATOR1 = ", ";
	public static final String SEPARATOR2 = ":";
	public static final String SEPARATOR3 = " ";
	
	public static final Integer FIRST_ELT = 0;
	public static final Integer SECOND_ELT = 1;
	public static final Integer THIRD_ELT = 2;
	
	public static final String CAR = "CAR";
	public static final String TRUCK = "TRUCK";
	public static final String MOTORCYCLE = "MOTORCYCLE";
}
