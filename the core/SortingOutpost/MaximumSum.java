int solution(int[] a, int[][] q) {
        Arrays.sort(a);
        int[] b = new int[a.length];
        for(int[] p : q){
        for(int i = p[0]; i < p[1] + 1; i++){
        b[i] += 1;
        }
        }
        Arrays.sort(b);
        int sol = 0;
        for(int i = 0; i < a.length; i++){
        sol += a[i] * b[i];
        }
        return sol;
        }
