/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author Acer PC
 */
@Stateless
public class Lotterybean implements LotterybeanLocal {

    @Override
    public String Login(String uname, String pass) {
        if(uname.equals("hello") && pass.equals("123")){
            return "successful";
        }
        return "Unsuccessful Login";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
