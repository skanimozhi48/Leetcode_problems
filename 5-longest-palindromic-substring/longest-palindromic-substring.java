class Solution {
    public String longestPalindrome(String s) {
        String sub="";
        String longestsub="";
        for(int i =0;i<=s.length()-1;i++) {
            for(int j = i+1;j<=s.length();j++) {
                sub = s.substring(i,j);
                boolean check = checkpalindrome(sub);
                if(check) {
                    if(sub.length() > longestsub.length()) {
                        longestsub = sub;
                    }
                }
            }
        }
        return longestsub;
    }
    public boolean checkpalindrome(String str) {
        int i =0,j=str.length()-1;
        while(i<=j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
    
            return true;
        
    }
}