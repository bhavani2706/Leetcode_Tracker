// Last updated: 21/08/2026, 14:20:15
1class Solution {
2    public int findLucky(int[] arr) {
3        int lucky=-1;
4        for(int i=0;i<arr.length;i++){
5            int count=0;
6            for(int j=0;j<arr.length;j++){
7                if(arr[i]==arr[j]){
8                    count++;
9                }
10            }
11            if(count==arr[i]){
12                lucky=Math.max(lucky,arr[i]);
13            
14            }
15        }
16        return lucky;
17    }
18}