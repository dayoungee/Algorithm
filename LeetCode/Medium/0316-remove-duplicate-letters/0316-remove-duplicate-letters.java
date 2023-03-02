class Solution {
    public String removeDuplicateLetters(String s) {
        int cnt = s.length();
        Set<Character> set = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char c: s.toCharArray()){
            map.put(c, map.get(c)-1);
            if(set.contains(c)) continue;

            while(!stack.isEmpty() && stack.peek() > c && map.get(stack.peek()) > 0){
                set.remove(stack.pop());
            }
            stack.push(c);
            set.add(c);
        }

        StringBuilder sb = new StringBuilder();
        while(stack.size() > 0){
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
}