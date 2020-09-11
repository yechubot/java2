package exam01_final;

public class Audio implements RemoteControl{
	private int volume;
	
	// need to override for abstract method
	@Override
	public void turnOn() {
		System.out.println("turn on audio");
		
	}

	@Override
	public void turnOff() {
		System.out.println("turn off audio");
		
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
		System.out.println("current audio is:"+this.volume);
	}

}
