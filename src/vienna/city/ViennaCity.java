/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vienna.city;

import AccountHandler.AdminHandler.Admin;
import AccountHandler.ResidentHandler.Resident;
import AccountHandler.ResidentHandler.ResidentInt;
import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
/**
 *
 * @author glori
 */
public class ViennaCity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws  RemoteException, AlreadyBoundException {
        // TODO code application logic here
        //ResidentInt resident1=new Resident("Gloria","97678","Daher",4542,"2/8","Gloriat","lola1996");
        // An RMI Registry initialized on port 1099
        //Registry r = LocateRegistry.createRegistry(1099);
        Registry admin = LocateRegistry.createRegistry(1099);
        //r.bind("res", resident1);
        admin.bind("Admin",  Admin.getAdmin());
        // Outputs that the server is ready
        System.out.println("The server is ready");
    }
    
}
