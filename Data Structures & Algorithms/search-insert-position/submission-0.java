class Solution {
    public int searchInsert(int[] nums, int target) {
        return index(nums, target);
    }
    static int index(int[] number,int target){
        int pos = binarySearch(number, target);
        if (pos != -1) return pos;
        for(int i =0;i<number.length;i++){
                if(target<= number[i]){
                    return i;
                }
                

            }
        
        return number.length;
    }
    static int binarySearch(int[] number, int target) {
        int start = 0;
        int end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int middleNum = number[mid];

            if (target == middleNum) {
                return mid;
            }
            if (target < middleNum) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;

    }
}