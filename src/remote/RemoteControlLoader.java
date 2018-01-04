package remote;

public class RemoteControlLoader {
	
	public static void main(String[] args){
		
		RemoteControl remoteControl = new RemoteControl(10);
		
		Light livingRoomLight = new Light("Living Room Light");
		Light kitchenLight = new Light("Kitchen Light");
		CeilingFan livingRoomCeilingFan = new CeilingFan("Living Room Ceiling Fan");
		GarageDoor garageDoor = new GarageDoor("Garage Door");
		Stereo stereo = new Stereo("Living Room Stereo");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		CeilingFanOnCommand livingRoomFanOn = new CeilingFanOnCommand(livingRoomCeilingFan);
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
	
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		CeilingFanOffCommand livingRoomFanOff = new CeilingFanOffCommand(livingRoomCeilingFan);
		GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);
		StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo);
	
		remoteControl.setCommand(1, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(2, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(3, livingRoomFanOn, livingRoomFanOff);
		remoteControl.setCommand(4, garageDoorOpen, garageDoorClose);
		remoteControl.setCommand(5, stereoOn, stereoOff);
		
		System.out.println(remoteControl.toString());
		
	}
	
}
