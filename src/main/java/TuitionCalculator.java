public class TuitionCalculator {
    public static double calculateTuition(double initialTuition,               double annualIncreaseRate, int years) {
        double tuition = initialTuition;
        for (int i = 0; i < years; i++) {
            tuition += tuition * annualIncreaseRate;
        }
        return tuition;
    }
    public static double calculateTotalCost(double tuition, double annualIncreaseRate) {
        double totalCost = 0;
        for (int i = 0; i < 4; i++) {
        totalCost += tuition;
        tuition += tuition * annualIncreaseRate;
        }
        return totalCost;
    }
  
    public static void main(String[] args) {
        double initialTuition = 10000; 
        double annualIncreaseRate = 0.05; 
       
      double tuitionInTenYears = calculateTuition(initialTuition, annualIncreaseRate, 10);
        System.out.printf("Tuition in ten years: $%.2f%n", tuitionInTenYears);

        double totalCost = calculateTotalCost(tuitionInTenYears, annualIncreaseRate);
        System.out.printf("Total cost of four years' worth of tuition after the tenth year: $%.2f%n", totalCost);
  
    }
}
    
          
          
  