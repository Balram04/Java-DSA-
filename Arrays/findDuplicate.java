
import java.util.*;

public class FindDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        int count = 0;

        for(int i = 0; i < size; i++){
            for(int j = i + 1; j < size; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    count++;
                    break;
                }
            }
        }

        System.out.println("Total duplicates: " + count);
    }
}
//by using hashset
import java.util.HashSet;
import java.util.Scanner;
class findDuplicate{
    public static void main(String[]args){
        int array[]={1,2,3,4,5,6,7,8,9,10,1,2};
        HashSet<Integer> set = new HashSet<>();
        for(int num: array){
            if(set.contains(num)){
                System.out.println("Duplicate element found: " + num);
            } else {
                set.add(num);
            }
        }
    }
}