import java.util.Scanner;
public class primepalindromechck {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = isPrime(number);
        boolean isPalindrome = isPalindrome(number);

        if (isPrime && isPalindrome) {
            System.out.println("prime palindrome");
        } else if (isPrime) {
            System.out.println("prime");
        } else if (isPalindrome) {
            System.out.println("palindrome");
        } else {
            System.out.println("neither prime nor palindrome");
        }

        scanner.close();}

    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

   
    public static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return original == reversed;
    }

}
