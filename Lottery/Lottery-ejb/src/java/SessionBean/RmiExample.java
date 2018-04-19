/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

/**
 *
 * @author Acer PC
 */
public class RmiExample extends UnicastRemoteObject implements RmiImpl{
  public RmiExample() throws RemoteException
{
    int a;
}
 @Override
public String add(int a) throws RemoteException
{
   // Random rand=new Random();
    //int test=rand.nextInt(100)+1;
    if(a==1)
        return "Congratulations won a lottery";
    return "Sorry!! Try next time";      
}

}