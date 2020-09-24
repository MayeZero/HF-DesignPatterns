package Proxy.GumballMachine;

import java.rmi.Naming;
import java.util.Scanner;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;

        Scanner scanner = new Scanner(System.in);

        try{
            String location = scanner.next();
            int count = scanner.nextInt();
            gumballMachine = new GumballMachine(location, count);
            Naming.rebind("//" + location + "/gumballmachine", gumballMachine);
        }catch (Exception e){
            e.printStackTrace();
        }

        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        monitor.report();
    }
}
