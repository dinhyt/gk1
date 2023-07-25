int solution(int n) {
        int sum = 0;
        int x = n / 60;
        int y = n % 60;
        while(x != 0 || y != 0){
        sum = sum + (x % 10) + (y % 10);
        x = x / 10;
        y = y / 10;
        }
        return sum;
        }
