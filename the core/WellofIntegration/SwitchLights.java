int[] solution(int[] a) {
        for(int i = 0; i < a.length; i++){
        if(a[i] == 1){
        for(int j = 0; j < i + 1;j++){
        if(a[j] == 1) a[j] = 0;
        else a[j] = 1;
        }
        }
        }
        return a;
        }
