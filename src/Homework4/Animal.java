package Homework4;

   public class Animal  {
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
           System.out.println("Availability of the species entered");
       }

   }
