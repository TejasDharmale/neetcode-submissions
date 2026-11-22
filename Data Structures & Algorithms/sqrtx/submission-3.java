class Solution {
    public int mySqrt(int x) {
        return binary(x);
    }
    static int binary(int n) {
        int start = 0;
        int end = n;
        int ans =0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;
            if (square == n) {
                return mid;

            }
            if (square > n) {
                
                end = mid - 1;

            } else {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
}