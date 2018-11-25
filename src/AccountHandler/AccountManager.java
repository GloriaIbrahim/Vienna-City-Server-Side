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
    public ArrayList<Resident> residents=new ArrayList<>();
    public ArrayList<PublicRelation> PRs=new ArrayList<>();
    public ArrayList<Employee> employees=new ArrayList<>();
    public ArrayList<ResidentService> residentServices=new ArrayList<>();
}
