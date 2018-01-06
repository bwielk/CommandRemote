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
		
		CeilingFanHIGHSpeedCommand highSpeedCommand = new CeilingFanHIGHSpeedCommand(livingRoomCeilingFan);
		CeilingFanMEDIUMSpeedCommand mediumSpeedCommand = new CeilingFanMEDIUMSpeedCommand(livingRoomCeilingFan);
		CeilingFanLOWSpeedCommand lowSpeedCommand = new CeilingFanLOWSpeedCommand(livingRoomCeilingFan);
		
		Command[] onCommands = {livingRoomLightOn, highSpeedCommand, stereoOn};
		Command[] offCommands = {livingRoomLightOff, livingRoomFanOff, stereoOff};
		
		MacroCommand partyOn = new MacroCommand(onCommands);
		MacroCommand partyOff = new MacroCommand(offCommands);
		
		remoteControl.setCommand(1, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(2, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(3, livingRoomFanOn, livingRoomFanOff);
		remoteControl.setCommand(4, garageDoorOpen, garageDoorClose);
		remoteControl.setCommand(5, stereoOn, stereoOff);
		remoteControl.setCommand(6, highSpeedCommand, livingRoomFanOff);
		remoteControl.setCommand(7, mediumSpeedCommand, livingRoomFanOff);
		remoteControl.setCommand(8, lowSpeedCommand, livingRoomFanOff);
		remoteControl.setCommand(9, partyOn, partyOff);
		
		System.out.println(remoteControl.toString());
		
		remoteControl.onButtonPushed(6);//The fan speed is HIGH
		remoteControl.onButtonPushed(7);//The fan speed is MEDIUM
		remoteControl.undoButtonPushed();//The fan speed is HIGH
		remoteControl.offButtonPushed(6);//Living Room Ceiling Fan is off
		remoteControl.undoButtonPushed();//Living Room Ceiling Fan is on
		remoteControl.onButtonPushed(9);
		remoteControl.undoButtonPushed();
	}
}
