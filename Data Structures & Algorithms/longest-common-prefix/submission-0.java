class Solution {
    public String longestCommonPrefix(String[] strs) {
        return Prefix(strs);
    }
    public static String Prefix(String[] pre){
        Arrays.sort(pre);
        String pre1 = pre[0];
        String pre2 = pre[pre.length-1];
        int index = 0;
        while(index < pre1.length()) {
            if(pre1.charAt(index)==pre2.charAt(index) ){
                index++;
            }
            else{
                break;
            }
        }   
        return index == 0?"" :pre1.substring(0,index);
    }
}