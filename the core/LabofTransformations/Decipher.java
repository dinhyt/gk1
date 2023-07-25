String solution(String cipher) {
        String result = "";
        int i = 0;
        while(i < cipher.length() - 1){
        if(cipher.charAt(i) == '9'){
        result += (char)('a' + Integer.valueOf(cipher.substring(i, i+2)) - 97);
        i += 2;
        }
        else{
        result += (char)('a' + Integer.valueOf(cipher.substring(i, i+3)) - 97);
        i += 3;
        }
        }
        return result;
        }
