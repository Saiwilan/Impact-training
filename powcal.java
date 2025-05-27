import java.util.*;
public class powcal {
    

    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(power(b, e));
    }


}
