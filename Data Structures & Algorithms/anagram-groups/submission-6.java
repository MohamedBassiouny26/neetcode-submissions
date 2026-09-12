class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> seen= new HashMap<String,List<String>>();
        for (String str:strs){
            int[] count=new int[26];
            for (char c : str.toCharArray()) {
                char startingChar='a';
                int index=c-startingChar;
                count[index]+=1;
            }
            String key = Arrays.toString(count);
            seen.computeIfAbsent(key,k -> new ArrayList<String>()).add(str);
        }
        return new ArrayList<>(seen.values());
    }
}
