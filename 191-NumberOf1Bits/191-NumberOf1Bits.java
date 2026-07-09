// Last updated: 09/07/2026, 10:03:40
class Solution {
    public int hammingWeight(int n) {
String bin="";
int count=0;
      while(n>0){
        int digit=n%2;
        bin=digit+bin;
         n= n/2;
      }
      for(int i=0;i<bin.length();i++){
        if(bin.charAt(i)=='1'){
              count++;
        
      }
      }
      return count; 
    }
}