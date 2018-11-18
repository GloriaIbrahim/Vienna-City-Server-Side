/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountHandler.EmplyeeHandler;

import AccountHandler.Person;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author glori
 */
public interface EmployeeInt {
    public void login(String u,String p);
    public void logout();
    public void editProfile(Person p);
    public void checkIn(Time t);
    public void checkOut(Time t);
    public float checkSalary();
    public Boolean getAvailability();
    public ArrayList<String> getWorkingDays();
}
