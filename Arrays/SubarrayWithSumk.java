//Subarray with sum = k (Brute Force) tc O(n^2) sc O(1)
class SubarrayWithSumk{
    public static void main(String[] args) {

        int[] nums = {3, 4, -7, 1, 3, 3, 1, -4};
        int target = 7;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j]; 

                if (sum == target) {
                    // Print subarray from i to j
                    for (int k = i; k <= j; k++) {
                        System.out.print(nums[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}

//Longest Subarray with Sum = K (Brute Force) tc O(n^2) sc O(1)
class Main {
    public static void main(String[] args) {

        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4};
        int k = 7;

        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {

                sum += arr[j];

                if (sum == k) {
                    int len = j - i + 1;
                    maxLen = Math.max(maxLen, len);
                }
            }
        }

        System.out.println("Longest length: " + maxLen);
    }
}

//Count Subarrays with Sum = K (Brute Force) tc O(n^2) sc O(1)
class Main {
    public static void main(String[] args) {

        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4};
        int k = 7;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {

                sum += arr[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        System.out.println("Total subarrays: " + count);
    }
}