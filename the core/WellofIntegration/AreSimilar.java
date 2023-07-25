boolean solution(int[] a, int[] b) {
        int count = 0;
        int[] c = new int[2];
        int d = 0;
        for(int i = 0; i < a.length; i++){
        if(a[i] != b[i]) count++;
        }
        if(count > 2) return false;
        else{
        for(int i = 0; i < a.length; i++){
        if(a[i] != b[i]){
        c[d] = i;
        d++;
        }
        }
        if(a[c[0]] == b[c[1]] && a[c[1]] == b[c[0]]) return true;
        else return false;
        }
        }
