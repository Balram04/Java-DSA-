public class Majority {

    public static void main(String[] args) {

        int[] nums = {3, 2, 3};

        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        // Step 1: Find candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate)
                count++;
            else
                count--;
        }

        // Step 2: Verify candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate)
                count++;
        }

        if (count > nums.length / 2)
            return candidate;

        return -1; // no majority element
    }
}