int[] solution(int lastNumberOfDays) {
        int a[] = {31};
        int c[] = {28,30 ,31};
        if(lastNumberOfDays == 28) return a;
        else if(lastNumberOfDays == 30) return a;
        else return c;
        }
