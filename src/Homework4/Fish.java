package Homework4;
public class Fish implements Aquaticbehaviour,Calculation {

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
        System.out.println("Fishes swim in the water");
    }

    public final void sustainability()
    {
        System.out.println("Fishes survive in salt water");
    }

    public double amountofpurchase(int fishcount,double fishprice)
    {
        return fishcount*fishprice;
    }

}
