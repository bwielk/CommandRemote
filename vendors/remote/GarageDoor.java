package remote;

public class GarageDoor extends Device{
	
	private String name;
	
	public GarageDoor(String name){
		this.name = name;
	}
	
	public String open(){
		isOn = true;
		return name + " is opening";
	}
	
	public String close(){
		isOn = false;
		return name + " is closing";
	}

}
