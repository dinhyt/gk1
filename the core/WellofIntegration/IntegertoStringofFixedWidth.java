String solution(int number, int width) {
        int n = soCoNChuSo(number);
        int a = muoiMuN(width);
        if(n >= width){
        return String.valueOf(number % a);
        }
        else{
        String result = new String();
        int b = width - soCoNChuSo(number);
        for(int i = 0; i < b; i++){
        result += "0";
        }

        return result + String.valueOf(number);
        }
        }

// kiem tra number co bao nhieu chu so
        int soCoNChuSo(int n){
        if(n == 0) return 1;
        int result = 0;
        while(n > 0){
        result++;
        n = n / 10;
        }
        return result;
        }

// 10 mu n
        int muoiMuN(int n){
        if(n == 0) return 1;
        else return 10 * muoiMuN(n - 1);
        }