import java.util.*;
public class Revers{
    public static void main(String[]args){
        Scanner sc =new Scanner (System.in);
        int size=sc.nextInt();
        
        int arr[]=new int[size];
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();

    int st=0;
    int end=size-1;

   while(end>st){
    int temp =arr[st];
     arr[st]=arr[end];
     arr[end]=temp;
     st++;
     end--;
   }
   System.out.println("Reversed array is:");
   for(int i=0;i<size;i++){
    System.out.print(arr[i]+" ");
   }
    }
}