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