package remote;

public class Stereo extends Device{
	
	private String name;
	private int volume;
	
	public Stereo(String name){
		this.name = name;
	}
	
	public void on(){
		isOn = true;
		System.out.println(name + " is on");
	}
	
	public void setVolume(int vol){
		volume = vol;
		System.out.println("The volume is " + vol);
	}
	
	public void setCD(){
		System.out.println("CD is set");
	}
	
	public void off(){
		isOn = false;
		System.out.println(name + " is off");
	}
}
