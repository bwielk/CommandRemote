package remote;

public class Light {
	
	private String name;
	
	public Light(String name){
		this.name = name;
	}
	
	public String on(){
		return "on";
	}
	
	public String off(){
		return "off";
	}
}
