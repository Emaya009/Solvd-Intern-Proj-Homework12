package Homework3;

    public class Customercare extends Pets{

        protected String contactnum;
        private String emailid;

        public Customercare(String petname1, String petname2, String contactnum, String emailid) {
            super(petname1, petname2);
            this.contactnum = contactnum;
            this.emailid = emailid;
        }

        public String getContactnum() {
            return contactnum;
        }

        public void setContactnum(String contactnum) {
            this.contactnum = contactnum;
        }
        public String getEmailid() {
            return emailid;
        }

        public void setEmailid(String emailid) {
            this.emailid = emailid;
        }
    }


