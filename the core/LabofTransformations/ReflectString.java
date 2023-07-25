String solution(String inputString) {
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String sol = new String();
        for(int i = 0; i < inputString.length(); i++){
        for(int j = 0; j < 26; j++){
        if(inputString.charAt(i) == alpha[j]){
        sol += alpha[25 - j];
        }
        }
        }
        return sol;

        }

