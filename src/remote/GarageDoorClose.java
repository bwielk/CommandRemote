package remote;

public class GarageDoorCloseCommand implements Command {
	
	GarageDoor garageDoor;
	
	public GarageDoorCloseCommand(GerageDoor garageDoor){
		this.garageDoor = garageDoor;
	}
	
	public void execute(){
		garageDoor.close();
	}

}
