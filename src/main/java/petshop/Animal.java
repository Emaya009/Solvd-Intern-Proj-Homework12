package petshop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Animal  {
    private static final Logger logger = LogManager.getLogger(String.valueOf(Animal.class));
       protected String species;
       protected int count;

       public Animal(String species, int count) {
           this.species = species;
           this.count = count;
       }

       public String getSpecies() {
           return species;
       }

       public void setSpecies(String species) {
           this.species = species;
       }

       public int getCount() {
           return count;
       }

       public void setCount(int count) {
           this.count = count;
       }

       void speciesdetails(String species, int count)
       {

           logger.info("Availability of the species entered " +species +"," +count);
       }

   }
