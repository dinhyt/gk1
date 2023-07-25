boolean solution(int n) {
        int soCoNChuSo = soCoNChuSo(n);
        int first = 0;
        int second = 0;
        for(int i = 0; i < soCoNChuSo / 2; i++){
        second += n % 10;
        n /= 10;
        }
        for(int i = 0; i < soCoNChuSo / 2; i++){
        first += n % 10;
        n /= 10;
        }
        if(first == second) return true;
        else return false;
        }

        int soCoNChuSo(int n){
        int sol = 0;
        while(n > 0){
        sol += 1;
        n /= 10;
        }
        return sol;
        }