package Homework4;
import java.util.*;

public class Pet extends InvalidPetInputException
{
    public Pet(String msg) {
        super(msg);
    }
     public static void main(String[] args)  {
     //Homework 6 adding collections
         List<String> speciestype = new ArrayList<>();
         speciestype.add("Dog");
         speciestype.add("Cat");
         speciestype.add("Fish");
         speciestype.add("Birds");
         speciestype.add("Reptiles");
        for(String speciestypes:speciestype) {
            System.out.println("Pets available in the store are:" +speciestypes);
        }

        for(int i=0;i<5;i++)
        {

            System.out.println("Enter the type of pet to know its details and availability");
            Scanner pettypeinput = new Scanner(System.in);
            String pettype = pettypeinput.next();

            switch (pettype) {
                case "Dog" -> {
                    //Homework6 collections
                    ArrayList<Dog> dogDetails=new ArrayList<>();
                    Dog dog = new Dog("Dog", 10, "Yorkshire", 213, 'M', 6, 7, "Grey");
                    Dog dog1=new Dog("Dog",5,"Doberman",314,'F',28,99,"Black");
                    Dog dog2=new Dog("Dog",4,"Pitbull",263,'M',21,60,"Brown");
                    dogDetails.add(dog);
                    dogDetails.add(dog1);
                    dogDetails.add(dog2);;
                    System.out.println("Dog1 details: " + dog.species + "," + dog.count + "," + dog.breed + "," + dog.petid + "," + dog.gender + "," + dog.getHeight() + "," + dog.getWeight() + "," + dog.getColor());
                    System.out.println("Dog2 details: " + dog1.species + "," + dog1.count + "," + dog1.breed + "," + dog1.petid + "," + dog1.gender + "," + dog1.getHeight() + "," + dog1.getWeight() + "," + dog1.getColor());
                    System.out.println("Dog3 details: " + dog2.species + "," + dog2.count + "," + dog2.breed + "," + dog2.petid + "," + dog2.gender + "," + dog2.getHeight() + "," + dog2.getWeight() + "," + dog2.getColor());
                    dog.habitat();
                    dog.characteristic();
                    dog.sound();
                    dog.food();
                    dog.medicines();
                    dog.accessories();
                    dog.toys();
                    
                    System.out.println("Enter the dog count you need to purchase");
                    Scanner countinput = new Scanner(System.in);
                    int dogcount = countinput.nextInt();
                    System.out.println("Purchase amount: $" + dog.amountofpurchase(dogcount, dog.dogprice));
                }
                case "Cat" -> {
                    //Homework6 collections
                    ArrayList<Cat> catDetails=new ArrayList<>();
                    Cat cat = new Cat("Cat", 5, "Bengal Cat", 302, 2, 'F', "White");
                    Cat cat1 = new Cat("Cat", 6, "Abyssinian Cat", 332, 1, 'M', "brown");
                    Cat cat2 = new Cat("Cat", 3, "American Bobtail Cat", 343, 1, 'F', "orange");
                    catDetails.add(cat);
                    catDetails.add(cat1);
                    catDetails.add(cat2);
                    System.out.println("Cat details: " + cat.species + "," + cat.count + "," + cat.breed + "," + cat.petid + "," + cat.age + "," + cat.gender + "," + cat.getColor());
                    System.out.println("Cat1 details: " + cat1.species + "," + cat1.count + "," + cat1.breed + "," + cat1.petid + "," + cat1.age + "," + cat1.gender + "," + cat1.getColor());
                    System.out.println("Cat2 details: " + cat2.species + "," + cat2.count + "," + cat2.breed + "," + cat2.petid + "," + cat2.age + "," + cat2.gender + "," + cat2.getColor());
                    Cat.vaccination();
                    cat.habitat();
                    cat.characteristic();
                    cat.sound();
                    cat.food();
                    cat.medicines();
                    cat.accessories();
                    cat.toys();
                    System.out.println("Enter the cat count you need to purchase");
                    Scanner catcountinput = new Scanner(System.in);
                    int catcount = catcountinput.nextInt();
                    System.out.println("Purchase amount: $" + cat.amountofpurchase(catcount, 980.55));
                }
                case "Birds" -> {

                    //Homework6 collections
                    ArrayList<Birds> birdDetails=new ArrayList<>();
                    Birds bird = new Birds("Parakeet", 114, 1, 'F', "yellow", 18.50);
                    Birds bird1 = new Birds("Parakeet", 104, 2, 'M', "Blue", 18.50);
                    Birds bird2 = new Birds("Love birds", 124, 1, 'F', "Green", 15.50);
                    birdDetails.add(bird);
                    birdDetails.add(bird1);
                    birdDetails.add(bird2);
                    System.out.println("Bird details: " + bird.breed + "," + bird.getPetid() + "," + bird.age + "," + bird.gender + "," + bird.getColor() + "," + bird.getBirdprice());
                    System.out.println("Bird details: " + bird1.breed + "," + bird1.getPetid() + "," + bird1.age + "," + bird1.gender + "," + bird1.getColor() + "," + bird1.getBirdprice());
                    System.out.println("Bird details: " + bird2.breed + "," + bird2.getPetid() + "," + bird2.age + "," + bird2.gender + "," + bird2.getColor() + "," + bird2.getBirdprice());
                    bird.habitat();
                    bird.characteristic();
                    bird.sound();
                    bird.food();
                    bird.medicines();
                    bird.accessories();
                    bird.toys();
                    System.out.println("Enter the bird count you need to purchase");
                    Scanner birdcountinput = new Scanner(System.in);
                    int birdcount = birdcountinput.nextInt();
                    System.out.println("Purchase amount: $" + bird.amountofpurchase(birdcount, 18.50));
                }
                case "Fish" -> {

                    //Homework6 collections
                    ArrayList<Fish> fishDetails=new ArrayList<>();
                    Fish fish = new Fish("Golden Fish", "Golden Yellow");
                    Fish fish1 = new Fish("Zebra Fish", "Black and White");
                    fishDetails.add(fish);
                    fishDetails.add(fish1);
                    System.out.println("Fish details: " + fish.breed + "," + fish.getColor());
                    System.out.println("Fish details: " + fish1.breed + "," + fish1.getColor());
                    Aquaticbehaviour.swim();
                    fish.sustainability();
                    System.out.println("Enter the fish count you need to purchase");
                    Scanner fishcountinput = new Scanner(System.in);
                    int fishcount = fishcountinput.nextInt();
                    System.out.println("Purchase amount: $" + fish.amountofpurchase(fishcount, 4.66));
                }
                case "Reptiles" -> {
                    // Homework6 Generics implementation
                    Reptiles<String> reptilenames1 = new Reptiles<>("Snake");
                    reptilenames1.setReptilename("Rattlesnake");
                    Reptiles<String> reptilenames2 = new Reptiles<>("Snake");
                    reptilenames2.setReptilename("Corn snake");
                    Reptiles<String> reptilenames3 = new Reptiles<>("Lizard Family");
                    reptilenames3.setReptilename("Cameleon");
                    System.out.println("Reptiles available: "+reptilenames1.getReptilename() +"," +reptilenames2.getReptilename() +"," +reptilenames3.getReptilename());
                }
                default -> {
                    System.out.println("Pet not available");
                    try {
                        throw new InvalidPetInputException("Invalid pet input pls enter a valid pettype: Dog/Cat/Birds/Fish/Snake");
                    } catch (InvalidPetInputException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
    }

    }
     }

