class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> sCount=new HashMap<>();
        HashMap<Character,Integer> tCount=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }  
        for (char ch:s.toCharArray()){
            sCount.merge(ch,1,(oldVal,newVal)-> oldVal+newVal);
        }
        for (char ch:t.toCharArray()){
            tCount.merge(ch,1,(oldVal,newVal)-> oldVal+newVal);
        }
        for (Map.Entry<Character,Integer> entry:sCount.entrySet()){
            Character key=entry.getKey();
            Integer countS=entry.getValue();
            Integer countT=tCount.get(key);
            if (!countS.equals(countT)){
                return false;
            }
        }
        return true;
    }
}
