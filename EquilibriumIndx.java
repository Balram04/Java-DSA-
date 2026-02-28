public class EquilibriumIndx {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int equilibriumIndex = findEquilibriumIndex(arr);
        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium index found at: " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium index found");
        }
    }

    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        int rightSum = totalSum;
        for (int i = 0; i < arr.length; i++) {
            rightSum -= arr[i]; // Now rightSum is the right sum for index i

            if (leftSum == rightSum) {
                return i; // Equilibrium index found
            }

            leftSum += arr[i]; // Update left sum for the next iteration
        }

        return -1; // No equilibrium index found
    }
}