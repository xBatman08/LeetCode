class Solution {
    public int countSubstrings(String s) {
        
        int result = 0;
        for(int i =  0; i< s.length(); i++){
            for(int j = i; j< s.length(); j++){
                if(ispalindrome(s.substring(i,j+1))){
                    result++;
                }
            }
        }
        return result;
    }
    public boolean ispalindrome(String s){
        int left = 0;
        int right = s.length() -1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}