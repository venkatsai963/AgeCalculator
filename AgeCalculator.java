import java.time.Year;
import java.util.Scanner; 

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        
        int currentYear = Year.now().getValue();

        
        if (birthYear > currentYear) {
            System.out.println("Error: Birth year cannot be in the future.");
        } else {
            int age = currentYear - birthYear;
            System.out.println(" age is: " + age );
        }

        scanner.close();
    }
}