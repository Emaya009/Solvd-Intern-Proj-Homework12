package Homework3;

public class Medicines extends Supplies {
    private String medicine1;
    private String medicine2;

    public Medicines(String medicine1, String medicine2) {
        this.medicine1 = medicine1;
        this.medicine2 = medicine2;
    }

    public String getMedicine1() {
        return medicine1;
    }

    public void setMedicine1(String medicine1) {
        this.medicine1 = medicine1;
    }

    public String getMedicine2() {
        return medicine2;
    }

    public void setMedicine2(String medicine2) {
        this.medicine2 = medicine2;
    }

    public void supplies()
    {
        System.out.println("Pet supplies abstract method is implemented in this class");
    }
}

