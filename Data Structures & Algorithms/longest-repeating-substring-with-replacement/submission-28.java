class Solution {
    Map<Character,Integer> count=new HashMap<>();
    public int characterReplacement(String s, int k) {
       int l=0;
       int r=0; 
       int result=0;
       while(r<s.length()){
        char c=s.charAt(r);
        count.merge(c, 1, Integer::sum);
        int maxCount=maxCount();
        int diff=(r-l+1)-maxCount;
        if(diff<=k){
           result=Math.max(r-l+1,result);
        }else{
            count.put(s.charAt(l), count.get(s.charAt(l)) - 1); 
            l++;
        }
           r++;
       }
       return result;
    }
    private int maxCount(){
        int maxCount = 0;
        for (int value : count.values()) {
            maxCount = Math.max(maxCount, value);
        }
        return maxCount;
    }
}
