package petshop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cat extends Animal implements Classification,Supplies,Calculation {

    private static final Logger logger = LogManager.getLogger(String.valueOf(Cat.class));
    public String breed;
    protected long petid;
    protected int age;
    public char gender;
    private String color;
    final double CAT_PRICE=1350;

    Cat(String species, int count) {
        super(species, count);
    }

    public Cat(String species, int count, String breed, long petid, int age, char gender, String color) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", petid=" + petid +
                ", age=" + age +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                ", catprice=" + CAT_PRICE +
                ", species='" + species + '\'' +
                ", count=" + count +
                '}';
    }

    public void characteristic() {

        logger.info("Cats are good companion for humans and good at hunting household pests");
    }
     public static void vaccination()
    {
        logger.info("Cats are vaccinated");
    }
    public void sound() {
        logger.info("Cat meows");
    }

    public void food() {

        logger.info("Dry foods and sea food sensations ara available for cats");
    }
    public void medicines()
    {
        logger.info("Cat tapeworm dewormer,heartguard and other medicines are available");
    }
    public void accessories()
    {
        logger.info("Cat Litter,litter mat and other accessories are available");

    }
    public void toys()
    {
        logger.info("Cat toys are available");
    }
    public void habitat()
    {
        logger.info("Cat is a domestic pet");
    }
    public double amountofpurchase(int catcount,double CAT_PRICE)
    {
        return catcount*CAT_PRICE;
    }
}
