import java.util.*;
public class MinMax{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("give size of array");
        int N=sc.nextInt();

        int arr[]= new int[N]; //array declaration
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt(); //array intilization
        };

        int maxValue=Integer.MIN_VALUE;
        int minValue=Integer.MAX_VALUE;
    
        for(int i=0;i<N;i++){
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
            if(arr[i]<minValue){
                minValue=arr[i];
            }
        }
     System.out.println("Max value is "+ maxValue);
    System.out.println("min value is "+ minValue);
    }
}