class Solution {
    private static final String DELIMITER = "|";
    public String encode(List<String> strs) {
       // Use StringBuilder to efficiently build the encoded string
       if(strs.size() ==0 ) return null;
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            // Append each string followed by the delimiter
            System.out.println(str);
            sb.append(str).append(DELIMITER);
        }
        // Remove the last delimiter
        if (sb.length() > 0) {
            sb.setLength(sb.length() - DELIMITER.length());
        }
        return sb.toString();
    }

    public List<String> decode(String str) throws Exception{
        if(str==null) return new ArrayList<>();
         // Split the encoded string using the delimiter
        String[] parts = str.split("\\|");
        // Convert the array to a list
        return new ArrayList<>(Arrays.asList(parts));
    }
}
