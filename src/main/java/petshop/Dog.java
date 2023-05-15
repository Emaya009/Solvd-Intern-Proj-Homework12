package petshop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Dog extends Animal implements Classification,Supplies,Calculation,Runnable {

    private static final Logger logger = LogManager.getLogger(String.valueOf(Dog.class));
    public String breed;
    protected long petid;
    public char gender;
    private double height;
    private double weight;
    private String color;
    final double DOG_PRICE=1500;

    public Dog(String species, int count) {
        super(species, count);
    }

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

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", petid=" + petid +
                ", gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", dogprice=" + DOG_PRICE +
                ", species='" + species + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        return getPetid() == dog.getPetid() && getGender() == dog.getGender() && Double.compare(dog.getHeight(), getHeight()) == 0 && Double.compare(dog.getWeight(), getWeight()) == 0 && Double.compare(dog.DOG_PRICE, DOG_PRICE) == 0 && Objects.equals(getBreed(), dog.getBreed()) && Objects.equals(getColor(), dog.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBreed(), getPetid(), getGender(), getHeight(), getWeight(), getColor(), DOG_PRICE);
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
public double amountofpurchase(int dogcount,double DOG_PRICE)
{
    return dogcount*DOG_PRICE;
}

    @Override
    public void run() {

    }
}
