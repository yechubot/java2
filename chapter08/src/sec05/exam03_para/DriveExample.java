package sec05.exam03_para;

public class DriveExample {

	public static void main(String[] args) {
Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); // Vehicle vehicle = new Bus();
		driver.drive(taxi);
	}

}
