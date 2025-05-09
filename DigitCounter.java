import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read n and m
        System.out.print("Enter the number (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter the digit to count (m): ");
        int m = scanner.nextInt();

        int count = 0;
        int num = Math.abs(n); // Handle negative numbers

        while (num > 0) {
            int digit = num % 10;
            if (digit == m) {
                count++;
            }
            num /= 10;
        }

        System.out.println("Digit " + m + " appears " + count + " times in " + n);
        System.out.println("hello sai");
        scanner.close();
    }
}

