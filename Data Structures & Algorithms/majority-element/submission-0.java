//Moore's Voting Algorithm
//If something appears more than N/2 times it won't get cancelled
class Solution {
    public int majorityElement(int[] nums) {
        int count=0,ele = 0;
        for(int i = 0; i<nums.length; i++){
            if(count==0){
                ele = nums[i];
                count++;
                continue;
            }
            if(nums[i]==ele){
                count++;
            }else{
                count--;
            }
        }
        return ele;
    }
}

