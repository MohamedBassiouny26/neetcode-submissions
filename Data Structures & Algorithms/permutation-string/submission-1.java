class Solution {
    public boolean checkInclusion(String s1, String s2) {
       HashMap<Character,Integer> s1Count = new HashMap<>();
       HashMap<Character,Integer> s2Count = new HashMap<>();
       for (int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            int count=s1Count.getOrDefault(c,0);
            s1Count.put(c,count+1);
       }
       int l=0;
       for(int r=0;r<s2.length();r++){
        char c=s2.charAt(r);
        s2Count.put(c,s2Count.getOrDefault(c,0)+1);
        if (r-l+1==s1.length()){
            int matches=0;
            for (Map.Entry<Character, Integer> entry : s1Count.entrySet()) {
                Character key = entry.getKey();
                int value = entry.getValue();
                if(s2Count.getOrDefault(key,0)!=value){
                    s2Count.put(s2.charAt(l),s2Count.getOrDefault(s2.charAt(l),1)-1);
                    l++;
                    break;
                }else{
                    matches+=value;
                }                
            }
            if (matches==s1.length()) return true;
        }
       }
       return false;
    }
}
