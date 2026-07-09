// Last updated: 09/07/2026, 09:48:34
class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i:candyType){
            set.add(i);
            if(set.size()>=n/2){
                return n/2;
            }
           
        }  return set.size();
    }
}