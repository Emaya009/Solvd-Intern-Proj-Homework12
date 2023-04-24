package Homework4;

public class Dog extends Animal implements Classification,Supplies,Calculation {

    public String breed;
    protected long petid;
    public char gender;
    private double height;
    private double weight;
    private String color;
    final double dogprice=1500;

    public Dog(String species, int count, String breed, long petid, char gender, double height, double weight, String color) {
        super(species, count);
        this.breed = breed;
        this.petid = petid;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public long getPetid() {
        return petid;
    }

    public void setPetid(long petid) {
        this.petid = petid;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void characteristic() {

        System.out.println("Dogs are friendly in nature,loyal and playful");
    }

    public void sound() {
        System.out.println("Dog Barks");
    }

    public void food() {

        System.out.println("Dog foods are available");
}
public void medicines()
{
    System.out.println("Dog medicines are available");
}
    public void accessories()
    {
        System.out.println("Dog accessories are available");

    }
    public void toys()
    {
        System.out.println("Dog toys are available");
    }

public void habitat() {
    System.out.println("Dog is a domestic animal");
}
public double amountofpurchase(int dogcount,double dogprice)
{
    return dogcount*dogprice;
}
}
