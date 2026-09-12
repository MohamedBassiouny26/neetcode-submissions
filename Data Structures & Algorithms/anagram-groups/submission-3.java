class Solution {
    private String getKeySorted(String input){
        char[] chars = input.toCharArray();
        
        Arrays.sort(chars);
        
        String sorted = new String(chars);
        return sorted;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> seen= new HashMap<String,List<String>>();
        for (String str:strs){
           String key=getKeySorted(str);
           seen.computeIfAbsent(key,k -> new ArrayList<String>()).add(str);
        }
        return new ArrayList<>(seen.values());
    }
}
