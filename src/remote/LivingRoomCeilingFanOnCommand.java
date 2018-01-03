package remote;

public class CeilingFanOnCommand implements Command {
	
	CeilingFan ceilingFan;
	
	public LivingRoomCeilingFanOnCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	
	public void execute(){
		ceilingFan.on();
		ceilingFan.setSpeed(Speed.MEDIUM);
	}
}
