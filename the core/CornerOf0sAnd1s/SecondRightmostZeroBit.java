int solution(int n) {
        String binaryString = Integer.toBinaryString(n);
        int count = 0;
        int i = binaryString.length() - 1;
        while(i > 0){
        if(count == 2) break;
        else if(binaryString.charAt(i) == '0'){
        count++;
        }
        i--;
        }
        count  = binaryString.length() - i - 2;
        return haiMuN(count);
        }


        int haiMuN(int n){
        if(n == 0) return 1;
        else{
        return 2 * haiMuN(n - 1);
        }
        }


