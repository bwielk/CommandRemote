package remote;

public class GarageDoor {
	
	private String name;
	
	public GarageDoor(String name){
		this.name = name;
	}
	
	public String open(){
		return "open";
	}
	
	public String close(){
		return "closed";
	}

}
