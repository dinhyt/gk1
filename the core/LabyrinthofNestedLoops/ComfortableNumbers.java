int solution(int l, int r) {
        int sol = 0;
        for(int i = l; i <= r; i++){
        for(int j = l; j <= r; j++){
        if(i != j){
        if(comfortable(i, j) == 1) sol++;
        }
        }
        }
        return sol / 2;
        }

        int sumOfDigit(int a){
        int sum = 0;
        while(a > 0){
        sum += a % 10;
        a = a / 10;
        }
        return sum;
        }

        int comfortable(int a, int b){
        if(a < b - sumOfDigit(b) || a > b + sumOfDigit(b)){
        return 0;
        }
        else if(b < a - sumOfDigit(a) || b > a + sumOfDigit(b)){
        return 0;
        }
        else if(a >= b - sumOfDigit(b) && a <= b + sumOfDigit(b)){
        if(b >= a - sumOfDigit(a) && b <= a + sumOfDigit(a)){
        return 1;
        }
        else return 0;
        }
        else if(b >= a - sumOfDigit(a) && b <= a + sumOfDigit(a)){
        if(a >= b - sumOfDigit(b) && a <= b + sumOfDigit(b)){
        return 1;
        }
        else return 0;
        }
        else return 1;
        }

