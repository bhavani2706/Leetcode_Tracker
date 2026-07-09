// Last updated: 09/07/2026, 09:49:15
class Solution {
public void moveZeroes(int[] arr) {
    for( int i=0;i<arr.length-1;i++){
        if(arr[i]==0){
         for( int j=i+1;j<arr.length;j++){
             if(arr[j]!=0){
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             break;
             }
    }
   

        
    }
}
}
}