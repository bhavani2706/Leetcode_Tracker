// Last updated: 09/07/2026, 10:04:45

class Solution {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer> x=new ArrayList<>();
        subset(result,x,arr);
        return result;

    }
    public static void subset(List<List<Integer>> result,List<Integer>current,int[]arr){
        if(current.size()==arr.length)
        result.add(new ArrayList<>(current));
        else{
        for(int i=0;i<arr.length;i++){
            if((current.contains(arr[i]))){
                continue;
            }
            current.add(arr[i]);
            subset(result,current,arr);
            current.remove(current.size()-1);
        }
    }
}
}