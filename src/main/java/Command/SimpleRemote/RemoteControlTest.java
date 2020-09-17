package Command.SimpleRemote;

import Command.SimpleRemote.Client.SimpleRemoteControl;
import Command.SimpleRemote.Command.GarageDoorOpenCommand;
import Command.SimpleRemote.Command.LightOnCommand;
import Command.SimpleRemote.Receiver.GarageDoor;
import Command.SimpleRemote.Receiver.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
