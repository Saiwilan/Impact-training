import java.util.*;
public class digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int small=9;
        int big=0;
        while(num>0){
            int single=num%10;
            if(small>single){
                small=single;
            }
            if(big<single){
                big=single;
            }
            num=num/10;
        }
        System.out.println(big+" "+small);
    }
}
