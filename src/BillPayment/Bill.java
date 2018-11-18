/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BillPayment;

/**
 *
 * @author glori
 */
public class Bill implements BillInt{
    private final int ID;
    private final String residentName;
    private final String type;
    private final String description;
    private final double amount;
    private final Payment payment;

    public Bill(int ID, String residentName, String type, String description, double amount, Payment payment) {
        this.ID = ID;
        this.residentName = residentName;
        this.type = type;
        this.description = description;
        this.amount = amount;
        this.payment = payment;
    }
    
    public String Pay(double a){
        return "";
    }
    
    public Bill viewBill(){
        return this;
    }
    
    public int getID() {
        return ID;
    }

    public String getResidentName() {
        return residentName;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public Payment getPayment() {
        return payment;
    }

    @Override
    public String toString() {
        return "Bill{" + "ID=" + ID + ", residentName=" + residentName + ", type=" + type + ", description=" + description + ", amount=" + amount + ", payment=" + payment + '}';
    }

    
}
