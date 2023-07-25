int solution(int k) {
        return redApple(k) - yellowApple(k);
        }

        int yellowApple(int k){
        int sum = 0;
        for(int i = 1; i <= k; i = i + 2){
        sum += i * i;
        }
        return sum;
        }

        int redApple(int k){
        int sum = 0;
        for(int i = 2; i <= k; i = i + 2){
        sum += i * i;
        }
        return sum;
        }
