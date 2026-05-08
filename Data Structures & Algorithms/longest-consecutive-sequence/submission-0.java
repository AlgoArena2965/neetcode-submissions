class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans =0;
        for(int a : nums)
            set.add(a);
        for(int a : set){
            if(!set.contains(a-1)){
                int length=1;
                while(set.contains(a+length))
                    length++;
                ans = Math.max(ans,length);
            }
        }
        return ans;
    }
}
