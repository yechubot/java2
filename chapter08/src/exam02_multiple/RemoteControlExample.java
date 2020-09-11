package exam02_multiple;

public class RemoteControlExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(8);
		
		Searchable sa = tv;
		sa.search("http://www.naver.com");
	}

}
