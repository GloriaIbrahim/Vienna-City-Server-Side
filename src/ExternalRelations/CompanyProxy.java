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
public class CompanyProxy implements CompanyInt{
    private Company company;
    private String name;
    private int ID;
    private String address;
    private String specialization;
    private Contract contract;
    private String contactEmail;

    public CompanyProxy() {
    }

    public CompanyProxy(String name, int ID, String address, String specialization, Contract contract, String contactEmail) {
        this.name = name;
        this.ID = ID;
        this.address = address;
        this.specialization = specialization;
        this.contract = contract;
        this.contactEmail = contactEmail;
    }
    
    @Override
    public Company displayCompanyDetails(){
        return company;
    }
}
