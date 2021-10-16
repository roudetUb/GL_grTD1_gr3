package fr.ufrsciencestech.panier.Model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BananeTest {
    /**
     *
     */
    @Before
    public void setUp(){
    }

    @Test
    public void testPrixNegatif() {
        System.out.println("prix negatif");
        Banane instance = new Banane(-1.0,"Portugal");
        double expResult = 1.0;
        double result = instance.getPrix();
        assertTrue(expResult == result);
    }

    @Test
    public void testChaineVide() {
        System.out.println("chaine vide");
        Banane instance = new Banane(1.0,"");
        String expResult = "Portugal";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Orange.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Banane instance = new Banane(0.5,"");
        String expResult = "Banane de Portugal coutant 0.5 euros";
        String result = instance.toString();
        System.out.println(expResult + " :: " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Banane instance = new Banane(1.0,"");
        String expResult = "Portugal";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCountry() {
        System.out.println("setOrigine");
        Banane instance = new Banane(1.0,"");
        String expResult = "Chine";
        instance.setOrigine("Chine");
        String result = instance.getOrigine();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Banane instance = new Banane(2.0,"Chine");
        double expResult = 2.0;
        double result = instance.getPrix();
        assertTrue(expResult == result);
    }

    @Test
    public void testSetPrix() {
        System.out.println("setPrix");
        Banane instance = new Banane(1.0,"");
        double expResult = 0.7;
        instance.setPrix(0.7);
        double result = instance.getPrix();
        assertTrue(expResult == result);
    }

    /**
     * Test of isSeedless method, of class Orange.
     */
    @Test
    public void testIsSeedless() {
        System.out.println("isSeedless");
        Banane instanceavecpepins = new Banane(1.0,"");
        boolean expResult1 = false;
        boolean result1 = instanceavecpepins.isSeedless();
        assertTrue(result1 != expResult1);
    }
}
