// Last updated: 11/09/2026, 13:00:11
1class Solution {
2public void moveZeroes(int[] arr) {
3    int temp[]=new int[arr.length];
4    int index=0;
5    for(int i=0;i<arr.length;i++){
6        if(arr[i]!=0){
7           temp[index++]=arr[i];
8        }
9    }
10    for(int i=0;i<temp.length;i++){
11        arr[i]=temp[i];
12    }
13    
14    return;
15
16}
17}