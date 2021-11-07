package Class09;

public class TV {
//data fields 
	int channel;
	int volumeLevel;
	boolean on;
	//Constructor
	public TV() {
		this.channel = 1;
		this.volumeLevel =20;
		this.on = false;
	}
	//methods
	public void turnOn() {
		this.on= true;
	}
	public void turnOff() {
		this.on = false;
	}
	public void setChannel (int newCh) {
		this.channel=newCh;
	}
	public void setVolume(int newVol) {
		this.channel = newVol;
	}
	public void channelUp() {
		this.channel++;
	}
	public void channelDown() {
		this.channel--;
	}
	public void volumeUp() {
		this.volumeLevel++;
	}
	public void volumeDown() {
		this.volumeLevel--;
	}
	public void info() {
		if(this.on==true) {
			System.out.println("Current channel: "+this.channel);
			System.out.println("Current Volume: "+this.volumeLevel);
		}else
		{
			System.out.println("TV is on!!");
		}
	}
}
