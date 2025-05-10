import java.util.Scanner;

public class adam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp= num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;          // Get the last digit
            reversed = reversed * 10 + digit;  // Append it to reversed
            num = num / 10;                // Remove last digit
        }

        System.out.println("Reversed number: " + reversed);
        sc.close();
    }
}
