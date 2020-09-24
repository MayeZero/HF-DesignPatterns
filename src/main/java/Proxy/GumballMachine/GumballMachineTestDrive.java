package Proxy.GumballMachine;

import java.util.Scanner;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String location = scanner.next();
        int count = scanner.nextInt();
        GumballMachine gumballMachine = new GumballMachine(location, count);

        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        monitor.report();
    }
}
