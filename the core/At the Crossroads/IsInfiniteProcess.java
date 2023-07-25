boolean solution(int a, int b) {
        if(a == b) return false;
        if(a > b) return true;
        while(a < b){
        a++;
        b--;
        if(a == b) return false;
        }
        return true;
        }
