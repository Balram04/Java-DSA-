import java.util.*;
public class FreqCount{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int size=sc.nextInt();
        
        int arr[]=new int[size];
        for(int i=0;i<size; i++){
            arr[i]=sc.nextInt();     //[1,2,2,3,4,1,4]
        }
        sc.close();

          boolean visited[]=new boolean[size];  //to keep track of visited elements in the array
        for(int i=0;i<size;i++){
               if(visited[i]){
                continue;           //if the element is already visited, skip it
               } 
            int count =1;
              for(int j=i+1;j<size;j++){
               if(arr[i]==arr[j]){
                count ++;
                visited[j]=true;                 //mark the element as visited
               }
              }
              System.out.println(arr[i] +"count is-->"+count);
        }
    }
}