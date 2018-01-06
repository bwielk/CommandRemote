package remote;

public abstract class CeilingFanSpeedCommand implements Command{
	
	CeilingFan ceilingFan;
	int prevSpeed;
	
	public abstract void execute();
	
	public void undo(){
		switch(prevSpeed){
		case CeilingFan.HIGH:
			ceilingFan.setHighSpeed();
			break;
		case CeilingFan.MEDIUM:
			ceilingFan.setMediumSpeed();
			break;
		case CeilingFan.LOW:
			ceilingFan.setLowSpeed();
			break;
		case CeilingFan.OFF:
			ceilingFan.off();
		}
	};
}

