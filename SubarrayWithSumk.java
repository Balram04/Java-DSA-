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