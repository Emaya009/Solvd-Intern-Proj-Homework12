package Homework3;
    public class Food extends Supplies {

        private String dogfood;
        private String birdfood;

        public Food(String dogfood, String birdfood) {
            this.dogfood = dogfood;
            this.birdfood = birdfood;
        }

        public String getDogfood() {
            return dogfood;
        }

        public void setDogfood(String dogfood) {
            this.dogfood = dogfood;
        }

        public String getBirdfood() {
            return birdfood;
        }
        public void setBirdfood(String birdfood) {
            this.birdfood = birdfood;
        }
        public void supplies ()
        {
            System.out.println("Pet food implements pet supplies abstract");
        }



    }
