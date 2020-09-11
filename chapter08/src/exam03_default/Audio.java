package exam03_default;

public class Audio implements RemoteControl{
	private int volume;
	private boolean mute;
	
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
	@Override
	public void setMute(boolean mute) {
		//not a default (-> interface)here cos it's in audio 
		this.mute = mute;
		if(mute) {
			System.out.println("audio mute");
		}else {
			System.out.println("audio unmute");
		}
	}

}
