package exam02_multiple;

public class SmartTelevision implements RemoteControl, Searchable{

	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + " will be searched");
		
	}

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
