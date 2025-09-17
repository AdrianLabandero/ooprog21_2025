
public class DemoGrossPay {

     public static void main(String[] args) {
        
        calculateGross(10.0);  
        calculateGross(25.0);  
        calculateGross(37.5);  
    }

    
    public static void calculateGross(double hoursWorked) {
        double HOURLY_RATE = 22.75; 
        double grossPay = hoursWorked * HOURLY_RATE; 
        System.out.printf("%.2f hours at $22.75 per hour is $%.2f\n", hoursWorked, grossPay); 
    }

   
}









