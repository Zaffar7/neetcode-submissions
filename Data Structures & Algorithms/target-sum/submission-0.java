class Solution {
    public int findTargetSumWays(int[] nums, int target) {

        int tot = 0;
        for (int x : nums) tot += x;

        // required checks
        if (Math.abs(target) > tot) return 0;
        if ((target + tot) % 2 != 0) return 0;

        int s = (target + tot) / 2;

        int dp[][] = new int[nums.length + 1][s + 1];

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return f(nums, s, 0, dp);
    }

    int f(int[] nums, int s, int i, int[][] dp) {

        if (s < 0) return 0;

        if (i == nums.length) {
            if (s == 0) return 1;
            else return 0;
        }

        if (dp[i][s] != -1)
            return dp[i][s];

        int take = f(nums, s - nums[i], i + 1, dp);
        int not  = f(nums, s, i + 1, dp);

        return dp[i][s] = take + not;
    }
}
