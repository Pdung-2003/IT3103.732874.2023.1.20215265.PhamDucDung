package lab01;
import java.util.Scanner;
public class bai2_2_5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter first number: ");
            String strNum1 = scanner.nextLine();
            double num1 = Double.parseDouble(strNum1);

            System.out.print("Enter second number: ");
            String strNum2 = scanner.nextLine();
            double num2 = Double.parseDouble(strNum2);


            double sum = num1 + num2;
            double difference = num1 - num2;
            double product = num1 * num2;
            double quotient = 0.0;

            //check
            if (num2 != 0) {
                quotient = num1 / num2;
            } else {
                System.out.println("Khong duoc chia cho 0.");
            }

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);

            // Check
            if (num2 != 0) {
                System.out.println("Quotient: " + quotient);
            }
        }
}
