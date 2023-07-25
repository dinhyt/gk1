int solution(int candlesNumber, int makeNew) {
        int total = 0;
        int leftover = 0;
        while(candlesNumber > 0){
        total += candlesNumber;
        leftover += candlesNumber;
        candlesNumber = leftover / makeNew;
        leftover -= candlesNumber * makeNew;
        }
        return total;
        }
