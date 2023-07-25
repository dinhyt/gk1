boolean solution(int n) {
        while(n % 10 == 0){
        n = n / 10;
        }
        int temp = 1;
        while(n > 0){
        temp *= n % 10;
        n = n / 10;
        }
        if(temp == 0) return true;
        else return false;
        }
