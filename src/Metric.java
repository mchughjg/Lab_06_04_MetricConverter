import java.util.Scanner;

public class Metric {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double m;
        System.out.print("Please enter the measurement in meters: ");
        m = scanner.nextDouble();

        if(m < 0)
            System.out.println("Error: Input needs to be a positive number");
        else
        {
            System.out.printf("The measurement in meters: %.2f Miles\n",(0.000621371*m));
            System.out.printf("The measurement in meters: %.2f Feet\n",(3.28084*m));
            System.out.printf("The measurement in meters: %.2f Inches\n",(39.3701*m));

        }
    }
}
