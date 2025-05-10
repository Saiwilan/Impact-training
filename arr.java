import java.util.*;
public class arr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int array1[]=new int[n];
        int array2[]=new int[m];
        int sum1=0, sum2=0;
        System.out.println("enter array1");
        for(int i=0; i<n;i++){
            array1[i]=sc.nextInt();
            sum1+=array1[i];
        }
        System.out.println("enter array 2");
        for(int i=0;i<m;i++){
            array2[i]=sc.nextInt();
            sum2+=array2[i];
        }
        if(m==n&& sum1==sum2){
            System.out.println("equal arrays");
        }
        else{
            System.out.println("arrays are not equal");
        }
        System.out.println(m+" "+n+" "+sum1+" "+sum2);
    }
    
}
 