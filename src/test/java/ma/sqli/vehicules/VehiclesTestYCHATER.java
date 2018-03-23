package ma.sqli.vehicules;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/************
 Diesel:5%,Fuel:6%,Hybrid:3%    
         _
 door 1 | | door 2
 door 3 |_| door 4

*************/
public class VehiclesTestYCHATER {

    private Vehicles vehicles;

    @Before
    public void initVehicles() {
        /**
        VEHICLE TYPE : FUEL TYPE : NUMBER OF DOORS
        **/
        vehicles = new Vehicles("CAR:Hybrid:4, TRUCK:Diesel:2, MOTORCYCLE:Gasoline:0");
    }

    @Test
    public void testCar() {
        String report = vehicles.move("CAR", "1 2 3 4", "200 KM");
        Assert.assertEquals("DOORS OK, MOVING. The CAR will consume 6.00 L", report);
    }

    @Test
    public void testTruck() {
        String report = vehicles.move("TRUCK", "1 2", "1000 KM");
        Assert.assertEquals("DOORS OK, MOVING. The TRUCK will consume 50.00 L", report);
    }

    @Test
    public void testMotorCycle() {
        String report = vehicles.move("MOTORCYCLE", "", "50 KM");
        Assert.assertEquals("DOORS OK, MOVING. The MOTORCYCLE will consume 3.00 L", report);
    }
    
    @Test
    public void testTruckRightDoorNotClosed() {
        /***********
	        _
	       |_\\
	       
        ************/
    	String report = vehicles.move("TRUCK", "1", "1000 KM");
    	Assert.assertEquals("DOORS KO, BLOCKED \n"+
                "  _\n"+
                " |_\\", report);
    }
    
    @Test
    public void testTruckLeftDoorNotClosed() {
        /***********
	        _
	       /_|
       
        ************/
    	String report = vehicles.move("TRUCK", "2", "1000 KM");
    	Assert.assertEquals("DOORS KO, BLOCKED \n"+
                "  _\n"+
                " /_|", report);
    }
    
    @Test
    public void testTruckAllDoorsNotClosed() {
        /***********
	        _
	       /_\
       
        ************/
    	String report = vehicles.move("TRUCK", "", "1000 KM");
    	Assert.assertEquals("DOORS KO, BLOCKED \n"+
                "  _\n"+
                " /_\\", report);
    }

    @Test
    public void testCarFrontRightDoorNotClosed() {
        /***********
           _        
          | \ 
          |_|
          
         ************/
        String report = vehicles.move("CAR", "1 3 4", "200 KM");
        Assert.assertEquals("DOORS KO, BLOCKED \n"+
                            "  _\n"+
                            " |"+" "+"\\\n"+
                            " |_|", report);
    }
    
    @Test
    public void testCarBackLeftDoorNotClosed() {
        /***********
           _
          | | 
          /_|
          
        ************/
        String report = vehicles.move("CAR", "1 2 4", "200 KM");
        Assert.assertEquals("DOORS KO, BLOCKED \n"+
                            "  _\n"+
                            " | |\n"+
                            " /_|", report);
    }
    
    @Test
    public void testCarBackRightDoorNotClosed() {
        /***********
           _
          | | 
          |_\
          
        ************/
        String report = vehicles.move("CAR", "1 2 3", "200 KM");
        Assert.assertEquals("DOORS KO, BLOCKED \n"+
        					"  _\n"+
        					" | |\n"+
        					" |_\\", report);
    }
    
    @Test
    public void testCarFrontLeftDoorNotClosed() {
        /***********
           _
          / | 
          |_|
          
        ************/
        String report = vehicles.move("CAR", "2 3 4", "200 KM");
        Assert.assertEquals("DOORS KO, BLOCKED \n"+
        					"  _\n"+
        					" / |\n"+
        					" |_|", report);
    }
    
    @Test
    public void testCarFrontDoorsNotClosed() {
        /***********
           _
          / \ 
          |_|
          
        ************/
        String report = vehicles.move("CAR", "3 4", "200 KM");
        Assert.assertEquals("DOORS KO, BLOCKED \n"+
        					"  _\n"+
        					" / \\\n"+
        					" |_|", report);
    }
    
    @Test
    public void testCarBackDoorsNotClosed() {
        /***********
           _
          | | 
          /_\
          
        ************/
        String report = vehicles.move("CAR", "1 2", "200 KM");
        Assert.assertEquals("DOORS KO, BLOCKED \n"+
        					"  _\n"+
        					" | |\n"+
        					" /_\\", report);
    }
    
    @Test
    public void testCarFrontRightDoorAndBackLeftDoorNotClosed() {
        /***********
           _
          | \ 
          /_|
          
        ************/
        String report = vehicles.move("CAR", "1 4", "200 KM");
        Assert.assertEquals("DOORS KO, BLOCKED \n"+
        					"  _\n"+
        					" | \\\n"+
        					" /_|", report);
    }
}
