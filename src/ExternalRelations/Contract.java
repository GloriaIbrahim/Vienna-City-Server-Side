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
public class Contract implements ContractInt,ContractPublicRelationInt{
    private String type;
    private int ID;
    private String date;
    private String dateOfExpiry;
    private String status;
    private String description;

    public Contract() {
    }

    public Contract(String type, int ID, String date, String dateOfExpiry, String status, String description) {
        this.type = type;
        this.ID = ID;
        this.date = date;
        this.dateOfExpiry = dateOfExpiry;
        this.status = status;
        this.description = description;
    }

    public void createContract(String t,String d,String e,String s,String des){
        
    }
    
    public void removeContract(int id){
        
    }
    public void approveContract(int id){
        
    }
    public Contract editContract(int id){
        return this;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(String dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Contract{" + "type=" + type + ", ID=" + ID + ", date=" + date + ", dateOfExpiry=" + dateOfExpiry + ", status=" + status + ", description=" + description + '}';
    }
    
}
