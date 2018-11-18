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

    private Admin(Admin adminInstance) {
        this.adminInstance = adminInstance;
    }

    private Admin(Admin adminInstance, String name, int SSN, String dateOfBirth, String username, String password) {
        super(name, SSN, dateOfBirth, username, password);
        this.adminInstance = adminInstance;
    }

    @Override
    public void monitorAttandance(){
        
    }
    
    @Override
    public Admin getAdminInstance(){
        return getAdmin();
    }
    
    public static Admin getAdmin() {
        return adminInstance;
    }

    @Override
    public String toString() {
        return "Admin{" + "adminInstance=" + adminInstance + '}';
    }
    
    
}
