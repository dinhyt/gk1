int solution(int[] a) {
        Set<Integer> b = new HashSet<Integer>();
        for(int i = 0; i < a.length; i++){
        b.add(tichCacChuSo(a[i]));
        }
        return b.size();
        }

        int tichCacChuSo(int n){
        int sol = 1;
        while(n > 0){
        sol *= n % 10;
        n /= 10;
        }
        return sol;
        }
