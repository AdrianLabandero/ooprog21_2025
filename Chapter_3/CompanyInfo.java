class CompanyInfo {
    public static void main(String[] args) {

        displayCompanyName();
        displayHours();
    }

        public static void displayCompanyName(){
            System.out.println("Smart Electronics\n");
            
        }

         public static void displayHours() {
        System.out.println("Business Hours: \n\n"
                            + "Monday - Friday: 8 am to 6 pm\n"
                            + "Saturday: 8 am to noon\n"
                            + "Sunday: Closed\n");
    }
}