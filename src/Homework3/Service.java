package Homework3;

public class Service extends Pets
{
    private String service1;
    private String service2;

    public Service(String petname1, String petname2, String service1, String service2) {
        super(petname1, petname2);
        this.service1 = service1;
        this.service2 = service2;
    }

    public String getService1() {
        return service1;
    }
    public void setService1(String service1) {
        this.service1 = service1;
    }

    public String getService2() {
        return service2;
    }

    public void setService2(String service2) {
        this.service2 = service2;
    }
}
