import java.util.*;
class InterSection{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          String L1=sc.nextLine();
          String L2=sc.nextLine();

           String part1[]=L1.split(" ");
           String part2[]=L2.split(" ");
           int arr1[]=new int [part1.length];
           int arr2[]=new int [part2.length];

          for(int i=0;i<part1.length;i++){
             arr1[i]=Integer.parseInt(part1[i]);
          }
          for(int j=0;j<part2.length;j++){
             arr2[j]=Integer.parseInt(part2[j]);
          }
          
          HashSet<Integer>set=new HashSet<>();
          HashSet<Integer>result=new HashSet<>();
          for(int x:arr1){
            set.add(x);
          }
          for(int x:arr2){
              if(set.contains(x)){
                result.add(x);
              }
          }
           System.out.println(result);
    }
}