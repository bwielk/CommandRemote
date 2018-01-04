package remote;

public class Light {
	
	private String name;
	
	public Light(String name){
		this.name = name;
	}
	
	public String on(){
		return name + " is on";
	}
	
	public String off(){
		return name + " is off";
	}
}
