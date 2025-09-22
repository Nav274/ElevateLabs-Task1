import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;   
        double firstnumber, secondnumber;

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    firstnumber = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    secondnumber = sc.nextDouble();
                    System.out.println("Result = " + add(firstnumber, secondnumber));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    firstnumber = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    secondnumber = sc.nextDouble();
                    System.out.println("Result = " + sub(firstnumber, secondnumber));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    firstnumber = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    secondnumber = sc.nextDouble();
                    System.out.println("Result = " + mul(firstnumber, secondnumber));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    firstnumber = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    secondnumber = sc.nextDouble();
                    if (secondnumber != 0) {
                        System.out.println("Result = " + div(firstnumber, secondnumber));
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;

                case 5:
                    System.out.println("Exited.");
                    break;

                default:
                    System.out.println("Enter correct option!");
            }

        } while (choice != 5);

        sc.close();
    }

  
    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }
}

