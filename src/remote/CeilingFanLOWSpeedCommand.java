package remote;

public class CeilingFanLOWSpeedCommand extends CeilingFanSpeedCommand {

	public CeilingFanLOWSpeedCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.setLowSpeed();
	}

}
