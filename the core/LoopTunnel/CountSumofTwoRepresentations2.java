int solution(int n, int l, int r) {
        int a = l;
        int count = 0;
        while(a <= (l + r)){
        if((n - a) >= a && (n - a) <= r){
        count++;
        }
        a++;
        }
        return count;
        }