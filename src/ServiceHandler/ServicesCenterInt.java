/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceHandler;

/**
 *
 * @author glori
 */
public interface ServicesCenterInt {
    public void addNewBusStop(BusStopPlace i);
    public void ddNewPlace(Place i);
    public BusStopPlace getBusStop();
    public Place getCateringPlace();
    
}
