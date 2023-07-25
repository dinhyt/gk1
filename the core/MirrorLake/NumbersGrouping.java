int solution(int[] a) {
        Arrays.sort(a);
        Set<Integer> group = new HashSet<Integer>();
        for(int i = 0; i < a.length; i++){
        for(int j = 1; j <= 100000; j++){
        if(a[i] <= (j * 10000)){
        group.add(j);
        break;
        }
        }
        }
        return group.size() + a.length;
        }


        int tong(int n){
        return (1 * n) * n / 2;
        }


