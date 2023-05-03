package Homework4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dog extends Animal implements Classification,Supplies,Calculation {

    private static final Logger logger = LogManager.getLogger(String.valueOf(Dog.class));
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

       logger.info("Dogs are friendly in nature,loyal and playful");
    }

    public void sound() {
        logger.info("Dog Barks");
    }

    public void food() {

        logger.info("Dog foods are available");
}
public void medicines()
{
    logger.info("Dog medicines are available");
}
    public void accessories()
    {
        logger.info("Dog accessories are available");

    }
    public void toys()
    {
        logger.info("Dog toys are available");
    }

public void habitat() {
    logger.info("Dog is a domestic animal");
}
public double amountofpurchase(int dogcount,double dogprice)
{
    return dogcount*dogprice;
}
}
