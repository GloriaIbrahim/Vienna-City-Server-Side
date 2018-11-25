/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountHandler;

import AccountHandler.AdminHandler.Admin;
import AccountHandler.EmplyeeHandler.Employee;
import AccountHandler.PublicRelationHandler.PublicRelation;
import AccountHandler.ResidentHandler.Resident;
import AccountHandler.ResidentServiceHandler.ResidentService;
import java.util.ArrayList;

/**
 *
 * @author glori
 */
public class AccountManager {
    ArrayList<Resident> residents=new ArrayList<>();
    ArrayList<PublicRelation> PRs=new ArrayList<>();
    ArrayList<Employee> employees=new ArrayList<>();
    ArrayList<ResidentService> residentServices=new ArrayList<>();
}
