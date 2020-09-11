package exam01_final;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc, rc2;
		rc = new Television();
		rc2 = new Audio();
		
		rc.turnOn();
		rc.turnOff();
		
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(-3);
		
		
	}

}
