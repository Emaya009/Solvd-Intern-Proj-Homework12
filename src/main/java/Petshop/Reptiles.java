package Petshop;

//Homework6 Generics
public class Reptiles<T> {

    //Homework6 Generics implementation
    private T reptilename;

    public Reptiles(T reptilename) {
        this.reptilename = reptilename;
    }

    public T getReptilename() {
        return reptilename;
    }

    public void setReptilename(T reptilename) {
        this.reptilename = reptilename;
    }
}

