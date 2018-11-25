/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResidentDemandsHandler;

import AccountHandler.ResidentServiceHandler.ResidentServiceObserver;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author glori
 */
public class RequestFacade  extends UnicastRemoteObject implements RequestInt{
    private Request request;

    public RequestFacade()throws RemoteException  {
        request=new Request();
    }

    
    public RequestFacade(Request request) throws RemoteException {
        this.request = request;
    }
    
    @Override
    public void addNewRequest(Request r)throws RemoteException {
        request.addNewRequest(r);
    }
    
    @Override
    public Request viewRequest()throws RemoteException {
        return request;
    }
    
    public void notifyAllResidentServices()throws RemoteException {
        request.notifyAllResidentServices();
    }
    
    public void addNewResidentService(ResidentServiceObserver r)throws RemoteException {
        request.addNewResidentService(r);
    }
    
    public void removeResidentService(String name)throws RemoteException {
        request.removeResidentService(name);
    }
    
    @Override
    public void deleteRequest()throws RemoteException {
        request.deleteRequest();
    }
    
    @Override
    public void setResidentInfo(String name,String phone,String add)throws RemoteException {
        request.setResidentName(name);
        request.setResidentPhone(phone);
        request.setResidentAddress(add);
    }
    
    @Override
    public String getResidentInfo()throws RemoteException {
        return "Resident Name "+request.getResidentName()+"/nResident Phone "+request.getResidentPhone()+"/nResident Address "+request.getResidentAddress();
    }
}
