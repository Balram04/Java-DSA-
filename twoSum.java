// public class twoSum {
//     public static void main(String[] args) {
//         int[] arr = {2, 4, 6, 8};
//         int target = 10;

//         boolean found = false;

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] + arr[j] == target) {
//                     System.out.println("Pair exists -> (" + arr[i] + ", " + arr[j] + ")");
//                     found = true;
//                     break;  // remove if you want all pairs
//                 }
//             }
//             if (found) break;
//         }

//         if (!found) {
//             System.out.println("No pair found");
//         }
//     }
// }  tc: o(n^2) sc: o(1)

// Optimized version using HashSet o(n)tc and space o(n)
import java.util.HashSet;

public class t {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int target = 10;

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            int need = target - x;
            if (set.contains(need)) {
                System.out.println("Pair exists -> (" + need + ", " + x + ")");
                return;
            }
            set.add(x);
        }

        System.out.println("No pair found");
    }
}