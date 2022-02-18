import java.util.Scanner;

public class averageCalculator extends Main {
    public static void Average (String[] args) {
        Scanner myObj = new Scanner(System.in);
        int run = 0;

        do {
            double result = 0;

            System.out.println("Enter your 3 totals");
            double x = myObj.nextDouble();
            double y = myObj.nextDouble();
            double z = myObj.nextDouble();

            result = (x + y + z) / 3;
            System.out.println(result);

            System.out.println("Do you want to run the program again? ");
            run = myObj.nextInt();
        }
        while (run != 0);
        if (run == 0) {
            System.out.println("Thank you, please start the program again to calculate AVG!");
        }
    }
}