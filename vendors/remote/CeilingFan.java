package remote;

public class CeilingFan {
	
	private String name;
	
	public CeilingFan(String name){
		this.name = name;
	}
	
	public String on(){
		return name + " is on";
	}
	
	public String off(){
		return name + " is off";
	}
}
