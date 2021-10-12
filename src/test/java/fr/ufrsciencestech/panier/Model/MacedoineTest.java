/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Model;

import fr.ufrsciencestech.panier.Model.Macedoine;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author celine
 */
public class MacedoineTest {
    
    /**
     *
     */
    @Before
    public void setUp() {
        ArrayListe<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(new Ananas());
        fruits.add(new Orange());
        fruits.add(new Ananas());
    }

    @Test
    public void testPrixNegatif() {
        System.out.println("prix negatif");
        Macedoine instance = new Macedoine(fruits, "Espagne", -1.00);
        double expResult = 2.0;
        double result = instance.getPrix();
        assertTrue(expResult == result);
    }
    
    /**
     * Test of constructeur, of class Ananas.
     */
    @Test
    public void testChaineVide() {
        System.out.println("chaine vide");
        Macedoine instance = new Macedoine(fruits, "", 0.00);
        String expResult = "Finlande";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Macedoine instance = new Macedoine(fruits, "Martinique", 0.00);
        String expResult = "Martinique";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Macedoine instance = new Macedoine(fruits, "Espagne", 2.0);
        double expResult = 2.0;
        double result = instance.getPrix();
        assertTrue(expResult == result);
    }
    

    /**
     * Test of toString method, of class Ananas.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Macedoine instance = new Macedoine();
        String expResult = " --- Liste des fruits --- \n --- Prix --- \n  -> 0.00\n --- Sans graine ? --- \n  -> false\n --- Originaire de --- \n  -> -------\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of isSeedless method, of class Ananas.
     */
    @Test
    public void testIsSeedless() {
        System.out.println("isSeedless");
        Macedoine instance = new Macedoine();
        boolean expResult = false;
        boolean result = instance.isSeedless();
        assertEquals(expResult, result);
    }
}
