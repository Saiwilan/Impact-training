import java.util.*;
public class sumofevnodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int oddsum=0;
        int evensum=0;
        while(num>0){
            int n=num%10;
            if(n%2!=0){
                oddsum=oddsum+n;
            }
            else{
                evensum=evensum+n;
            }
            num=num/10;
        }
        System.out.println(oddsum+" "+evensum);

    }
    
}
