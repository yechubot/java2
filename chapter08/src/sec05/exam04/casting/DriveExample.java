package sec05.exam04.casting;

public class DriveExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare();
		
		Bus bus = (Bus) vehicle;
		bus.checkFare();
		
		

	}

}
