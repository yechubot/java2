package exam03_default;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		RemoteControl.changeBattery();

	}

}
