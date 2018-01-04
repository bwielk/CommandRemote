package remote;

public class StereoOffWithCDCommand implements Command {
	
	Stereo stereo;
	
	public StereoOffWithCDCommand(Stereo stereo){
		this.stereo = stereo;
	}
	
	public void execute(){
		stereo.off();
	}
	
	public void undo(){
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
		stereoOn.execute();
	}
}
