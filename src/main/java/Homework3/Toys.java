package Homework3;

import java.util.Objects;

public class Toys extends Accessories
{
    private String toy1;
    protected double price;

    public Toys(String petname1, String petname2, String toy1, double price) {
        super(petname1, petname2);
        this.toy1 = toy1;
        this.price = price;
    }

    public String getToy1() {
        return toy1;
    }

    public void setToy1(String toy1) {
        this.toy1 = toy1;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Toys pettoys)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(pettoys.price, price) == 0 && Objects.equals(getToy1(), pettoys.getToy1());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getToy1(), price);
    }
}
