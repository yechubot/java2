package exam01_final;

public class Television implements RemoteControl{
	private int volume;
	
	// need to override for abstract method
	@Override
	public void turnOn() {
		System.out.println("turn on tv");
		
	}

	@Override
	public void turnOff() {
		System.out.println("turn off tv");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("current volume is:"+this.volume);
	}

}
