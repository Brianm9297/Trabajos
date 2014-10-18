/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info_academica;

import java.util.ArrayList;

/**
 *
 * @author Brian Mendivelso
 */
public class Student {

    private int id;
    private String name;
    private String surName;
    private double papa;
    private ArrayList<Group> attends;
    //private 
    
    public ArrayList<Group> getAttends() {
        return attends;
    }

    public void setAttends(ArrayList<Group> attends) {
        this.attends = attends;
    }
            
    
    public String getName() {
        
        return " " + this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getSurName() {
        return surName;
    }

    public double getPapa() {
        return papa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setPapa(double papa) {
        this.papa = papa;
    }

}
