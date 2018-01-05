package remote;

public class CeilingFan extends Device{
	
	private String name;
	
	public CeilingFan(String name){
		this.name = name;
	}
	
	public void on(){
		isOn = true;
		System.out.println(name + " is on");
	}
	
	public void off(){
		isOn = false;
		System.out.println(name + " is off");
	}
}
