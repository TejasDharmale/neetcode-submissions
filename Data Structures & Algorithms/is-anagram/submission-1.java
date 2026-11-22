class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){ // this is because we have to return the smae the length that other string has
            return false;
        }
        char[] tArr = t.toCharArray();
        char[] sArr = s.toCharArray();
        Arrays.sort(tArr);
        Arrays. sort(sArr);

        for(int i =0;i<s.length();i++){
                if(sArr[i]!=tArr[i]){
                    return false;
                }
                
        }
        return true;
    }
}
