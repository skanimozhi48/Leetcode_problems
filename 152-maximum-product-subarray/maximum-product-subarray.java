class Solution {
    public int maxProduct(int[] nums) {
         int minprod = nums[0];
         int maxprod = nums[0];
         int result = nums[0];
         for(int i =1;i<nums.length;i++) {
           int curr = nums[i];
           if(curr < 0) {
            int temp = minprod;
            minprod = maxprod;
            maxprod=temp;
           }
           maxprod=Math.max(curr, maxprod*curr);
           minprod = Math.min(curr, minprod*curr);
            result = Math.max(result,maxprod);
         }
         return result;
    }
}