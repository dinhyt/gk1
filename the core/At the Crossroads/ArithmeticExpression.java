boolean solution(int a, int b, int c) {
        if(a >= c){
        if(a - b == c) return true;
        else{
        int d = a / b;
        int e = a % b;
        if(c == d && e == 0) return true;
        return false;
        }
        }
        else{
        if(a + b == c || a * b == c) return true;
        return false;
        }
        }
