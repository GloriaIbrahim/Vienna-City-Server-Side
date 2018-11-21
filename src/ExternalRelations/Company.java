/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExternalRelations;

/**
 *
 * @author glori
 */
public class Company implements CompanyInt{
    private String name;
    private int ID;
    private String address;
    private String specialization;
    private Contract contract;
    private String contactEmail;

    public Company() {
    }

    public Company(String name, int ID, String address, String specialization, Contract contract, String contactEmail) {
        this.name = name;
        this.ID = ID;
        this.address = address;
        this.specialization = specialization;
        this.contract = contract;
        this.contactEmail = contactEmail;
    }

    public void addNewCompany(String n,String add,String s){
        
    }
    
    public void removeCompany(int id){
        
    }
    
    @Override
    public Company displayCompanyDetails(){
        return this;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public String toString() {
        return "Company{" + "name=" + name + ", ID=" + ID + ", address=" + address + ", specialization=" + specialization + ", contract=" + contract + ", contactEmail=" + contactEmail + '}';
    }
    
}
