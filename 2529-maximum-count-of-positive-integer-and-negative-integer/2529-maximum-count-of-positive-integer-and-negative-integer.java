class Solution {
    public int maximumCount(int[] nums) {
        int pc=0;
        int nc=0;
        for(int n:nums){
            if(n>0){
                pc++;
            }
            else if(n<0){
                nc++;
            }
        }
        return Math.max(pc,nc);
    }
}