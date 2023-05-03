package Petshop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Pet {
    private static final Logger logger = LogManager.getLogger(String.valueOf(Pet.class));

    //Homework9 Enum - variable declartion
    Petnames petname;

    //Homework9 Enum constructor
    public Pet(Petnames petname) {
        this.petname = petname;
    }

    //Homework9 method created for custom Enum class Petnames usage
    public void printdetails() {
        switch (petname) {
            case DOG -> logger.info("Enum:Are you looking for the details of the pet animal dog");
            case CAT -> logger.info("Enum:Are you looking for the details of the pet animal cat");
            case BIRDS -> logger.info("Enum:Are you looking for the details of the pet birds");
            case FISH -> logger.info("Enum:Are you looking for the details of the pet fish");
            case REPTILES -> logger.info("Enum:Are you looking for the details of the pet reptile");
        }
    }

    public static void main(String[] args) {

        //Homework 9 Supplier built in functional interface usage in lambda expression
        List<String> petName = Arrays.asList("Dog", "Cat", "Fish", "Birds", "Reptiles");
        List<String> petNames =new ArrayList<>(petName);
        Supplier<ArrayList<String>> supplier=()-> (ArrayList<String>) petNames;
        ArrayList<String> result=supplier.get();
        for(String speciestypes:result)
        {
            logger.info(speciestypes);
        }

            //Homework9 custom Enum class Petnames used for object creation and printing
            Pet petdog = new Pet(Petnames.DOG);
            petdog.printdetails();
            Pet petcat = new Pet(Petnames.CAT);
            petcat.printdetails();
            Pet petbird = new Pet(Petnames.BIRDS);
            petbird.printdetails();
            Pet petfish = new Pet(Petnames.FISH);
            petfish.printdetails();
            Pet petreptile = new Pet(Petnames.REPTILES);
            petreptile.printdetails();

            for (int i = 0; i < 5; i++) {

                logger.info("Enter the type of pet to know its details and availability");
                Scanner pettypeinput = new Scanner(System.in);
                String pettypevalue = pettypeinput.next();
                String pettype = pettypevalue.toLowerCase();

                switch (pettype) {
                    case "dog" -> {
                        //Homework6 collections
                        ArrayList<Dog> dogDetails = new ArrayList<>();
                        Dog dog1 = new Dog("Dog", 10, "Yorkshire", 213, 'M', 6, 7, "Grey");
                        Dog dog2 = new Dog("Dog", 5, "Doberman", 314, 'F', 28, 99, "Black");
                        Dog dog3 = new Dog("Dog", 4, "Pitbull", 263, 'M', 21, 60, "Brown");
                        dogDetails.add(dog1);
                        dogDetails.add(dog2);
                        dogDetails.add(dog3);
                        logger.info("Dog1 details: " + dog1.species + "," + dog1.count + "," + dog1.breed + "," + dog1.petid + "," + dog1.gender + "," + dog1.getHeight() + "," + dog1.getWeight() + "," + dog1.getColor());
                        logger.info("Dog2 details: " + dog2.species + "," + dog2.count + "," + dog2.breed + "," + dog2.petid + "," + dog2.gender + "," + dog2.getHeight() + "," + dog2.getWeight() + "," + dog2.getColor());
                        logger.info("Dog3 details: " + dog3.species + "," + dog3.count + "," + dog3.breed + "," + dog3.petid + "," + dog3.gender + "," + dog3.getHeight() + "," + dog3.getWeight() + "," + dog3.getColor());
                        dog1.habitat();
                        dog1.characteristic();
                        dog1.sound();
                        dog1.food();
                        dog1.medicines();
                        dog1.accessories();
                        dog1.toys();
                        logger.info("Enter the dog count you need to purchase");
                        Scanner countinput = new Scanner(System.in);
                        int dogcount = countinput.nextInt();
                        logger.debug("Purchase amount: $" + dog1.amountofpurchase(dogcount, dog1.dogprice));
                        //Homework9 Enum class mammals methods() usage
                        Mammals rodent1 = Mammals.DOG;
                        logger.info(rodent1.rodents());
                        logger.info(rodent1.sense());

                        //Homework9 Predicate Built In Functional interface and its methods usage in lambda expression
                        Predicate<String> breedlength1 = b -> b.length() > 10;
                        Predicate<String> breedlength2 = b -> b.length() < 15;
                        logger.info(breedlength1.and(breedlength2).test(dog1.breed));
                    }
                    case "cat" -> {
                        //Homework6 collections
                        ArrayList<Cat> catDetails = new ArrayList<>();
                        Cat cat1 = new Cat("Cat", 5, "Bengal Cat", 302, 2, 'F', "White");
                        Cat cat2 = new Cat("Cat", 6, "Abyssinian Cat", 332, 1, 'M', "brown");
                        Cat cat3 = new Cat("Cat", 3, "American Bobtail Cat", 343, 1, 'F', "orange");
                        catDetails.add(cat1);
                        catDetails.add(cat2);
                        catDetails.add(cat3);
                        logger.info("Cat details: " + cat1.species + "," + cat1.count + "," + cat1.breed + "," + cat1.petid + "," + cat1.age + "," + cat1.gender + "," + cat1.getColor());
                        logger.info("Cat1 details: " + cat2.species + "," + cat2.count + "," + cat2.breed + "," + cat2.petid + "," + cat2.age + "," + cat2.gender + "," + cat2.getColor());
                        logger.info("Cat2 details: " + cat3.species + "," + cat3.count + "," + cat3.breed + "," + cat3.petid + "," + cat3.age + "," + cat3.gender + "," + cat3.getColor());
                        Cat.vaccination();
                        cat1.habitat();
                        cat1.characteristic();
                        cat1.sound();
                        cat1.food();
                        cat1.medicines();
                        cat1.accessories();
                        cat1.toys();
                        logger.info("Enter the cat count you need to purchase");
                        Scanner catcountinput = new Scanner(System.in);
                        int catcount = catcountinput.nextInt();
                        logger.debug("Purchase amount: $" + cat1.amountofpurchase(catcount, 980.55));
                        //Homework9 Enum class mammals methods() usage
                        Mammals rodent2 = Mammals.CAT;
                        logger.info(rodent2.rodents());
                        logger.info(rodent2.sense());

                        //Homework9 Function Built In Functional interface and its methods usage in lambda expression
                        Function<Integer, Integer> add = f -> f + f;
                        Function<Integer, Integer> cube = f -> f * f * f;
                        logger.info(add.andThen(cube).apply(cat2.count));
                        logger.info(cube.compose(add).apply(cat1.count));

                    }
                    case "birds" -> {

                        //Homework6 collections
                        ArrayList<Birds> birdDetails = new ArrayList<>();
                        Birds bird1 = new Birds("Parakeet", 114, 1, 'F', "yellow", 18.50);
                        Birds bird2 = new Birds("Parakeet", 104, 2, 'M', "Blue", 18.50);
                        Birds bird3 = new Birds("Love birds", 124, 1, 'F', "Green", 15.50);
                        birdDetails.add(bird1);
                        birdDetails.add(bird2);
                        birdDetails.add(bird3);
                        logger.info("Bird details: " + bird1.breed + "," + bird1.getPetid() + "," + bird1.age + "," + bird1.gender + "," + bird1.getColor() + "," + bird1.getBirdprice());
                        logger.info("Bird details: " + bird2.breed + "," + bird2.getPetid() + "," + bird2.age + "," + bird2.gender + "," + bird2.getColor() + "," + bird2.getBirdprice());
                        logger.info("Bird details: " + bird3.breed + "," + bird3.getPetid() + "," + bird3.age + "," + bird3.gender + "," + bird3.getColor() + "," + bird3.getBirdprice());
                        bird1.habitat();
                        bird1.characteristic();
                        bird1.sound();
                        bird1.food();
                        bird1.medicines();
                        bird1.accessories();
                        bird1.toys();
                        logger.info("Enter the bird count you need to purchase");
                        Scanner birdcountinput = new Scanner(System.in);
                        int birdcount = birdcountinput.nextInt();

                        //Homework9 Custom Lambda Expression with Functional Interface Calculation
                        Calculation totalcost = (int birdcount1, double birdprice) -> birdcount1 * birdprice;
                        logger.info("Amount of purchase:$" + totalcost.amountofpurchase(birdcount,bird1.getBirdprice()));

                        //Homework9 Consumer Built In Functional interface and its methods usage in lambda expression
                        Consumer<Integer> square = s -> logger.info(s * s);
                        Consumer<Integer> even = s -> logger.info(s % 2 == 0);
                        even.andThen(square).accept(bird1.age);
                        square.andThen(even).accept(bird2.age);
                    }
                    case "fish" -> {

                        //Homework6 collections
                        ArrayList<Fish> fishDetails = new ArrayList<>();
                        Fish fish1 = new Fish("Golden Fish", "Golden Yellow");
                        Fish fish2 = new Fish("Zebra Fish", "Black and White");
                        fishDetails.add(fish1);
                        fishDetails.add(fish2);
                        logger.info("Fish details: " + fish1.breed + "," + fish1.getColor());
                        logger.info("Fish details: " + fish2.breed + "," + fish2.getColor());
                        Aquaticbehaviour.swim();
                        fish1.sustainability();
                        logger.info("Enter the fish count you need to purchase");
                        Scanner fishcountinput = new Scanner(System.in);
                        int fishcount = fishcountinput.nextInt();
                        logger.debug("Purchase amount: $" + fish1.amountofpurchase(fishcount, 4.66));

                        //Homework9 Predicate Built In Functional interface and its methods usage in lambda expression
                        Predicate<String> colour = c -> c!=null;
                        Predicate<String> colour1 = c -> c.length()<5;
                        logger.info(colour.or(colour1).test(fish1.getColor()));

                    }
                    case "reptiles" -> {
                        // Homework6 Generics implementation
                        Reptiles<String> reptilenames1 = new Reptiles<>("Snake");
                        reptilenames1.setReptilename("Rattlesnake");
                        Reptiles<String> reptilenames2 = new Reptiles<>("Snake");
                        reptilenames2.setReptilename("Corn snake");
                        Reptiles<String> reptilenames3 = new Reptiles<>("Lizard Family");
                        reptilenames3.setReptilename("Cameleon");
                        logger.info("Reptiles available: " + reptilenames1.getReptilename() + "," + reptilenames2.getReptilename() + "," + reptilenames3.getReptilename());

                    }
                    default -> {
                        logger.info("Pet not available");
                        try {
                            throw new InvalidPetInputException("Invalid pet input pls enter a valid pettype: Dog/Cat/Birds/Fish/Snake");
                        } catch (InvalidPetInputException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
           //Homework9 custom Enum class Newpets with lambda expression
            Newpets newpet1=Newpets.RABBIT;
            logger.info("You have selected a " +newpet1.getname() +" for " +newpet1.getprice());
            logger.info("Enter the Rabbit count you need to purchase");
            Scanner rabbitcountinput = new Scanner(System.in);
            int rabbitcount = rabbitcountinput.nextInt();
           //Homework9 custom Enum class calculation usage with lambda expression
           Calculation totalcost1 = (int rabbitcount1, double rabbitprice) -> rabbitcount1 * rabbitprice;
           logger.info("Amount of purchase:$" + totalcost1.amountofpurchase(rabbitcount, newpet1.getprice()));
          //Homework9 Enum class mammals methods() usage
            Mammals rodent3 = Mammals.RABBIT;
            logger.info(rodent3.rodents());
            logger.info(rodent3.sense());

        //Homework9 custom Enum class Newpets with lambda expression
           Newpets newpet2=Newpets.GUINEAPIG;
           logger.info("You have selected a " +newpet2.getname() +" for " +newpet2.getprice());
           logger.info("Enter the Guineapig count you need to purchase");
           Scanner guineapigcountinput = new Scanner(System.in);
           int guineapigcount = guineapigcountinput.nextInt();
        //Homework9 custom Enum class calculation usage with lambda expression
          Calculation totalcost2 = (int guineapigcount1, double guineapigprice) -> guineapigcount1 * guineapigprice;
          logger.info("Amount of purchase:$" + totalcost2.amountofpurchase(guineapigcount, newpet2.getprice()));
        //Homework9 Enum class mammals methods() usage
          Mammals rodent4 = Mammals.RABBIT;
          logger.info(rodent4.rodents());
          logger.info(rodent4.sense());

          //Homework9 custom Enum class Newpets with lambda expression
          Newpets newpet3=Newpets.HAMSTER;
          logger.info("You have selected a " +newpet3.getname() +" for " +newpet3.getprice());
          logger.info("Enter the Hamster count you need to purchase");
          Scanner hamstercountinput = new Scanner(System.in);
          int hamstercount = hamstercountinput.nextInt();
          //Homework9 custom Enum class calculation usage with lambda expression
          Calculation totalcost3 = (int hamstercount1, double hamsterprice) -> hamstercount1 * hamsterprice;
          logger.info("Amount of purchase:$" + totalcost3.amountofpurchase(hamstercount, newpet3.getprice()));
          //Homework9 Enum class mammals methods() usage
          Mammals rodent5 = Mammals.HAMSTER;
          logger.info(rodent5.rodents());
          logger.info(rodent5.sense());

          //Homework9 custom Enum class Newpets with lambda expression
          Newpets newpet4=Newpets.MOUSE;
          logger.info("You have selected a " +newpet4.getname() +" for " +newpet4.getprice());
          logger.info("Enter the Mouse count you need to purchase");
          Scanner mousecountinput = new Scanner(System.in);
          int mousecount = mousecountinput.nextInt();
          //Homework9 custom Enum class calculation usage with lambda expression
          Calculation totalcost4 = (int mousecount1, double mouseprice) -> mousecount1 * mouseprice;
          logger.info("Amount of purchase:$" + totalcost4.amountofpurchase(mousecount, newpet4.getprice()));
          //Homework9 Enum class mammals methods() usage
           Mammals rodent6 = Mammals.MOUSE;
           logger.info(rodent6.rodents());
           logger.info(rodent6.sense());
    }
    }


