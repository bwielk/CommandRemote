package remote;

public class RemoteControl {
	
	int numberOfSlots;
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public RemoteControl(int numberOfSlots){
		this.numberOfSlots = numberOfSlots;
		onCommands = new Command[numberOfSlots];
		offCommands = new Command[numberOfSlots];
		
		Command noCommand = new NoCommand();
		for(int i = 0; i<numberOfSlots; i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		
		undoCommand = noCommand;
	}
	
	public void setCommand(int slotNumber, Command onCommand, Command offCommand){
		onCommands[slotNumber - 1] = onCommand;
		offCommands[slotNumber - 1] = offCommand;
	}
	
	public void onButtonPushed(int slotNumber){
		onCommands[slotNumber - 1].execute();
		undoCommand = onCommands[slotNumber -1];
	}
	
	public void offButtonPushed(int slotNumber){
		offCommands[slotNumber - 1].execute();
		undoCommand = offCommands[slotNumber -1];
	}
	
	public void undoButtonPushed(){
		undoCommand.undo();
	}
	
	@Override
	public String toString(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n---Remote Control---\n");
		for(int i = 0; i<numberOfSlots; i++){
			stringBuffer.append("\n[ " + (i+1) + " ]" + onCommands[i].getClass().getName() + "\t[ " + (i+1) + " ]" + offCommands[i].getClass().getName());
		}
		return stringBuffer.toString();
	}
}
