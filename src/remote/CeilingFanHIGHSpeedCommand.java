package remote;

public class CeilingFanHIGHSpeedCommand extends CeilingFanSpeedCommand {
	
	public CeilingFanHIGHSpeedCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.setHighSpeed();
	}
}
