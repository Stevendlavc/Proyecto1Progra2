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
public class Person {
    //atributos
    private String name;
    private int age;
    private String identification;
    
    //constructores
    public Person(){
        this.name = "";
        this.age = 0;
        this.identification = "";
    }
    
    public Person(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.identification = id;
    }
    
    //metodos accesores
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }
    
    @Override
    public String toString(){
        return "Person name: " + this.getName() + ", Age: " + this.getAge();
    }
}
