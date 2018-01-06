package remote;

public class CeilingFan extends Device{
	
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	private String name;
	int speed;
	
	public CeilingFan(String name){
		this.name = name;
		speed = OFF;
	}
	
	public void setHighSpeed(){
		speed = HIGH;
		System.out.println("The fan speed is HIGH");
	}
	
	public void setMediumSpeed(){
		speed = MEDIUM;
		System.out.println("The fan speed is MEDIUM");
	}
	
	public void setLowSpeed(){
		speed = LOW;
		System.out.println("The fan speed is LOW");
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public void on(){
		isOn = true;
		System.out.println(name + " is on");
	}
	
	public void off(){
		isOn = false;
		speed = OFF;
		System.out.println(name + " is off");
	}
	
	
}
