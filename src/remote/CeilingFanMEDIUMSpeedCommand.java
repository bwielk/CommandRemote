package remote;

public class CeilingFanMEDIUMSpeedCommand extends CeilingFanSpeedCommand {

	public CeilingFanMEDIUMSpeedCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.setMediumSpeed();
	}

}
