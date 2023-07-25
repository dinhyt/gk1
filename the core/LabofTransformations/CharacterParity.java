String solution(char symbol) {
        if(Character.isDigit(symbol) == true){
        if((int)symbol % 2 == 0) return "even";
        else return "odd";
        }
        else{
        return "not a digit";
        }

        }
