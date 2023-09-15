package lamda.example;

public class Animal {
    String species;
    boolean canHop;
    boolean canSwim;
    boolean canLayEgg;

    public int getPopulation() {
        return population;
    }

    int population;



    public Animal(String species, boolean canHop, boolean canSwim,boolean canLayEgg,int population) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
        this.canLayEgg = canLayEgg;
        this.population  = population;
    }

    public boolean canHop(){
        return canHop;
    }
    public boolean isCanLayEgg(){
        return canHop;
    }
    public boolean canSwim(){
        return canSwim;
    }
    @Override
    public String toString() {
        return species;
    }

}


