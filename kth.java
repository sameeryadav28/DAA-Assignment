class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[] count = new int[20001];

        // Count each number
        for (int num : nums) {
            count[num + 10000]++;
        }

        // Traverse from largest to smallest
        for (int i = 20000; i >= 0; i--) {
            if (count[i] >= k) {
                return i - 10000;
            }

            k -= count[i];
        }

        return -1;
    }
}
