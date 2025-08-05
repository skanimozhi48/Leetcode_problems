class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int num: nums1)
        set1.add(num);
Set<Integer> res = new HashSet<>();
        for(int n:nums2)
        if(set1.contains(n))
        res.add(n);

        int result[] = new int[res.size()];
        int i =0;
        for(int str:res)
        result[i++]=str;
        return result;
    }
}