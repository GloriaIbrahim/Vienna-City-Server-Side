/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountHandler.PublicRelationHandler;

import AccountHandler.Staff;
import java.sql.Time;

/**
 *
 * @author glori
 */
public class PublicRelation extends Staff implements PublicRelationInt{
    private String email;

    public PublicRelation() {
    }

    public PublicRelation(String name, int SSN, String dateOfBirth, String username, String password) {
        super(name, SSN, dateOfBirth, username, password);
    }

    public PublicRelation(String email, String name, int SSN, String dateOfBirth, String username, String password) {
        super(name, SSN, dateOfBirth, username, password);
        this.email = email;
    }

    public PublicRelation(String email, Time checkInTime, Time checkOutTime, float salary, String name, int SSN, String dateOfBirth, String username, String password) {
        super(checkInTime, checkOutTime, salary, name, SSN, dateOfBirth, username, password);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
