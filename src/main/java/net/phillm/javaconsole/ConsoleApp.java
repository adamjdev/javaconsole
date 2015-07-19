/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.phillm.javaconsole;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import net.phillm.javaconsole.id.IDManager;

/**
 *
 * @author Phillip
 * @author Ethan
 */
public class ConsoleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Specifies Version
        final String version = "1.0.0.001";
        // Specifies Website
        final String website = "www.phillm.net";
        // Specifies Github Repo
        final String github = "https://github.com/phillmac/java-console-app-test";
        //Initialize main loop
        boolean runLoop;
        runLoop = true;
        IDManager idManager = new IDManager();
        String knownhostsFile;
        JSch jsch;
        Session sshSession;

        knownhostsFile = System.getProperty("user.home") + File.separator + ".ssh" + File.separator + "known_hosts";
        jsch = new JSch();
        try {
            jsch.setKnownHosts(knownhostsFile);
        } catch (JSchException ex) {
            System.out.println("Error while trying to import kown hosts: " + ex.getMessage());
        }
        Scanner scanner = new Scanner(System.in);
        String currentCommand = "";
        System.out.println("Info: Type /info to get the build version!");
        System.out.println("Info: Type /help to get a list of availble commands!");
        while (runLoop) { //loop untill /stop command
            currentCommand = scanner.nextLine().toLowerCase();
            if (currentCommand.contains("/info")) {
                System.out.println("Build Version: " + version);
                System.out.println("Website: " + website);
                System.out.println("View on Github: " + github);

            } else if (currentCommand.contains("/website") || currentCommand.contains("/site")) {
                System.out.println("Website: " + website);

            } else if (currentCommand.contains("/help")) {
                System.out.println("/Info: Gives Info Such as Build Version, Website, and Github Link");
                System.out.println("/Website: Gives The Developers Website");
                System.out.println("/Help: Gives All Commands");
                System.out.println("/Connect [Host]: Open a connection to Host");
                System.out.println("/Id: get a block id number from its name");
                System.out.println("/Stop: Close the console");

            } else if (currentCommand.contains("/stop") || currentCommand.contains("/quit") || currentCommand.contains("/exit") || currentCommand.contains("/close")) {
                System.out.println("Stopping");
                runLoop = false;

            } else if (currentCommand.contains("/connect")) {

                String host = "";
                String username = "";
                String password = "";
                List<Integer> ports = new ArrayList<>();
                int timeout = 5000;

                ports.add(22);
                ports.add(35681);

                String[] ssh_Parameters = currentCommand.split(" ");
                if (ssh_Parameters.length > 1) {
                    host = ssh_Parameters[1];
                }

                if (ssh_Parameters.length > 2) {
                    username = ssh_Parameters[2];
                }

                if (ssh_Parameters.length > 3) {
                    password = ssh_Parameters[3];
                }

                if (host.equals("")) {
                    System.out.println("Enter host to connect to.");
                    host = scanner.nextLine();
                }
                if (username.equals("")) {
                    System.out.println("Enter username.");
                    username = scanner.nextLine();
                }
                if (password.equals("")) {
                    System.out.println("Enter password.");
                    password = scanner.nextLine();
                }
                System.out.println("Connecting to " + host + "...");

                int portTryCount = 0;
                Boolean sessionIsConnected = false;
                Boolean continueTrying = true;
                while ((!sessionIsConnected) && continueTrying && (portTryCount < ports.size())) {
                    try {
                        sshSession = jsch.getSession(username, host, ports.get(portTryCount));
                        sshSession.setPassword(password);
                        sshSession.connect(timeout);
                        sessionIsConnected = sshSession.isConnected();
                    } catch (JSchException ex) {
                        if (ex.getMessage().contains("timeout: socket is not established")) {
                            portTryCount++;
                        } else if (ex.getMessage().contains("Connection refused: connect")) {
                            portTryCount++;
                        } else if (ex.getMessage().contains("UnknownHostKey")) {
                            String response;

                            System.out.println(ex.getMessage());
                            System.out.println("Continue anyway? (y/n)");
                            response = scanner.nextLine();
                            switch (response.toLowerCase()) {
                                case "n":
                                    continueTrying = false;
                                    break;
                                case "y":
                                    break;
                                default:
                                    System.out.println("Please type either y or n");
                                    break;
                            }

                        } else {
                            System.out.println("Could not connect: " + ex.getMessage());
                        }
                    }
                }
            } else if (currentCommand.contains("/id")) {
                String blockName = "";
                String[] idParams = currentCommand.split(" ");
                if (idParams.length > 1) {
                    blockName = idParams[1];
                } else {
                    while (blockName.equals("")) {
                        System.out.println("please type a block");
                        blockName = scanner.nextLine();
                    }
                }
                System.out.println("ID for block " + blockName + " is " + idManager.blockInfo.get(blockName.toLowerCase()));

            } else {
                System.out.println("Commands Available: [/Info, /Website, /Help, /Connect, /Stop, /Id]");
            }
        }
    }

}
