/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import java.net.MalformedURLException;
import java.rmi.ConnectException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 * @author Acer PC
 */
@Stateless
public class Client1 implements Client1Local {

    @Override
    public String help(int num) {
         RmiImpl r;
        try {
            r = (RmiImpl)Naming.lookup("rmi://localhost/add");
           if(num>0 && num<=100){
            String s;
             try {
                 s = r.add(num);
                  return s;
             } catch (RemoteException ex) {
                 Logger.getLogger(Client1.class.getName()).log(Level.SEVERE, null, ex);
             }
          
        } 
        } catch (NotBoundException ex) {
            Logger.getLogger(Client1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Client1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Client1.class.getName()).log(Level.SEVERE, null, ex);
        }
         
//        return null;
        return "Something went wrong";
    }
    
}
