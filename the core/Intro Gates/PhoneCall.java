int solution(int min1, int min2_10, int min11, int s) {
        if(s < min1)    return 0;
        else if((s - min1) == 0) return 1;
        else{
        s -= min1;
        for(int i = 1; i <= 9; i++){
        if((s - min2_10 * i) < 0) return i;
        else if((s - min2_10 * i) == 0) return i + 1;
        }
        s -= min2_10 * 9;

        for(int i = 1;;i++){
        if((s - min11 * i) < 0) return 10 + i - 1;
        else if((s - min11 * i) == 0) return 10 + i;
        }

        }
        }