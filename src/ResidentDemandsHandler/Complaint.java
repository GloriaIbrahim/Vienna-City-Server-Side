/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResidentDemandsHandler;

import java.util.ArrayList;
import AccountHandler.ResidentServiceHandler.ResidentServiceObserver;
import DB.ComplaintTable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author glori
 */
public class Complaint extends UnicastRemoteObject implements ComplaintSubject, ComplaintResidentServiceInt  {
    private String residentName,residentPhone,residentAddress,complaintAbout,complaintDescription;
    private static int ID=0;
    private ArrayList<ResidentServiceObserver> residentServices;
    public ComplaintTable table=new ComplaintTable();
    public Complaint()throws RemoteException {
        this.residentServices = new ArrayList<>();
        ID++;
    }
    
    public Complaint(String residentName, String residentPhone, String residentAddress, String complaintAbout, String complaintDescription)throws RemoteException {
        this.residentName = residentName;
        this.residentPhone = residentPhone;
        this.residentAddress = residentAddress;
        this.complaintAbout = complaintAbout;
        this.complaintDescription = complaintDescription;
        this.residentServices = new ArrayList<>();
        ID++;
    }

    
    public Complaint(String residentName, String residentPhone, String residentAddress, String complaintAbout, String complaintDescription, ArrayList<ResidentServiceObserver> residentServices) throws RemoteException{
        this.residentName = residentName;
        this.residentPhone = residentPhone;
        this.residentAddress = residentAddress;
        this.complaintAbout = complaintAbout;
        this.complaintDescription = complaintDescription;
        this.residentServices = residentServices;
        ID++;
    }

    public void addNewComplaint(Complaint c)throws RemoteException{
        table.insertComplaint(c);
    }
    
    @Override
    public Complaint viewComplaint()throws RemoteException{
        return table.getComplaintByID(ID);
    }
    
    @Override
    public void deleteComplaint()throws RemoteException{
        table.deleteComplaint(ID);
    }
    
    @Override
    public void notifyAllResidentServices()throws RemoteException{
        for(int i=0;i<residentServices.size();i++)
            residentServices.get(i).getNewComplaintNotification("New Complaint is added by "+residentName+" at "+residentAddress);
    }
    
    @Override
    public void addNewResidentService(ResidentServiceObserver r)throws RemoteException{
        residentServices.add(r);
    }
    @Override
    public void removeResidentService(String name)throws RemoteException{
        for(int i=0;i<residentServices.size();i++)
            if(residentServices.get(i).getName().equals(name))
                residentServices.remove(i);
        
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Complaint.ID = ID;
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
        return "Complaint "+ID+" by " + residentName + "/nHis phone number is " + residentPhone + "/nHis address is " + residentAddress + "/nThe complaint is about " + complaintAbout + "/nThe complaints description is " + complaintDescription ;
    }

    

    
}
