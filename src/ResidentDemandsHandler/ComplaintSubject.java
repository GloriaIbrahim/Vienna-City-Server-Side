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
public interface ComplaintSubject {
    public void notifyAllResidentServices();
    public void addNewResidentService(ResidentServiceObserver r);
    public void removeResidentService(String name);
}
