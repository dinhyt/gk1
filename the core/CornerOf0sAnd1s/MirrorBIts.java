int solution(int a) {
        int n = 1;
        int count = 0;
        int result = 0;
        while(n <= a){
        n = n * 2;
        count++;
        }
        for(int i = 0; i < count; i++){
        if(a % 2 == 1) result += hai_mu_n(count - i - 1);
        a /= 2;
        }
        return result;
        }

        int hai_mu_n(int n){
        if(n == 0) return 1;
        else return 2 * hai_mu_n(n - 1);
        }