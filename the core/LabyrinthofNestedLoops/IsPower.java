boolean solution(int n) {
        for(int i = 1; i <= 20; i++){
        for(int j = 2; j <= 10; j++){
        if(n == nLuaThuaM(i, j)) return true;
        }
        }
        return false;
        }

        int nLuaThuaM(int a, int b){
        if(b == 0) return 1;
        else return a * nLuaThuaM(a, b - 1);
        }
