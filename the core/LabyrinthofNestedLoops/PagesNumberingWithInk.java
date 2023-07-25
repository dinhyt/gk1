int solution(int current, int numberOfDigits) {
        while(numberOfDigits >= 0){
        numberOfDigits -= (int)Math.ceil(Math.log10(current + 1));
        current++;
        }
        return current - 2;
        }
