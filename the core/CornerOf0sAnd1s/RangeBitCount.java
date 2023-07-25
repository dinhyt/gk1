int solution(int a, int b) {
        int result = 0;
        for(int i = a; i <= b; i++){
        for(int j = i; j > 0; j /= 2){
        if(j % 2 == 1) result++;
        }
        }
        return result;
        }
