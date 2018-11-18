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
public interface AdminInt {
    public void monitorAttandance();
    public Admin getAdminInstance();
    public void login(String u,String p);
    public void logout();
    public void editProfile(Person p);
    
}
