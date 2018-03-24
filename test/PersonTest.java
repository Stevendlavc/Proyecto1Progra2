/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import domain.Career;
import domain.Person;
import domain.Suitor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author laboratorios
 */
public class PersonTest {
    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        //este codigo se ejecuta antes de todas las pruebas
    }
    
    @AfterClass
    public static void tearDownClass() {
        //codigo que se ejecuta al final de todas las pruebas
    }
    
    @Before
    public void setUp() {
        //se ejecuta antes de cada metodo de prueba
    }
    
    @After
    public void tearDown() {
        //se ejecuta despues de cada metodo de prueba
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void FirstMethodToTest() {
         Person p1 = new Person();
         System.out.println(p1.toString());
     }
     
     @Test
     public void suitorTest(){
         Career myCareer = new Career("Informatica", false, "UCR", 2);
         Suitor s1 = new Suitor("Juan", 50, "123", 1000000, myCareer);
         System.out.println(s1.toString());
     }
}
