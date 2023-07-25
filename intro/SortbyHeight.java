int[] solution(int[] a) {
        int tmp = 0;
        for(int i = 0; i < a.length; i++){
        if(a[i] != -1) tmp++;
        }
        int[] b = new int[tmp];
        int b_i = 0;
        for(int i = 0; i < a.length; i++){
        if(a[i] != -1){
        b[b_i] = a[i];
        b_i++;
        }
        }
        Arrays.sort(b);
        b_i = 0;
        for(int i = 0; i < a.length; i++){
        if(a[i] != -1){
        a[i] = b[b_i];
        b_i++;
        }
        }
        return a;
        }