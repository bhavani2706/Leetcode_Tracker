// Last updated: 09/07/2026, 10:05:08
import java.util.*;
class Solution{
    public double findMedianSortedArrays(int[] nums1,int[] nums2){
        List<Integer> res=new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                res.add(nums1[i]);
                i++;
            }else{
                res.add(nums2[j]);
                j++;
            }
        }
        while(i<nums1.length){
            res.add(nums1[i]);
            i++;
        }
        while(j<nums2.length){
            res.add(nums2[j]);
            j++;
        }
        int total=res.size();
        if(total%2==0){
            return (res.get(total/2-1)+res.get(total/2))/2.0;
        }else{
            return res.get(total/2);
        }
    }
}