/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceHandler;

import java.util.ArrayList;

/**
 *
 * @author Mostafa
 */
public class ServiceManger {
 
    public static ArrayList <BusStopPlace> busStopPlace = new ArrayList <>();
    public static ArrayList <Place> place = new ArrayList <>();
    public String determineBusStop(String region){
    
        for(int i=0;i<busStopPlace.size();i++){
            if(busStopPlace.get(i).getRegion().equals(region))
                return busStopPlace.get(i).checkBussesSchedule();
                
        }
        return "";
    }
     public String Reserveplace(String region){
    
        for(int i=0;i<busStopPlace.size();i++){
            if(busStopPlace.get(i).getRegion().equals(region))
                return busStopPlace.get(i).checkBussesSchedule();
                
        }
        return "";
    }
}
