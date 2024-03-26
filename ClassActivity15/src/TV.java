
public class TV {
	int channel;
	int volumeLevel;
	boolean on; 
	
	public TV() {
		this.channel = 0;
		this.volumeLevel = 0;
		this.on = false;
	}
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void setChannel(int newChannel) {
		if (on && newChannel <= 120) {
			channel = newChannel;
		}
		else {
			System.out.println("This channel doesnt exist");
		}
	}
	
	public void setVolume(int newVolume) {
		if (on && newVolume <= 7) {
			volumeLevel = newVolume;
		}
		else {
			System.out.println("This volume doesnt exist");
		}
	}
	
	public void channelUp() {
		if (on && channel <= 120) {
			channel += 1;
		}
	}
	
	public void channelDown() {
		if (on && channel <= 120 && channel >= 0) {
			channel -= 1;
		}
	}
	
	public void volumeUp() {
		if (on && volumeLevel <= 7) {
			volumeLevel += 1;
		}
	}
	
	public void volumeDown() {
		if (on && volumeLevel <= 7 && volumeLevel >= 0) {
			volumeLevel -= 1;
		}
	}
	
}
