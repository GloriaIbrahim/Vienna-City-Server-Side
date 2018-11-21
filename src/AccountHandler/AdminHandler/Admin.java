/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountHandler.AdminHandler;

import AccountHandler.Person;

/**
 *
 * @author glori
 */
public class Admin extends Person implements AdminInt{
    private static Admin adminInstance=null;

    private Admin() {
        super("Mamdouh", 78657866, "12 April 1980", "mamdouh555555", "123456");
    }
    
    @Override
    public void monitorAttandance(){
        
    }
    
    @Override
    public Admin getAdminInstance(){
        return getAdmin();
    }
    
    public static Admin getAdmin() {
        if(adminInstance==null)
        {
            adminInstance=new Admin();
            return adminInstance;
        }
        else
            return adminInstance;
    }

    @Override
    public String toString() {
        return "Admin{" + "adminInstance=" + adminInstance + '}';
    }
    
    
}
