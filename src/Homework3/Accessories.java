package Homework3;

import java.util.Objects;

    public class Accessories extends Pets {
        protected String accessory1;
        protected String accessory2;

        public Accessories(String accessory1, String accessory2) {
            this.accessory1 = accessory1;
            this.accessory2 = accessory2;
        }

        public Accessories(String petname1, String petname2, String accessory1, String accessory2) {
            super(petname1, petname2);
            this.accessory1 = accessory1;
            this.accessory2 = accessory2;
        }

        public String getAccessory1() {
            return accessory1;
        }

        public void setAccessory1(String accessory1) {
            this.accessory1 = accessory1;
        }

        public String getAccessory2() {
            return accessory2;
        }

        public void setAccessory2(String accessory2) {
            this.accessory2 = accessory2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Accessories that)) return false;
            return Objects.equals(getAccessory1(), that.getAccessory1()) && Objects.equals(getAccessory2(), that.getAccessory2());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getAccessory1(), getAccessory2());
        }
    }
