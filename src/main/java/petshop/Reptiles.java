package petshop;

//Homework6 Generics
public class Reptiles<T> extends Animal {

    //Homework10 Collection Stream usage
    private T reptilename;
    private T length;
    private T venomous;

    public Reptiles(String species, int count, T reptilename, T length, T venomous) {
        super(species, count);
        this.reptilename = reptilename;
        this.length = length;
        this.venomous = venomous;
    }

    public T getReptilename() {
        return reptilename;
    }

    public void setReptilename(T reptilename) {
        this.reptilename = reptilename;
    }

    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }

    public T getVenomous() {
        return venomous;
    }

    public void setVenomous(T venomous) {
        this.venomous = venomous;
    }

    public String toString()
    {
        return "Reptile details:" + "Reptile Name:" + this.reptilename +"Length:" + this.length +"Venomous: " + this.venomous;

    }
}

