package Command.PartyMode.Command;

import Command.PartyMode.Receiver.CeilingFan;

public class CeilingFanOffCommand implements Command {
    int prevSpeed;
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    public void execute(){
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    public void undo(){
        if(prevSpeed == CeilingFan.HIGH){
            ceilingFan.high();
        }else if(prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        }else if(prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        }else if(prevSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}
