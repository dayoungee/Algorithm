

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);     
        return sb.replace(s, overwrite_string.length() + s, overwrite_string).toString();
    }
}