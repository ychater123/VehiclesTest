package ma.sqli.vehicules.utilities;

import ma.sqli.vehicules.Consts;

public class Utilities {
	
	public static Integer getPercentage(String fuel) {
		switch (fuel) {
		case Consts.GASOLINE:
			return Consts.GASOLINE_CONSOMATION;
		case Consts.DIESEL:
			return Consts.DIESEL_CONSOMATION;
		case Consts.HYBRID:
			return Consts.HYBRID_CONSOMATION;
		default:
			break;
		}
		return 0;
	}
	
	public static Boolean containString(String[] doors_number, Integer door_number) {
		for (String number : doors_number) {
			if(number.equals(String.valueOf(door_number))) return true;
		}
		return false;
	}

}
