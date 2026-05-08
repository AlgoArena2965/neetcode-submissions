class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int longest = 1;
        int prevSmaller = nums[0];
        int ans = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prevSmaller + 1) {
                longest++;
                prevSmaller = nums[i];
            } 
            else if (nums[i] == prevSmaller) {
                continue;
            } 
            else {
                ans = Math.max(ans, longest);
                longest = 1;
                prevSmaller = nums[i];
            }
        }

        return Math.max(ans, longest);
    }
}
