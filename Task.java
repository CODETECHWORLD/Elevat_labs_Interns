import java.util.Scanner;

public class Task {

    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
        return a / b;
    }

    public static double modulus(double a, double b) { return a % b; }
    public static double power(double a, double b) { return Math.pow(a, b); }
    public static double squareRoot(double a) { return Math.sqrt(a); }
    public static double cubeRoot(double a) { return Math.cbrt(a); }
    public static double sin(double degrees) { return Math.sin(Math.toRadians(degrees)); }
    public static double cos(double degrees) { return Math.cos(Math.toRadians(degrees)); }
    public static double tan(double degrees) { return Math.tan(Math.toRadians(degrees)); }
    public static double log(double a) { return Math.log10(a); }
    public static double ln(double a) { return Math.log(a); }
    public static double exp(double a) { return Math.exp(a); }
    public static double abs(double a) { return Math.abs(a); }
    public static double percentage(double total, double percent) { return (total * percent) / 100; }

    public static double factorial(int n) {
        if (n < 0) {
            System.out.println("Error: Factorial of negative number not defined!");
            return Double.NaN;
        }
        double fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    // --- Main Program ---
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = 'y'; // ✅ initialize before use

        System.out.println("===== Method-Based Core Java Calculator =====");

        while (choice == 'y') {
            System.out.println("\nChoose an Operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Power (^)");
            System.out.println("7. Square Root (√)");
            System.out.println("8. Cube Root (∛)");
            System.out.println("9. Sin");
            System.out.println("10. Cos");
            System.out.println("11. Tan");
            System.out.println("12. Log (base 10)");
            System.out.println("13. Natural Log (ln)");
            System.out.println("14. Exponential (e^x)");
            System.out.println("15. Factorial (n!)");
            System.out.println("16. Absolute Value (|x|)");
            System.out.println("17. Percentage");
            System.out.println("18. Exit");

            System.out.print("\nEnter your choice: ");
            int op = sc.nextInt();

            double num1, num2, result = 0;

            switch (op) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = add(num1, num2);
                    break;
                case 2:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = subtract(num1, num2);
                    break;
                case 3:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = multiply(num1, num2);
                    break;
                case 4:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = divide(num1, num2);
                    break;
                case 5:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = modulus(num1, num2);
                    break;
                case 6:
                    System.out.print("Enter base and exponent: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = power(num1, num2);
                    break;
                case 7:
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    result = squareRoot(num1);
                    break;
                case 8:
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    result = cubeRoot(num1);
                    break;
                case 9:
                    System.out.print("Enter angle in degrees: ");
                    num1 = sc.nextDouble();
                    result = sin(num1);
                    break;
                case 10:
                    System.out.print("Enter angle in degrees: ");
                    num1 = sc.nextDouble();
                    result = cos(num1);
                    break;
                case 11:
                    System.out.print("Enter angle in degrees: ");
                    num1 = sc.nextDouble();
                    result = tan(num1);
                    break;
                case 12:
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    result = log(num1);
                    break;
                case 13:
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    result = ln(num1);
                    break;
                case 14:
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    result = exp(num1);
                    break;
                case 15:
                    System.out.print("Enter integer: ");
                    int n = sc.nextInt();
                    result = factorial(n);
                    break;
                case 16:
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    result = abs(num1);
                    break;
                case 17:
                    System.out.print("Enter total and percentage: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = percentage(num1, num2);
                    break;
                case 18:
                    System.out.println("Thank you for using the calculator!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
                    continue;
            }

            System.out.println("Result: " + result);
            System.out.print("\nDo you want to continue? (y/n): ");
            choice = sc.next().toLowerCase().charAt(0);
        }

        System.out.println("Thank you for using the calculator!");
        sc.close();
    }
}
