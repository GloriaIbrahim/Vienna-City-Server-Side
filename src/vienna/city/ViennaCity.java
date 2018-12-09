/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vienna.city;

import AccountHandler.AccountsManager;
import AccountHandler.AdminHandler.Admin;
import AccountHandler.EmplyeeHandler.Employee;
import AccountHandler.PublicRelationHandler.PublicRelation;
import AccountHandler.PublicRelationHandler.PublicRelationManager;
import AccountHandler.ResidentHandler.Resident;
import AccountHandler.ResidentHandler.ResidentInt;
import ResidentDemandsHandler.Complaint;
import ResidentDemandsHandler.Request;
import ResidentDemandsHandler.RequestFacade;
import ResidentDemandsHandler.RequestFacadeInt;
import ResidentDemandsHandler.RequestInt;
import ResidentDemandsHandler.ResidentDemandsManager;
import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import BillPayment.Bill;
import BillPayment.BillInt;
import BillPayment.BillManager;
import BillPayment.BillManagerInt;
import BillPayment.Cash;
import BillPayment.CreditCard;
import BillPayment.Payment;
import DB.BillDB;
import DB.EmployeeGateway;
import ExternalRelations.ExternalRelationsManager;
import ExternalRelations.ExternalRelationsManagerInt;
import ServiceHandler.ServiceManger;
import UtilityHandler.CleaningUtilityFactory;
import UtilityHandler.ElectricityUtilityFactory;
import UtilityHandler.GardeningUtilityFactory;
import UtilityHandler.UtilityFactoryInt;
import UtilityHandler.UtilityListManager;
import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
/**
 *
 * @author glori
 */
public class ViennaCity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws  RemoteException, AlreadyBoundException {
        
        
        /////////////////////////////////////////////////////
        ///////////GLORIA////////////////////////////////////
        /////////////////////////////////////////////////////
        ResidentDemandsManager residentDemands=ResidentDemandsManager.getResidentDemandsManager();
        AccountsManager accountsManager=AccountsManager.getAccountManager();
       
        
        // TODO code application logic here
        accountsManager.deleteAllResidentsBySpecificName("Gloria");
        
        Resident resident1=new Resident("Gloria",1234,"2 August 1996","Gloriat","lola1996");
        resident1.setPhone("01270979169");
        resident1.setAddress("556 portsaid");
        resident1.setNewBillIsAdded(true);
        
        
        accountsManager.addNewResident(resident1);
        
        System.out.println(accountsManager.getResidentByName("Gloria").getUsername());
        
        
        // An RMI Registry initialized on port 1102
        Registry r = LocateRegistry.createRegistry(1102);
        
        r.bind("residentDemands",residentDemands);
        r.bind("accountsManager", accountsManager);
        
        
        
       
        /*ResidentInt r1=(ResidentInt)UnicastRemoteObject.exportObject(resident1,1102);
        Request request1=new Request();
        request1.setResidentName(resident1.getName());
        request1.setResidentPhone(resident1.getPhone());
        request1.setResidentAddress(resident1.getAddress());
        RequestFacadeInt request=new RequestFacade(request1);
        r.bind("Resident1", r1);
        r.bind("Request1", request);*/
        
        
        // Outputs that the server is ready
        System.out.println("The server is ready");
        System.out.println(resident1.getUsername());
        System.out.println(resident1.getPassword());
        //System.out.println(accountsManager.residentEditPassword(resident1,resident1.getPassword() , "rosalie25"));

        //Complaint c=new Complaint(resident1.getName(),resident1.getPhone(),resident1.getAddress(),"Waste of money","It is a waste for my money to pay your huge bills",1);
        //residentDemands.addNewComplaint(resident1.getName(),resident1.getPhone(),resident1.getAddress(),"Waste of money","It is a waste for my money to pay your huge bills");
        //resident1.addComplaint(new Complaint(resident1.getName(),resident1.getPhone(),resident1.getAddress(),"Waste of money","It is a waste for my money to pay your huge bills",1));
        //System.out.println(residentDemands.viewComplaintByID(1));
        //residentDemands.deleteAllComplaintsBySpecificUser("Gloria");
        
        /*for(int i=0;i<residentDemands.viewAllComplaints().size();i++)
            System.out.println(residentDemands.viewAllComplaints().get(i));
        
        for(int i=0;i<residentDemands.viewAllRequests().size();i++)
            System.out.println(residentDemands.viewAllRequests().get(i));*/
        
        
        
        
        
        //////////////////////////////////////////////////
        //////////////MAMDOUH////////////////////////////
        ////////////////////////////////////////////////
        
        BillManager b= BillManager.getInstance();
        
        b.addBill(1,"mohamed","Electricity","Description",100.0);
        b.addBill(2,"mohamed","water","Description",50.0);
        b.addBill(3,"mohamed","gas","Description",25.0);
        
        
        BillInt bi=new Bill(44,"m","e","d",555,new Cash());
        
        Registry r2 = LocateRegistry.createRegistry(1200);
        
        
        
        
        ArrayList<Bill> bills=b.getBd().getAllBills();
        for(int ii=0;ii<bills.size();ii++){
            System.out.println(bills.get(ii).toString());
        }
        
        int i=1;
        
        BillInt electricity=new Bill(bi.getBillByIndex(i).getID(),bi.getBillByIndex(i).getResidentName(),bi.getBillByIndex(i).getType(),bi.getBillByIndex(i).getDescription(),bi.getBillByIndex(i).getAmount(),new Cash());
        r.bind("bille",electricity);
        r2.bind("bille",electricity);
        BillInt water=new Bill(bi.getBillByIndex(i+1).getID(),bi.getBillByIndex(i+1).getResidentName(),bi.getBillByIndex(i+1).getType(),bi.getBillByIndex(i+1).getDescription(),bi.getBillByIndex(i+1).getAmount(),new Cash());
        r.bind("billw",water);
        r2.bind("billw",water);
        BillInt gas=new Bill(bi.getBillByIndex(i+2).getID(),bi.getBillByIndex(i+2).getResidentName(),bi.getBillByIndex(i+2).getType(),bi.getBillByIndex(i+2).getDescription(),bi.getBillByIndex(i+2).getAmount(),new Cash());
        r.bind("billg",gas);
        r2.bind("billg",gas);
        r.bind("addbill",b);
        r2.bind("addbill",b);
        System.out.println("The server is ready");
        
        
        
        
        /////////////////////////////////////////////
        //////////////////CHERINE////////////////////
        /////////////////////////////////////////////
       
        ExternalRelationsManagerInt er=new  ExternalRelationsManager();
        PublicRelationManager PR=PublicRelationManager.getExternalRelationsManager();
        PR.addNewPR( "Cherine", 12345, "6/12/1996", "Cherry", "cherry612");
        Registry r3=LocateRegistry.createRegistry(1103); 
        r3.bind("ExternalRelations",er);
        r3.bind("PRmanager", PR);
        System.out.println("My external relations server is ready!");
        
        
        ///////////////////////////////////////////////
        /////////////////MOSTAFA///////////////////////
        ///////////////////////////////////////////////
        
        ServiceManger sm = ServiceManger.getInstance();
        Registry r4 = LocateRegistry.createRegistry(1104);
        r4.bind("Factory", sm);
        r.bind("Factory", sm);
        System.out.println("The server is ready");


        ////////////////////////////////////////////////
        ////////////////MOATAZ/////////////////////////
        ///////////////////////////////////////////////
        
        
            // Outputs that the server is ready
            System.out.println("The server is ready");

            String[] workingDaysSet1 = {"Saturday", "Sunday", "Monday", "Tuesday"};
            String[] workingDaysSet2 = {"Wednesday", "Thuresday", "Friday"};
            Employee employee01 = new Employee("Motaz Bellah", 01, "01-01-1995", "motaz", "motaz", true, workingDaysSet1, "Cleaning");
            Employee employee02 = new Employee("Moied Bellah", 02, "01-01-1995", "motaz1", "motaz1", false, workingDaysSet2, "Gardening");
            ArrayList<Employee> employeesList = new ArrayList<>();
            employeesList.add(employee01);
            employeesList.add(employee02);
     System.out.println("done");
            
      
            Employee employee03 = new Employee("Motaz Bellah", 01, "01-01-1995", "motaz", "motaz", true, workingDaysSet1, "Cleaning");
            EmployeeGateway employeeGateway = EmployeeGateway.getInstance();
            employeeGateway.insertEmployee(employee03);
            System.out.println("test output:" + employee03.test().getUsername());



            UtilityFactoryInt gardeningUtilityFactory = new GardeningUtilityFactory();
            UtilityFactoryInt cleaningUtilityFactory = new CleaningUtilityFactory();
            UtilityFactoryInt electricityUtilityFactory = new ElectricityUtilityFactory();
            Registry reg = LocateRegistry.createRegistry(1100);
            reg.bind("gardeningUtilityFactory", gardeningUtilityFactory);
            System.out.println("Gardening factory is ready");

            reg.bind("cleaningUtilityFactory", cleaningUtilityFactory);
            System.out.println("Cleaning factory is ready");

            reg.bind("electricityUtilityFactory", electricityUtilityFactory);
            System.out.println("Electricity factory is ready");
            
            UtilityListManager utilityListManager = UtilityListManager.getUtilityListManager();
            reg.bind("utilityListManagerInt", utilityListManager);
            System.out.println("UtilityListManager is ready");
            
            
//
//            UtilityIntRMI gardeningUtility = new GardeningUtility();
//            reg.bind("gardeningUtility", gardeningUtility);
//            System.out.println("Gardening utility is ready");
//
//            UtilityIntRMI cleaningUtility = new CleaningUtility();
//            reg.bind("cleaningUtility", cleaningUtility);
//            System.out.println("Cleaning utility is ready");
//
//            UtilityIntRMI electricityUtility = new ElectricityUtility();
//            reg.bind("electricityUtility", electricityUtility);
//            System.out.println("Electricity utility is ready");
//
//            reg.bind("Cleaning Utility Factory", CleaningUtilityFactory);
//            System.out.println("Cleaning is ready");
//
//            reg.bind("Electricity Utility Factory", ElectricityUtilityFactory);
//            System.out.println("Electricity factory is ready");
            //        UtilityIntRMI utilityIntRMI = new GardeningUtility();
            //            reg.bind("Electricity Utility Factory", utilityIntRMI);
            //          System.out.println("Utility factory is ready");
            //           reg.bind("Electricity Utility Factory", utilityInt);
            //          reg.bind("Gardening Utility Factory", utilityInt);
            //        System.out.println("Electricity factory is ready");
//            UtilityFactoryInt stub = (UtilityFactoryInt) UnicastRemoteObject.exportObject(utilityFactoryInt, 1100);
//            reg.bind("GardeningUtilityFactory", stub);
//            System.out.println("Utility Object has been exported");
//            UtilityFactoryRMI utilityFactoryInt2 = new GardeningUtilityFactory();
//            UtilityFactoryRMI stub2 = (UtilityFactoryRMI) UnicastRemoteObject.exportObject(utilityFactoryInt2, 1100);
//            reg.bind("myUtilityFactory", stub2);
//            System.out.println("Utility Object has been exported");
//            
//            UtilityFactoryRMI utilityFactoryInt3 = new GardeningUtilityFactory();
//            UtilityFactoryRMI stub3 = (UtilityFactoryRMI) UnicastRemoteObject.exportObject(utilityFactoryInt3, 1100);
//            reg.bind("myUtilityFactory", stub3);
//            System.out.println("Utility Object has been exported");
            // Publish to client
        
    }
    
}
