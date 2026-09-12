class Solution {
    private String getKeySorted(String input){
        char[] chars = input.toCharArray();
        
        Arrays.sort(chars);
        
        String sorted = new String(chars);
        return sorted;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>  result=new ArrayList<List<String>>();   
        Map<String,List<String>> seen= new HashMap<String,List<String>>();
        for (String str:strs){
           int last_index=result.size() -1;
           String key=getKeySorted(str);
           seen.computeIfAbsent(key,k -> new ArrayList<String>()).add(str);
        }
        return new ArrayList<>(seen.values());
    }
}
