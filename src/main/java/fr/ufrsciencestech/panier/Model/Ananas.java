/**
 *
 * @author roudet
 */
package fr.ufrsciencestech.panier.Model;

public class Ananas extends FruitSimple implements Fruit{

    public Ananas(double prix, String origine)
    {
        super();
        if(prix < 0)
            super.prix = -prix;  //une solution possible pour interdire les prix negatifs
        else
            super.prix = prix;

        if(origine.equals(""))
            super.origine = "Finlande";  //Finlande par défaut
        else
            super.origine = origine;
    }

    public void setPrix(double prix){
        super.prix=prix;
    }

    public void setOrigine(String origine){
        super.origine=origine;
    }

    public boolean isSeedless() {  //predicat indiquant qu'un Ananas n'a pas de pepins
        return true;
    }

    public String toString(){
        return "Ananas de " + origine + " coutant " + prix + " euros";
    }
}
