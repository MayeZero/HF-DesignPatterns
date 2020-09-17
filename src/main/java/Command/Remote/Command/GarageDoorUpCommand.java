package Command.Remote.Command;

import Command.Remote.Receiver.GarageDoor;

public class GarageDoorUpCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    public void execute(){
        garageDoor.up();
    }

    public void undo(){
        garageDoor.down();
    }
}
