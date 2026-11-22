class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        return dupli(nums);
    }
    static boolean dupli(int[] arr){
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                return true;
            }
            
        }
        return false;
    }
}