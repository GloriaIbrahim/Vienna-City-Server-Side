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
public class RequestFacade implements RequestInt{
    private Request request;
    @Override
    public void makeNewRequest(Request r){
    }
    
    @Override
    public Request viewRequest(){
        return request;
    }
    
    public void notifyAllResidentServices(){
        
    }
    
    public void addNewResidentService(ResidentServiceObserver r){
        
    }
    public void removeResidentService(String name){
        
    }
    @Override
    public void deleteRequest(){
        
    }
    
    public void setResidentInfo(String name,String phone,String add){
        
    }
    
    public Request getTesidentInfo(){
        return request;
    }
}
