/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountHandler.ResidentHandler;

import AccountHandler.Person;

/**
 *
 * @author glori
 */
public interface ResidentInt {
    public void login(String u,String p);
    public void logout();
    public void editProfile(Person p);
    public void viewMap();
    public void addNewResident(Resident r);
    public void removeResident(String n);
}
