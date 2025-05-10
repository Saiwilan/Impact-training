import java.util.*;
public class arrsame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
       
       
        int arr1[]=new int[n];
      
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int sum=arr1[0];
        for(int i=1;i<n;i++){
            sum-=arr1[i];
        }
        System.out.println(sum);
       
    }
    
}
