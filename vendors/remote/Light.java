package remote;

public class Light extends Device{
	
	private String name;
	
	public Light(String name){
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
