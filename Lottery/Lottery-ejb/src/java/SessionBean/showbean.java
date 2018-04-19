/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 * @author Acer PC
 */
@Stateless
public class showbean implements showbeanLocal    {

    @Override
    public String checkLottery(int a) {
        String s=null;
        try {
            RmiExample r=new RmiExample();
           s= r.add(a);
        } catch (RemoteException ex) {
            Logger.getLogger(showbean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

   
 

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
