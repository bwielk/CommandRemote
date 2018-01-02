package remote;

public class RemoteControl {
	
	int numberOfSlots;
	Command[] onCommands;
	Command[] offCommands;
	
	public RemoteControl(int numberOfSlots){
		this.numberOfSlots = numberOfSlots;
		onCommands = new Command[numberOfSlots];
		offCommands = new Command[numberOfSlots];
		
		Command noCommand = new NoCommand();
		for(int i = 0; i<numberOfSlots; i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slotNumber, Command onCommand, Command offCommand){
		onCommands[slotNumber - 1] = onCommand;
		offCommands[slotNumber - 1] = offCommand;
	}
	
	public void onButtonPushed(int slotNumber){
		onCommands[slotNumber - 1].execute();
	}
	
	public void offButtonPushed(int slotNumber){
		offCommands[slotNumber - 1].execute();
	}

}
