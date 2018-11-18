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
public class CreditCard implements Payment{
    private int creditCardNum;

    public CreditCard(int creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    public CreditCard() {
    }

    @Override
    public String pay(double b){
        return "";
    }
    
    public int getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(int creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    @Override
    public String toString() {
        return "CreditCard{" + "creditCardNum=" + creditCardNum + '}';
    }
    
}
