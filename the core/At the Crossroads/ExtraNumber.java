int solution(int a, int b, int c) {
        if(a == b) return c;
        if(a == c) return b;
        if(c == b) return a;
        else return 0;
        }
