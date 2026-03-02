import java.util.*;
class reverseString{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();
         String rev="";
    for(int i= str.length()-1; i>=0; i--){
            rev+=str.charAt(i);
       } 
       System.out.println(rev);  
    }
}


//enhanced code 

// import java.util.*;

// public class ReverseString {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();
//         char[] arr = str.toCharArray();

//         int left = 0;
//         int right = arr.length - 1;

//         while (left < right) {
//             char temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;

//             left++;
//             right--;
//         }

//         System.out.println(new String(arr));
//     }
// }