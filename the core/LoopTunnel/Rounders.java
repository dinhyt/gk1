int solution(int n) {
        int i = soCoNChuSo(n);
        int result = n;
        for(int j = 1; j < i; j++){
        if(n % 10 >= 5){
        result = result - (n % 10) * muoiMuN(j - 1) + muoiMuN(j);
        n = result / muoiMuN(j);
        }
        else {
        result = result - (n % 10) * muoiMuN(j - 1);
        n = result / muoiMuN(j);
        }
        }
        return result;
        }

        int soCoNChuSo(int n){
        int count = 0;
        while(n > 0){
        n = n / 10;
        count++;
        }
        return count;
        }

        int muoiMuN(int n){
        if(n == 0) return 1;
        else return 10 * muoiMuN(n - 1);
        }