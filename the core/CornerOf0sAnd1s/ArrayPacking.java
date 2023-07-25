int solution(int[] a) {
        int result = 0;
        for(int i = 0; i < a.length; i++){
        int count = 0;
        while(a[i] > 0){
        if(a[i] % 2 == 1) result += hai_mu_n(count + 8 * i);
        count++;
        a[i] = a[i] / 2;
        }
        }
        return result;
        }

        int hai_mu_n(int n){
        if(n == 0) return 1;
        else return 2 * hai_mu_n(n - 1);
        }

// so bit toi thieu de bieu dien so n
        int so_bit_toi_thieu(int a){
        int n = 1;
        int count = 0;
        while(n <= a){
        n *= 2;
        count++;
        }
        return count++;
        }
