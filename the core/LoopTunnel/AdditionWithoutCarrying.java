int solution(int param1, int param2) {
        int length1 = soCoNChuSo(param1);
        int length2 = soCoNChuSo(param2);
        int maxLength = 0;
        int j, k;
        int result = 0;
        if(length1 > length2) maxLength = length1;
        else maxLength = length2;
        for(int i = 0; i < maxLength; i++){
        j = param1 % 10;
        k = param2 % 10;
        result += ((j + k) % 10) * muoiMuN(i);
        param1 /= 10;
        param2 /= 10;
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
