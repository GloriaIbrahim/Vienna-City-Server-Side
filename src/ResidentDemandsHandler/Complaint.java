/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResidentDemandsHandler;

import java.util.ArrayList;
import AccountHandler.ResidentServiceHandler.ResidentServiceObserver;

/**
 *
 * @author glori
 */
public class Complaint implements ComplaintSubject, ComplaintResidentServiceInt {
    private String residentName,residentPhone,residentAddress,complaintAbout,complaintDescription;
    private ArrayList<ResidentServiceObserver> residentServices;

    public Complaint() {
        this.residentServices = new ArrayList<>();
    }

    
    public Complaint(String residentName, String residentPhone, String residentAddress, String complaintAbout, String complaintDescription) {
        this.residentName = residentName;
        this.residentPhone = residentPhone;
        this.residentAddress = residentAddress;
        this.complaintAbout = complaintAbout;
        this.complaintDescription = complaintDescription;
        this.residentServices = new ArrayList<>();
    }

    
    public Complaint(String residentName, String residentPhone, String residentAddress, String complaintAbout, String complaintDescription, ArrayList<ResidentServiceObserver> residentServices) {
        this.residentName = residentName;
        this.residentPhone = residentPhone;
        this.residentAddress = residentAddress;
        this.complaintAbout = complaintAbout;
        this.complaintDescription = complaintDescription;
        this.residentServices = residentServices;
    }

    public void makeNewComplaint(Complaint c){
    }
    
    public Complaint viewComplaint(){
        return this;
    }
    
    public void notifyAllResidentServices(){
        
    }
    
    public void addNewResidentService(ResidentServiceObserver r){
        
    }
    public void removeResidentService(String name){
        
    }
    public void deleteComplaint(){
        
    }
    
    public String getResidentName() {
        return residentName;
    }

    public void setResidentName(String residentName) {
        this.residentName = residentName;
    }

    public String getResidentPhone() {
        return residentPhone;
    }

    public void setResidentPhone(String residentPhone) {
        this.residentPhone = residentPhone;
    }

    public String getResidentAddress() {
        return residentAddress;
    }

    public void setResidentAddress(String residentAddress) {
        this.residentAddress = residentAddress;
    }

    public String getComplaintAbout() {
        return complaintAbout;
    }

    public void setComplaintAbout(String complaintAbout) {
        this.complaintAbout = complaintAbout;
    }

    public String getComplaintDescription() {
        return complaintDescription;
    }

    public void setComplaintDescription(String complaintDescription) {
        this.complaintDescription = complaintDescription;
    }

    public ArrayList<ResidentServiceObserver> getResidentServices() {
        return residentServices;
    }

    public void setResidentServices(ArrayList<ResidentServiceObserver> residentServices) {
        this.residentServices = residentServices;
    }

    @Override
    public String toString() {
        return "Complaint{" + "residentName=" + residentName + ", residentPhone=" + residentPhone + ", residentAddress=" + residentAddress + ", complaintAbout=" + complaintAbout + ", complaintDescription=" + complaintDescription + ", residentServices=" + residentServices + '}';
    }

    
}
