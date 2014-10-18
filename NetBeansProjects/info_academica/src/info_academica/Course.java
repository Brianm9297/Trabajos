
package info_academica;

import java.util.ArrayList;

public class Course {
    
    private String name;
    private int contactHours;
    private int credits;
    
    
    private ArrayList<Group> represent;
    
    public String getName() {
        return name;
    }

    public int getContactHours() {
        return contactHours;
    }

    public int getCredits() {
        return credits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactHours(int contactHours) {
        this.contactHours = contactHours;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    
}
