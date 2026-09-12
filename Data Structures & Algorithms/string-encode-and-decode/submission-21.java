class Solution {
    private static final String DELIMITER = "|";
    public String encode(List<String> strs) {
       if(strs.size() ==0 ) return null;
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(DELIMITER);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - DELIMITER.length());
        }
        return sb.toString();
    }

    public List<String> decode(String str) throws Exception{
        if(str==null) return new ArrayList<>();
        String[] parts = str.split("\\|");
        return new ArrayList<>(Arrays.asList(parts));
    }
}
