/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResidentDemandsHandler;

import AccountHandler.ResidentServiceHandler.ResidentServiceObserver;

/**
 *
 * @author glori
 */
public class ComplaintFacade implements ComplaintInt {
    private Complaint complaint;

    public ComplaintFacade() {
    }

    public ComplaintFacade(Complaint complaint) {
        this.complaint = complaint;
    }
    
    @Override
    public void makeNewComplaint(Complaint c){
    }
    
    @Override
    public Complaint viewComplaint(){
        return complaint;
    }
    
    public void notifyAllResidentServices(){
        
    }
    
    public void addNewResidentService(ResidentServiceObserver r){
        
    }
    public void removeResidentService(String name){
        
    }
    @Override
    public void deleteComplaint(){
        
    }
    
    public void setResidentInfo(String name,String phone,String add){
        
    }
    
    public Complaint getTesidentInfo(){
        return complaint;
    }
}
