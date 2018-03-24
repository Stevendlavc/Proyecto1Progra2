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
public class Suitor extends Person{
    //atributos
    private float wageClaim;
    private Career career;
    
    //constructores
    public Suitor(){
        super();
        this.wageClaim = 0;
    }
    
    public Suitor(String name, int age, String id, float wageClaim, Career career){
        super(name, age, id);
        this.wageClaim = wageClaim;
        this.career = career;
    }

    //accesores
    public float getWageClaim() {
        return wageClaim;
    }

    public void setWageClaim(float wageClaim) {
        this.wageClaim = wageClaim;
    }

    public Career getCareer() {
        return career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }
    
    
    @Override
    public String toString(){
        return super.toString() + ", Wage claim: " + this.getWageClaim();
    }
    
}
