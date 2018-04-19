/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import java.rmi.ConnectException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Acer PC
 */
public class Server {
     public static void main(String[]arg) throws RemoteException
{
        try
        {
            Registry r=LocateRegistry.createRegistry(1099);
            r.rebind("add",new RmiExample());
        }
        catch(ConnectException e){
            System.out.println("Server not Started...");
        }

System.out.println("Server Started...");
   }
}
