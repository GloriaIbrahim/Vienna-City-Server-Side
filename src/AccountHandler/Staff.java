/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountHandler;

import java.rmi.RemoteException;
import java.sql.Time;

/**
 *
 * @author glori
 */
abstract public class Staff extends Person{
    private Time checkInTime;
    private Time checkOutTime;
    private float salary;

    //constractors
    
    public Staff() throws RemoteException{
    }

    public Staff(String name, int SSN, String dateOfBirth, String username, String password) throws RemoteException {
        super(name, SSN, dateOfBirth, username, password);
    }

    public Staff(Time checkInTime, Time checkOutTime, float salary, String name, int SSN, String dateOfBirth, String username, String password) throws RemoteException {
        super(name, SSN, dateOfBirth, username, password);
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.salary = salary;
    }

    //functions
    
    public void checkIn(Time t){
        
    }
    
    public void checkOut(Time t){
        
    }
    
    public float checkSalary(){
        return getSalary();
    }
    
    //setters and getters
    
    public Time getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Time checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Time getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Time checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" + "checkInTime=" + checkInTime + ", checkOutTime=" + checkOutTime + ", salary=" + salary + '}';
    }
    
    
}
