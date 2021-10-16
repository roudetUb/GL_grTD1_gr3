package fr.ufrsciencestech.panier.Model;

/**
 *
 * @author roudet
 */
public class Orange extends FruitSimple implements Fruit{
    public Orange(double prix, String origine)
    {
        super();
        if(prix < 0)
            super.prix = -prix;  //une solution possible pour interdire les prix negatifs
        else
            super.prix = prix;

        if(origine.equals(""))
            super.origine = "Espagne";  //Espagne par défaut
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
        return "Orange de " + origine + " coutant " + prix + " euros";
    }
}
