/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceHandler;
import DB.CateringPlaceTable;
import DB.ReligiousPlaceTable;
import DB.SocialPlaceTable;
import ServiceHandler.PlaceInt;
import java.rmi.RemoteException;

/**
 *
 * @author Mostafa
 */
public class PlaceFactory {
 
    
public PlaceInt addaNewPlace(String s,String Name,String Address,Schedule sch) throws RemoteException{

    PlaceInt p;
    System.out.println("ahlnnn");
    
    if("r".equals(s)){
        System.out.println("ya reettt nshofhaaaa");
            PlaceInt rp = new ReligiousPlace(Name,Address,sch);
            System.out.println("walllllrr");
            ReligiousPlaceTable rpt = new ReligiousPlaceTable();
            rpt.insertplace((ReligiousPlace) rp);
            return rp;
    }
    else if ("s".equals(s))
    {
            PlaceInt sp =  new SocialPlace(Name,Address,sch);
            System.out.println("wall s");
            SocialPlaceTable spt = new SocialPlaceTable();
            spt.insertplace((SocialPlace) sp);
            return sp;

    }
    else 
    {
            PlaceInt cp = new CateringPlace(Name,Address,sch);
            System.out.println("walllllaaccc");
            CateringPlaceTable cpt = new CateringPlaceTable();
            cpt.insertplace((CateringPlace) cp);
            return cp;
    }
}
        


}

