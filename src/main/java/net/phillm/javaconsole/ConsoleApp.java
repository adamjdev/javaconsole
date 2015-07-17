/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.phillm.javaconsole;
import java.util.Scanner;

/**
 *
 * @author Phillip
 */
public class ConsoleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        	    // Specifies Version
	    final String Version = "1.0.0.001";
	    // Specifies Website
	    final String Website = "www.phillm.net";
	    // Specifies Github Repo
	    final String Github = "https://github.com/phillmac/java-console-app-test";
	    //Initialize main loop
            boolean runLoop;
            runLoop = true;
	    
	    
	    System.out.println("Info: Type /info to get the build version!");
            System.out.println("Info: Type /help to get a list of availble commands!");
	    while(runLoop){ //loop untill /stop command
                Scanner scanner = new Scanner(System.in);
                if(scanner.hasNext("/info")) {
                	System.out.println("Build Version: " + Version);
                    System.out.println("Website: " + Website);
                    System.out.println("View on Github: " + Github);
	    	
                } else if(scanner.hasNext("/website")) {
                    System.out.println("Website: " + Website);
                    
                } else if(scanner.hasNext("/help")) {
                    System.out.println("Info: Gives Info Such as Build Version, Website, and Github Link");
                    System.out.println("Website: Gives The Developers Website");
                    System.out.println("Help: Gives All Commands");
                     System.out.println("Stop: Close the console");
                    
                } else if(scanner.hasNext("/stop")) {
                    System.out.println("Stopping");
                    runLoop = false;
                    
                } else {
                    System.out.println("Commands Available: [Info, Website, Help, Stop]");
                }
            } 
    }
    
}
