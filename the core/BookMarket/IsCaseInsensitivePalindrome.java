boolean solution(String inputString) {
        String s = inputString.toLowerCase();
        int size = inputString.length();
        int temp = 1;
        for(int i = 0; i < size /2; i++){
        if(s.charAt(i) == s.charAt(size - i - 1)){
        temp *= 1;
        }
        else temp *= 0;
        }
        if(temp == 0) return false;
        else return true;
        }