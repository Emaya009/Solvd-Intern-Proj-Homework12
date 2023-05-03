package Homework3;

public class Daycare extends Pets
{
    private String careone;

    public Daycare(String petname1, String petname2, String careone) {
        super(petname1, petname2);
        this.careone = careone;
    }

    public String getCareone() {
        return careone;
    }

    public void setCareone(String careone) {
        this.careone = careone;
    }
}
