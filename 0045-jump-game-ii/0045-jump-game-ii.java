class Solution {
    public int jump(int[] nums) {
        if(nums.length==1) return 0;
        int coverage=0;
        int lastjump=0;
        int final1=nums.length-1;
        int total=0;
        for(int i=0;i<nums.length;i++){
            coverage=Math.max(coverage,i+nums[i]);
            if(i==lastjump){
                total++;
                lastjump=coverage;
                if(coverage>=final1){
                    return total;
                }
            }
        }
        return total;
    }
}