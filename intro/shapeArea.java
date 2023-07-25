int solution(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++){
        if(i < n)
        sum += 2 * ((2 * n - 1) - (2 * n - 1 - (2 * i - 1)));
        else
        sum += ((2 * n - 1) - (2 * n - 1 - (2 * i - 1)));
        }
        return sum;
        }