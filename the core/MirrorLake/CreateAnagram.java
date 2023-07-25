int solution(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int count1[] = new int[26];
        int count2[] = new int[26];
        char[] alpha = {'A','B','C','D','E','F','G','H','I','J','K','L',
        'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(int i = 0; i < 26; i++){
        count1[i] = 0;
        for(int j = 0; j < s1.length; j++){
        if(s1[j] == alpha[i]) count1[i] = count1[i] + 1;
        }
        }
        for(int i = 0; i < 26; i++){
        count2[i] = 0;
        for(int j = 0; j < t1.length; j++){
        if(t1[j] == alpha[i]) count2[i] = count2[i] + 1;
        }
        }
        int result = s1.length;
        for(int i = 0; i < 26; i++){
        if(count1[i] > 0 && count2[i] > 0){
        if(count1[i] >= count2[i]) result -= count2[i];
        else result -= count1[i];
        }
        }
        return result;
        }
