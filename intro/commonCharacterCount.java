int solution(String s1, String s2) {
        int result = 0;
        int[] s1_count = new int[26];
        int[] s2_count = new int[26];
        for(int i = 0; i < s1.length(); i++){
        s1_count[(int)(s1.charAt(i) - 'a')]++;
        }
        for(int i = 0; i < s2.length(); i++){
        s2_count[(int)(s2.charAt(i) - 'a')]++;
        }
        for(int i = 0; i < 26; i++){
        result += (s1_count[i] <= s2_count[i])? s1_count[i] : s2_count[i];
        }
        return result;
        }