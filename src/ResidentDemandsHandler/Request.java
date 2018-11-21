/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResidentDemandsHandler;

import AccountHandler.ResidentServiceHandler.ResidentServiceObserver;
import java.util.ArrayList;

/**
 *
 * @author glori
 */
public class Request implements RequestSubject, RequestResidentServiceInt{
    private String residentName,residentPhone,residentAddress;
    private String serviceType,serviceNeededDate;
    private ArrayList<ResidentServiceObserver> residentServices;

    public Request() {
        this.residentServices = new ArrayList<>();
    }

    public Request(String residentName, String residentPhone, String residentAddress, String serviceType, String serviceNeededDate) {
        this.residentName = residentName;
        this.residentPhone = residentPhone;
        this.residentAddress = residentAddress;
        this.serviceType = serviceType;
        this.serviceNeededDate = serviceNeededDate;
        this.residentServices = new ArrayList<>();
    }

    
    public Request(String residentName, String residentPhone, String residentAddress, String serviceType, String serviceNeededDate, ArrayList<ResidentServiceObserver> residentServices) {
        this.residentName = residentName;
        this.residentPhone = residentPhone;
        this.residentAddress = residentAddress;
        this.serviceType = serviceType;
        this.serviceNeededDate = serviceNeededDate;
        this.residentServices = residentServices;
    }

    public void makeNewRequest(Request r){
        
    }
    
    public Request viewRequest(){
        return this;
    }
    
    public void notifyAllResidentServices(){
        
    }
    
    public void addNewResidentService(ResidentServiceObserver r){
        
    }
    
    public void removeResidentService(String name){
        
    }
    
    public void deleteRequest(){
        
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

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceNeededDate() {
        return serviceNeededDate;
    }

    public void setServiceNeededDate(String serviceNeededDate) {
        this.serviceNeededDate = serviceNeededDate;
    }

    public ArrayList<ResidentServiceObserver> getResidentServices() {
        return residentServices;
    }

    public void setResidentServices(ArrayList<ResidentServiceObserver> residentServices) {
        this.residentServices = residentServices;
    }

    @Override
    public String toString() {
        return "Request{" + "residentName=" + residentName + ", residentPhone=" + residentPhone + ", residentAddress=" + residentAddress + ", serviceType=" + serviceType + ", serviceNeededDate=" + serviceNeededDate + ", residentServices=" + residentServices + '}';
    }
    
    
}
