package petshop;

public enum Newpets {

    RABBIT("Rabbit",60.45),
    GUINEAPIG("GUINEA PIG",43.22),
    HAMSTER("Hamster",38.50),
    MOUSE("Mouse",23.00);
    private final String name;
    private final double price;
    Newpets(String name,double price)
    {
        this.name=name;
        this.price=price;
    }
    public String getname()
    {
        return name;
    }
    public double getprice()
    {
        return price;

    }
public String toString()
{
    return name +",$" + price;
}
}
