/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResidentDemandsHandler;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author glori
 */
public interface ComplaintInt extends Remote{
    public void addNewComplaint(Complaint c)throws RemoteException;
    public void deleteComplaint()throws RemoteException;
    public Complaint viewComplaint()throws RemoteException;
    public void setResidentInfo(String name,String phone,String add)throws RemoteException;
    public String getResidentInfo()throws RemoteException ;
}
