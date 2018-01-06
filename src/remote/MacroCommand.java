package remote;

public class MacroCommand implements Command {

	Command[] commandsToRun;
	
	public MacroCommand(Command[] commands){
		this.commandsToRun = commands;
	}
	
	public void execute() {
		for(int i = 0; i<commandsToRun.length; i++){
			commandsToRun[i].execute();
		}
	}

	@Override
	public void undo() {
		for(int i = 0; i<commandsToRun.length; i++){
			commandsToRun[i].undo();
		}
		
	}
	
	
	

}
