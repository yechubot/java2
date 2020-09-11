package exam01_abstract;

public interface RemoteControl {
	//constant
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//abstract method
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
