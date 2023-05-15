package petshop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Fish implements Aquaticbehaviour,Calculation {

    private static final Logger logger = LogManager.getLogger(String.valueOf(Fish.class));
        public String breed;
        private String color;
        static double fishprice=4.66;

        private double fishprice1;

    public Fish() {
    }

    public Fish(String breed, String color) {
        this.breed = breed;
        this.color = color;

    }
    public Fish(String breed, String color, double fishprice1) {
        this.breed = breed;
        this.color = color;
        Fish.fishprice = fishprice1;
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

    public double getFishprice1() {
        return fishprice1;
    }

    public void setFishprice1(double fishprice1) {
        this.fishprice1 = fishprice1;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", fishprice1=" + fishprice1 +
                '}';
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
