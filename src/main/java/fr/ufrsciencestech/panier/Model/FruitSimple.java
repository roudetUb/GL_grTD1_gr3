package fr.ufrsciencestech.panier.Model;

public abstract class FruitSimple {
    protected double prix;
    protected String origine;

    public double getPrix() { return this.prix;}

    public String getOrigine() { return this.origine;}

    public boolean equals(Object o){
        if(o != null && getClass() == o.getClass()){
            FruitSimple fs = (FruitSimple) o;
            return (this.getPrix() == fs.prix && this.getOrigine().equals(fs.origine));
        }
        return false;
    }

    // abstract methode
    public abstract boolean isSeedless();
    public abstract String toString();
}
