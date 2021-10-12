package fr.ufrsciencestech.panier.Model;

import java.util.ArrayList;

public class Macedoine extends Fruit{
    
    private ArrayList<Fruit> listeFruit;
    private String origine;
    private boolean seed;
    private double prix;
    public Macedoine(ArrayList lesFruits, String origine, double prix)
    {
        listeFruit = lesFruits;
        this.origine = origine;
        this.prix = prix;
        seed = false;
        for(int i = 0; i < listeFruit.size();i++ )
        {
            if(!listeFruit.get(i).isSeedless())
                seed = true;
        }
    }

    public Macedoine()
    {
        this(New ArrayList<Fruit>(), "-------", false, 0.00);
    }

    public boolean isSeedless()
    {
        return !this.seed;
    }
    public double getPrix()
    {
        return this.prix;
    }
    public void toString()
    {
        String res;
        res = " --- Liste des fruits --- \n"
        for(int i = 0;i < listeFruit.size(); i++)
        {
            res += "  -> "+listefruit.get(i)+"\n";
        }
        res += " --- Prix --- \n  -> "+prix+"\n";
        res += " --- Sans graine ? --- \n  -> "+seed+"\n";
        res += " --- Originaire de --- \n  -> "+origine+"\n";

        return res;
    }
}