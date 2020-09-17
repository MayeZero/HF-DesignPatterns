package Command.PartyMode.Receiver;

public class Light {
    String location = "";

    public Light(String location){
        this.location = location;
    }

    public void on(){
        System.out.println("Light is On");
    }

    public void off(){
        System.out.println("Light is Off");
    }
}
