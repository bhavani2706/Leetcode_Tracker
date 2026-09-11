// Last updated: 11/09/2026, 16:04:41
1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        List<Integer> row=new ArrayList<>();
4        long num=1;
5        for(int i=0;i<=rowIndex;i++){
6           row.add((int)num);
7           num=num*(rowIndex-i)/(i+1);
8        }
9        return row;
10    }
11}