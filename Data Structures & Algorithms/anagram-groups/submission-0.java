class Solution {
    private String getKeySorted(String input){
        char[] chars = input.toCharArray();
        
        Arrays.sort(chars);
        
        String sorted = new String(chars);
        return sorted;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>  result=new ArrayList<List<String>>();   
        Map<String,Integer> seen= new HashMap<String,Integer>();
        for (String str:strs){
           int last_index=result.size() -1;
           String key=getKeySorted(str);
           if (seen.containsKey(key)){
                int index=seen.get(key);
                result.get(index).add(str);
           }else{
                seen.put(key,last_index+1);
                List<String> newValue=new ArrayList<>();
                newValue.add(str);
                result.add(newValue);
           }
        }
        return result;
    }

    
}
