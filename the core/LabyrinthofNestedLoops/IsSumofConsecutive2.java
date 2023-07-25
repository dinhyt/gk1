int solution(int n) {
        int count = 0;
        for(int i = 2; i < 1000; i++){
        for(int j = 1; j < 10000; j++){
        if((2 * n / i + 1 - i) % 2 == 0 && (2*n) % i == 0 && j == (2 * n / i + 1 - i) / 2 ) count++;
        }
        }
        return count;
        }
// sum = (b + a) * ((b - a) : 1 + 1) : 2
// ((b -a) : 1 + 1) la so phan tu

// 9 = (2a + i) * i : 2
// 2n = (2a + i - 1) * i

// 2n/i = 2a + i - 1
// 2n/i + 1 - i = 2a
// (2n/i + 1 - i) : 2 = a