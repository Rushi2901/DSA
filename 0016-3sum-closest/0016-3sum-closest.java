class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[2];
        int maxDiff = Integer.MAX_VALUE;
        int sum;

        for(int i=0; i<nums.length-2 ; i++){
            int j = nums.length-1;
            int k = i+1;
            while(k < j){
                sum = nums[i]+nums[k]+nums[j];
                if(sum == target){
                    return sum;
                }else if(sum<target){
                    k++;
                    if( Math.abs(sum-target)<maxDiff){
                        maxDiff = Math.abs(sum-target);
                        result = sum;
                    }
                    
                }else if(sum>target){
                    j--;
                    if(Math.abs(sum-target)<maxDiff){
                        maxDiff = Math.abs(sum-target);
                        result = sum;
                    }
                }
            }
        }
        return result;
    }
}