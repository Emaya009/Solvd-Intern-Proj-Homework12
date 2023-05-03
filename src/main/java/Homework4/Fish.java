package Homework4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Fish implements Aquaticbehaviour,Calculation {

    private static final Logger logger = LogManager.getLogger(String.valueOf(Fish.class));
        public String breed;
        private String color;
        static double fishprice=4.66;

   public Fish(String breed, String color) {
        this.breed = breed;
        this.color = color;

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return fishprice;
    }

    public void setPrice(double price) {
        this.fishprice = price;
    }

    static void swim()
    {
        logger.info("Fishes swim in the water");
    }

    public final void sustainability()
    {
        logger.info("Fishes survive in salt water");
    }

    public double amountofpurchase(int fishcount,double fishprice)
    {
        return fishcount*fishprice;
    }

}
