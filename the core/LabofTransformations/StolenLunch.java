String solution(String note) {
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char[] digit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] input = note.toCharArray();
        String result = new String();
        for(int i = 0; i < input.length; i++){
        if(isAlpha(input[i]) >= 0){
        result += digit[isAlpha(input[i])];
        }
        else if(isDigit(input[i]) >= 0){
        result += alpha[isDigit(input[i])];
        }
        else{
        result += input[i];
        }

        }
        return result;

        }

        int isAlpha(char c){
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        for(int i = 0; i < alpha.length; i++){
        if(c == alpha[i]) return i;
        }
        return -1;
        }

        int isDigit(char c){
        char[] digit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for(int i = 0; i < digit.length; i++){
        if(c == digit[i]) return i;
        }
        return -1;
        }


