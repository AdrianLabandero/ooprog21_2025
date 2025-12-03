import java.util.Scanner;

public class ForexExchangeSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] currencies = {"USD", "EUR", "JPY", "GBP", "AUD"};
        double[][] rates = new double[5][5];

        System.out.println(" FOREX EXCHANGE SYSTEM ");
        System.out.println("Enter the exchange rates against Philippine Peso.\n");

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter rates for " + currencies[i] + ":");
            for (int day = 0; day < 5; day++) {
                System.out.print("Day " + (day + 1) + ": ");
                rates[i][day] = sc.nextDouble();
            }
            System.out.println();
        }

        
        System.out.println("\n FIGURE 1: EXCHANGE RATE ");
        System.out.println("            Day1    Day2    Day3    Day4    Day5");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%-8s", currencies[i]);
            for (int day = 0; day < 5; day++) {
                System.out.printf("%8.2f", rates[i][day]);
            }
            System.out.println();
        }

        
        System.out.println("\n FIGURE 2: DETAILED FOREX REPORT \n");

        for (int i = 0; i < 5; i++) {

            System.out.println("Currency: " + currencies[i]);
            System.out.print("Rates: ");

            for (int day = 0; day < 5; day++) {
                System.out.print(rates[i][day] + "  ");
            }

            
            double peak = rates[i][0];
            double lowest = rates[i][0];

            for (int day = 1; day < 5; day++) {
                if (rates[i][day] > peak)
                    peak = rates[i][day];
                if (rates[i][day] < lowest)
                    lowest = rates[i][day];
            }

            System.out.println("\nPeak Rate: " + peak);
            System.out.println("Lowest Rate: " + lowest);

            
            
            System.out.println("Daily Changes:");


            System.out.println("Day 1: " + rates[i][0]);

            for (int day = 1; day < 5; day++) {

            double diff = rates[i][day] - rates[i][day - 1];

            if (diff > 0) {
            System.out.println("Day " + (day + 1) + ": Increased by +" + diff);
            } else if (diff < 0) {
            System.out.println("Day " + (day + 1) + ": Decreased by " + diff);
            } else {
             System.out.println("Day " + (day + 1) + ": No Change");
        }
     }


            System.out.println("--------------------------------------\n");
        }

        sc.close();
    }
}



