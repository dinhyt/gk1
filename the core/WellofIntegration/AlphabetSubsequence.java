boolean solution(String s) {
        Set<Character> result = new HashSet<Character>();
        for(int i = 0; i < s.length() - 1; i++){
        result.add(s.charAt(i));
        if(result.size() != i + 1) return false;
        if(s.charAt(i) > s.charAt(i + 1)) return false;
        }
        result.add(s.charAt(s.length() - 1));
        if(result.size() != s.length()) return false;
        return true;
        }
