package Homework4;

public class Cat extends Animal implements Classification,Supplies,Calculation {
    public String breed;
    protected long petid;
    protected float age;
    public char gender;
    private String color;
    final double catprice=1350;

    public Cat(String species, int count, String breed, long petid, float age, char gender, String color) {
        super(species, count);
        this.breed = breed;
        this.petid = petid;
        this.age = age;
        this.gender = gender;
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

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void characteristic() {

        System.out.println("Cats are good companion for humans and good at hunting household pests");
    }
     public static void vaccination()
    {
        System.out.println("Cats are vaccinated");
    }
    public void sound() {
        System.out.println("Cat meows");
    }

    public void food() {

        System.out.println("Dry foods and sea food sensations ara available for cats");
    }
    public void medicines()
    {
        System.out.println("Cat tapeworm dewormer,heartguard and other medicines are available");
    }
    public void accessories()
    {
        System.out.println("Cat Litter,litter mat and other accessories are available");

    }
    public void toys()
    {
        System.out.println("Cat toys are available");
    }
    public void habitat()
    {
        System.out.println("Cat is a domestic pet");
    }
    public double amountofpurchase(int catcount,double catprice)
    {
        return catcount*catprice;
    }
}
