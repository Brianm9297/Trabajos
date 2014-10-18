
package info_academica;

import java.util.ArrayList;

/**
 *
 * @author Brian Mendivelso
 */
public class Teacher {
    
    private String name;
    private String surName;
    private ArrayList<Group> groupTough;
    private String email;

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
            
    
    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }
    
            
    
}
