// Last updated: 09/07/2026, 09:49:30
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
          for(int num : nums) {
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }
       return false;
    }
}