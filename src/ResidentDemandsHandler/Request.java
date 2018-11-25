/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResidentDemandsHandler;

import AccountHandler.ResidentServiceHandler.ResidentServiceObserver;
import java.util.ArrayList;
import DB.RequestTable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author glori
 */
public class Request extends UnicastRemoteObject implements RequestSubject, RequestResidentServiceInt{
    private String residentName,residentPhone,residentAddress;
    private String serviceType,serviceNeededDate;
    private ArrayList<ResidentServiceObserver> residentServices;
    private static int ID=0;
    public RequestTable table=new RequestTable();
    public Request() throws RemoteException {
        this.residentServices = new ArrayList<>();
        ID++;
    }

    public Request(String residentName, String residentPhone, String residentAddress, String serviceType, String serviceNeededDate) throws RemoteException {
        this.residentName = residentName;
        this.residentPhone = residentPhone;
        this.residentAddress = residentAddress;
        this.serviceType = serviceType;
        this.serviceNeededDate = serviceNeededDate;
        this.residentServices = new ArrayList<>();
        ID++;
    }

    
    public Request(String residentName, String residentPhone, String residentAddress, String serviceType, String serviceNeededDate, ArrayList<ResidentServiceObserver> residentServices)throws RemoteException  {
        this.residentName = residentName;
        this.residentPhone = residentPhone;
        this.residentAddress = residentAddress;
        this.serviceType = serviceType;
        this.serviceNeededDate = serviceNeededDate;
        this.residentServices = residentServices;
        ID++;
    }

    public void addNewRequest(Request r)throws RemoteException {
        table.insertRequest(r);
    }
     
    @Override
    public void deleteRequest()throws RemoteException {
        table.deleteRequest(ID);
    }
    
    @Override
    public Request viewRequest()throws RemoteException {
        return table.getRequestByID(ID) ;
    }
    
    @Override
    public void notifyAllResidentServices()throws RemoteException {
        for(int i=0;i<residentServices.size();i++)
            residentServices.get(i).getNewComplaintNotification("New Request is added by "+residentName+" at "+residentAddress);
    }
    
    @Override
    public void addNewResidentService(ResidentServiceObserver r)throws RemoteException {
        residentServices.add(r);
    }
    @Override
    public void removeResidentService(String name)throws RemoteException {
        for(int i=0;i<residentServices.size();i++)
            if(residentServices.get(i).getName().equals(name))
                residentServices.remove(i);
        
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Request.ID = ID;
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
