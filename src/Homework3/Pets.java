
    package Homework3;

    public class Pets  {

        protected String petname1;
        protected String petname2;

        public Pets() {
        }

        public Pets(String petname1,String petname2) {
            this.petname1 = petname1;
            this.petname2 = petname2;
        }

        public String getPetname1() {
            return petname1;
        }

        public void setPetname1(String petname1) {
            this.petname1 = petname1;
        }

        public String getPetname2() {
            return petname2;
        }

        public void setPetname2(String petname2) {
            this.petname2 = petname2;
        }

        @Override
        public String toString() {
            return "Pets{" +
                    "petname1='" + petname1 + '\'' +
                    ", petname2='" + petname2 + '\'' +
                    '}';
        }
    }



