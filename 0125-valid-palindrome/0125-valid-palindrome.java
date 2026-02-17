class Solution {
    public boolean isPalindrome(String s) {;
        String s_new="";
        String s_rev="";
        for(int i=0; i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                s_new = s_new + s.charAt(i);
                s_rev = s.charAt(i) + s_rev;
            }
        }
        if(s_new.compareToIgnoreCase(s_rev)==0){
            return true;
        }
        return false;
    }
}