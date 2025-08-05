class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String dou = s+s;
        String trim  = dou.substring(1,dou.length()-1);
        return trim.contains(s);
    }
}