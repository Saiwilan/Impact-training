import java.util.Scanner;
public class harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int temp=a;
        int sum=0;
        while (a>0){
            int m=a%10;
            sum+=m;
            a=a/10;
        }
        if (temp%sum ==0){
            System.out.println("it is a harshad");
        }else {
            System.out.println("it is not a harshad");
        }
        sc.close();
    }
}
