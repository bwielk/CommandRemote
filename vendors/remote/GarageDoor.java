package remote;

public class GarageDoor {
	
	private String name;
	
	public GarageDoor(String name){
		this.name = name;
	}
	
	public String open(){
		return name + " is opening";
	}
	
	public String close(){
		return name + " is closing";
	}

}
