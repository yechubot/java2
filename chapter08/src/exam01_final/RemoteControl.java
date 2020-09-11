package exam01_final;

public interface RemoteControl {
	//constant
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//abstract method - only declaration
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//default method
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("muted");
		}else {
			System.out.println("unmuted");
		}
	}
	//static method
	static void changeBattery() {
		System.out.println("change battery.");
	}
}
