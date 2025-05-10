import java.util.Scanner;

public class removezeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int place=1;
        while(num>0){
            int n=num%10;
            if(n!=0){
                sum=sum+n*place;
                place=place*10; 
            }
             num=num/10;
        }
        System.out.println(sum);

    }
    
}
