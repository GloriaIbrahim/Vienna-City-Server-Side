/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilityHandler;


/**
 *
 * @author glori
 */
public interface Utility {
    public void reserveUtility(String i,String j,String h,String k,String l);
    public void scheduleReservation(String i);
    public Utility getReservation();
}
