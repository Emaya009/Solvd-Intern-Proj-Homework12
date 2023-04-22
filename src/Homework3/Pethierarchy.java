package Homework3;


public class Pethierarchy
{
    public static void main(String[] args) {

        Pets petdetail=new Pets("Dog","Birds");  //object class method using toString()
        System.out.println("Print pets available in the store" +petdetail);

        Accessories accessoryone = new Accessories("Dog","Birds","Dog Collar","Bird Feeder"); //Object 1
         //using object class equals() and hash code method for objects with same values
        System.out.println("Accessories available: " +accessoryone.accessory1 +"," +accessoryone.accessory2);

        Accessories accessorytwo = new Accessories("Dog","Birds","Dog Chain","Bird Feeder");  //Object 2
        //using object class equals() and hash code method for objects with same values
        System.out.println("Accessories available: " +accessorytwo.accessory1 + "," +accessorytwo.accessory2);
        boolean result = accessoryone.equals(accessorytwo);
        System.out.println("Objects with same values using equals method:" +result);

        //using object class equals() and hash code method for objects with different values
        Toys toyone=new Toys("Dog","Birds","Dog Bone",12.55);
        Toys toytwo=new Toys("Dog","Birds","Dog Bone",13.25);
        System.out.println("Price of toy1 and toy2 are:" +toyone.price +"," +toytwo.price);
        boolean result1=toyone.equals(toytwo);
        System.out.println("Objects with different values using equals method:"+ result1);

        Food food1 = new Food("Dry Dog Food", "Seed treat bell");
        food1.supplies();             //abstract and override method is used
        food1.displaysupplies();
        System.out.println("Pet foods available:" + food1.getDogfood() + "," + food1.getBirdfood());


        Medicines medicine = new Medicines("First AID Kit", "Nexguard Chewables");
        medicine.supplies();           //abstract and override method is used
        medicine.displaysupplies();
        System.out.println("Pet medicines available:" + medicine.getMedicine1() + "," + medicine.getMedicine2());


        Service service= new Service("Dog","Birds","Dog Hair cut", "Bird Clipping");
        System.out.println("Pet services available:" + service.getService1() + "," + service.getService2());

        Daycare care=new Daycare("Dog","Birds","care will be provided");
        System.out.println("For Dogs and Birds pet"+care.getCareone());

        Sale sale=new Sale("Dog","Birds","for sale");
        System.out.println("Dog and Birds are " +sale.getSalepet());

        Customercare customercare=new Customercare("Dog","Birds","765-723-0123","help@petshop.com");
        System.out.println("Petshop contact number and email:"+customercare.contactnum +" and " +customercare.getEmailid());
    }
    }
