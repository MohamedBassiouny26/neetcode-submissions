class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int[] s1Count=new int[26];
       int[] s2Count=new int[26];
       if (s1.length()>s2.length()) return false;
       for(int i=0;i<s1.length();i++){
        s1Count[s1.charAt(i)-'a']++;
        s2Count[s2.charAt(i)-'a']++;
       }
       int matches=0;
       for (int i=0;i<26;i++){
        matches+=(s1Count[i]==s2Count[i] ? 1:0);
       }
       int l=0;
       for(int r=s1.length();r<s2.length();r++){
            if (matches==26) return true;
            char c=s2.charAt(r);
            s2Count[c-'a']++;
            if(s2Count[c-'a']==s1Count[c-'a']){
                matches++;
            }else if(s2Count[c-'a']-1==s1Count[c-'a']){
                matches--;
            }
            c=s2.charAt(l);
            s2Count[c-'a']--;
            if(s2Count[c-'a']==s1Count[c-'a']){
                matches++;
            }else if(s2Count[c-'a']+1==s1Count[c-'a']){
                matches--;
            }
            l++;
       }
       return matches==26;
    }
}
