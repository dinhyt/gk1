int solution(int n) {
        int i = 0;
        while(n > nGiaiThua(i)){
        i++;
        }
        return nGiaiThua(i);
        }

        int nGiaiThua(int n) {
        if(n == 0) return 1;
        else return n * nGiaiThua(n - 1);
        }
