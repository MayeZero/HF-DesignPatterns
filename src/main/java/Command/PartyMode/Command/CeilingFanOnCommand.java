package Command.PartyMode.Command;

import Command.PartyMode.Receiver.CeilingFan;

public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    public void execute(){
        ceilingFan.high();
    }

    public void undo(){
        ceilingFan.off();
    }
}
