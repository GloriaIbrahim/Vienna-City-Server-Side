/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountHandler.EmplyeeHandler;

import AccountHandler.Staff;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author glori
 */
public class Employee extends Staff implements EmployeeInt{
    private Boolean availability;
    private ArrayList<String> workingDays;

    public Employee() {
    }

    public Employee(String name, int SSN, String dateOfBirth, String username, String password) {
        super(name, SSN, dateOfBirth, username, password);
    }

    public Employee(Boolean availability, ArrayList<String> workingDays, String name, int SSN, String dateOfBirth, String username, String password) {
        super(name, SSN, dateOfBirth, username, password);
        this.availability = availability;
        this.workingDays = workingDays;
    }

    public Employee(Boolean availability, ArrayList<String> workingDays, Time checkInTime, Time checkOutTime, float salary, String name, int SSN, String dateOfBirth, String username, String password) {
        super(checkInTime, checkOutTime, salary, name, SSN, dateOfBirth, username, password);
        this.availability = availability;
        this.workingDays = workingDays;
    }

    @Override
    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    @Override
    public ArrayList<String> getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(ArrayList<String> workingDays) {
        this.workingDays = workingDays;
    }

    @Override
    public String toString() {
        return "Employee{" + "availability=" + availability + ", workingDays=" + workingDays + '}';
    }
    
}
