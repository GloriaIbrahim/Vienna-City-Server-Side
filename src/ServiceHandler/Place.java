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
public class Place implements PlaceInt {
    ArrayList<String> venuesAvailable;
    Schedule venuesSchedule;
    String Type;

    public Place(ArrayList<String> venuesAvailable, Schedule venuesSchedule, String Type) {
        this.venuesAvailable = venuesAvailable;
        this.venuesSchedule = venuesSchedule;
        this.Type = Type;
    }

    public ArrayList<String> getVenuesAvailable() {
        return venuesAvailable;
    }

    public void setVenuesAvailable(ArrayList<String> venuesAvailable) {
        this.venuesAvailable = venuesAvailable;
    }

    public Schedule getVenuesSchedule() {
        return venuesSchedule;
    }

    public void setVenuesSchedule(Schedule venuesSchedule) {
        this.venuesSchedule = venuesSchedule;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    
    
    
    @Override
    public void bookPlacel(String i) {

        
    }

    @Override
    public void approveBooking() {

    }
    
    
}
