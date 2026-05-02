class CountDistinct {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        int distinctCount = countDistinct(arr);
        System.out.println("Number of distinct elements: " + distinctCount);
    }

    public static int countDistinct(int[] arr) {
        HashSet<Integer> Set = new HashSet<>();
        for (int num : arr) {
            Set.add(num);
        }
        return Set.size();
    }
}

//approach 2

import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {1,4,5,1,4,6};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : arr){
            if(map.get(num) == 1){
                System.out.print(num + " ");
            }
        }
    }
}

//approach 3

import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 1, 5};

        for(int i = 0; i < arr.length; i++) {
            boolean isUnique = true;

            for(int j = 0; j < arr.length; j++) {
                if(i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            if(isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}