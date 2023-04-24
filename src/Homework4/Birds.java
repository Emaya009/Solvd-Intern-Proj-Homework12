package Homework4;
   public class Birds implements Classification,Supplies,Calculation {

        public String breed;
        private long petid;
        protected int age;
        public char gender;
        private String color;
        private double birdprice;

       public Birds(String breed, long petid, int age, char gender, String color, double birdprice) {
           this.breed = breed;
           this.petid = petid;
           this.age = age;
           this.gender = gender;
           this.color = color;
           this.birdprice = birdprice;
       }

       public String getBreed() {
           return breed;
       }

       public void setBreed(String breed) {
           this.breed = breed;
       }

       public long getPetid() {
           return petid;
       }

       public void setPetid(long petid) {
           this.petid = petid;
       }

       public int getAge() {
           return age;
       }

       public void setAge(int age) {
           this.age = age;
       }

       public char getGender() {
           return gender;
       }

       public void setGender(char gender) {
           this.gender = gender;
       }

       public String getColor() {
           return color;
       }

       public void setColor(String color) {
           this.color = color;
       }

       public double getBirdprice() {
           return birdprice;
       }

       public void setBirdprice(double birdprice) {
           this.birdprice = birdprice;
       }
       public void characteristic() {

            System.out.println("High power and low weight");
        }

        public void sound() {
            System.out.println("Bird chirps");
        }

        public void food() {

            System.out.println("Fortified Nutrition,wild bird feed and other foods are available for birds");
        }
        public void medicines()
        {
            System.out.println("Bird Ferti-VIT,bird supplements and other medicines are available");
        }
        public void accessories()
        {
            System.out.println("Bird cage,bird feeder and other accessories are available");

        }
        public void toys()
        {
            System.out.println("Bird swing,play stand and other toys are available");
        }
        public void habitat()
        {
            System.out.println("Lives in grassland,forestland,river,stream");
        }
        public double amountofpurchase(int birdcount,double birdprice)
        {
            return birdcount*birdprice;
        }
    }

