/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceHandler;

import java.util.ArrayList;

/**
 *
 * @author glori
 */
public class Schedule {
    private String timeSlots[][];
    private ArrayList<String> availableDays;
    
    public String[][] viewSchedule(){
        return timeSlots;
    };
    public void bookSlotOfTime(String i,int j,int k){};
    
    public String[][] findAvailableSlots()
    {
        return timeSlots;
    }
}
