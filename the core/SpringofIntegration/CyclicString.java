int solution(String s) {
        int lenS = s.length();
        for(int i = 0; i < lenS; i++){
        String sub = s.substring(0, i + 1);
        int time = lenS / (i + 1) + 1;
        String s1 = "";
        for(int j = 0; j < time; j++){
        s1 += sub;
        }
        if(s1.contains(s)) return i + 1;
        }
        return 0;
        }