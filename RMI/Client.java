
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Server name");
        String serverName=sc.next();
        System.out.println("Enter port no.");
        int portNo=sc.nextInt();
        System.out.println("Enter Unique Id");
        String uniqueId=sc.next();
        System.out.println("Enter user Id");
        String userId=sc.next();
        System.out.println("Enter password");
        String password=sc.next();
        Registry reg=LocateRegistry.getRegistry(serverName,portNo);
        LoginInterface li=(LoginInterface)reg.lookup(uniqueId);
        boolean result=li.check(userId,password);
        if(result)
        {
            JOptionPane.showMessageDialog(null,"!!!Welcome!!!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Oops Invalid credentials");
            System.exit(0);
        }
    }
}
