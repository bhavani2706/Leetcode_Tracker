// Last updated: 12/09/2026, 10:32:21
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int rowlen=matrix.length;
4        int collen=matrix[0].length;
5        int row[]=new int[rowlen];
6        int col[]=new  int[collen];
7        for(int i=0;i<rowlen;i++){
8            for(int j=0;j<collen;j++){
9                if(matrix[i][j]==0){
10                   row[i]=1;
11                   col[j]=1; 
12                }
13            }
14        }
15    for(int i=0;i<rowlen;i++){
16            for(int j=0;j<collen;j++){
17                if(row[i]==1 || col[j]==1){
18                   matrix[i][j]=0;
19                }
20            }
21        }
22    return;
23
24    }
25}