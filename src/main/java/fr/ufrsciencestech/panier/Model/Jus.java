/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Model;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author am251332
 */
public class Jus extends Observable{

    private Fruit f;
    public Jus(Fruit f)
    {
        this.f = f;
    }

    public String toString()
    {
        return this.toString();
    }
    public boolean isSeedless()
    {
        return this.f.isSeedless();
    }
    public static void main(String[] args)
    {
        Fruit o = new Orange();
        Jus j1 = new Jus(o);
        //Jus j2 = new Jus(new Macedoine());
        
    }
}
