import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Checking if the number is between 0 and 5
        if (num >= 0 && num <= 5) {
            if (num % 2 == 0) {
                System.out.println("Not Weird.");
            } else {
                System.out.println("Weird.");
            }
        } 
        // Checking if the number is between 6 and 20
        else if (num >= 6 && num <= 20) {
            if (num % 2 == 0) {
                System.out.println("Weird.");
            } else {
                System.out.println("Weird.");
            }
        } 
        // Checking if the number is greater than 20
        else if (num > 20) {
            if (num % 2 == 0) {
                System.out.println("Not Weird.");
            } else {
                System.out.println("Weird.");
            }
        }

        // If none of the above conditions match
        else {
            System.out.println("Invalid input.");
        }

        scanner.close();
    }
}
