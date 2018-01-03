package remote;

public class Stereo {
	
	private String name;
	
	public Stereo(String name){
		this.name = name;
	}
	
	public String on(){
		return "on";
	}
	
	public String setVolume(int vol){
		return "The volume is " + vol;
	}
	
	public String setCD(){
		return "CD set";
	}
	
	public String off(){
		return "off";
	}
}