/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author laboratorios
 */
public class Career {
    //atributos
    private String degree;
    private boolean guaranteed;
    private String university;
    private int yearOfExperience;
    
    //constructores
    public Career(){
        this.degree = "";
        this.guaranteed = false;
        this.university = "";
        this.yearOfExperience = 0;
    }
    
    public Career(String degree, boolean guaranteed, String university, int years){
        this.degree = degree;
        this.guaranteed = guaranteed;
        this.university = university;
        this.yearOfExperience = years;
    }

    //accesores
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public boolean isGuaranteed() {
        return guaranteed;
    }

    public void setGuaranteed(boolean guaranteed) {
        this.guaranteed = guaranteed;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }
    
}
