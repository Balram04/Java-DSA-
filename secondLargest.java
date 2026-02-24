import java.util.*;
public class secondLargest {
    public static void main(String[]args){
        Scanner sc =new Scanner (System.in);
        int size=sc.nextInt();
        
        int arr[]=new int[size];
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();

        int maxValue=Integer.MIN_VALUE;
        int secondMaxValue=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]>maxValue){
                secondMaxValue=maxValue;
                maxValue=arr[i];
            }
            else if(arr[i]>secondMaxValue && arr[i]!=maxValue){
                secondMaxValue=arr[i];
            }
        }
        System.out.println("Second largest element is: "+secondMaxValue);
    }
}


