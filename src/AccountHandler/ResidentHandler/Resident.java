/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountHandler.ResidentHandler;

import AccountHandler.Person;
import BillPayment.Bill;
import ResidentDemandsHandler.Complaint;
import ResidentDemandsHandler.Request;
import java.util.ArrayList;

/**
 *
 * @author glori
 */
public class Resident extends Person implements ResidentInt{
    private ArrayList<Bill> bills;
    private ArrayList<Request> requests;
    private ArrayList<Complaint> complaints;
    private String address;
    private String phone;

    public Resident() {
    }

    public Resident(String name, int SSN, String dateOfBirth, String username, String password) {
        super(name, SSN, dateOfBirth, username, password);
    }

    public Resident(String address, String phone, String name, int SSN, String dateOfBirth, String username, String password) {
        super(name, SSN, dateOfBirth, username, password);
        this.address = address;
        this.phone = phone;
        this.requests=new ArrayList<Request>();
        this.complaints=new ArrayList<Complaint>();
        this.bills=new ArrayList<Bill>();
    }
    
    public Resident(ArrayList<Bill> bills, ArrayList<Request> requests, ArrayList<Complaint> complaints, String address, String phone, String name, int SSN, String dateOfBirth, String username, String password) {
        super(name, SSN, dateOfBirth, username, password);
        this.bills = bills;
        this.requests = requests;
        this.complaints = complaints;
        this.address = address;
        this.phone = phone;
    }
    
    public ArrayList<Bill> viewBills(){
        return getBills();
    }
    public void viewMap(){
        
    }
    public void addNewResident(Resident r){
        
    }
    public void removeResident(String n){
        
    }
    public ArrayList<Bill> getBills() {
        return bills;
    }

    public void setBills(ArrayList<Bill> bills) {
        this.bills = bills;
    }

    public ArrayList<Request> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }

    public ArrayList<Complaint> getComplaints() {
        return complaints;
    }

    public void setComplaints(ArrayList<Complaint> complaints) {
        this.complaints = complaints;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Resident{" + "bills=" + bills + ", requests=" + requests + ", complaints=" + complaints + ", address=" + address + ", phone=" + phone + '}';
    }
    
}
