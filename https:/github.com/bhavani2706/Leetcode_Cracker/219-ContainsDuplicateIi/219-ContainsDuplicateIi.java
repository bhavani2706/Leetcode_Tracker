// Last updated: 09/07/2026, 09:49:28
class Solution {
public boolean containsNearbyDuplicate(int[] nums, int k) {
    int start=0;
    int end=0;
    Set<Integer> set=new HashSet<Integer>();
    while(end <nums.length){
        if(set.contains(nums[end]))
        return true;
        set.add(nums[end]);
        if(end - start >= k)
        {
            set.remove(nums[start]);
            start++;
        }
        end++;
}
 return false;       
    }
}