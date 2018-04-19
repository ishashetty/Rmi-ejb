/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Acer PC
 */
public interface RmiImpl extends Remote{
    public String add(int a) throws RemoteException;
}