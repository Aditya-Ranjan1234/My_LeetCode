class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] dp = new int[10000];
        for (int i : nums1) {
            dp[i]++;
        }
        int[] ans = new int[10000];
        int ptr = 0;
        for (int i : nums2) {
            if (dp[i] != 0) 
            {
                dp[i] -= 1;
                ans[ptr] = i;
                ptr++;
            }
        }
        return Arrays.copyOfRange(ans, 0, ptr);
    }
}
