int[] solution(int n) {
        int[] arr = new int[n];
        for(int i = 1; i <= n; i++){
        arr[i - 1] = uocCuaN(i);
        }
        int[] weakness = new int[n];
        weakness[0] = 0;
        for(int i = 1; i < n; i++){
        for(int j = 0; j < i; j++){
        if(arr[j] > arr[i]) weakness[i]++;
        }
        }
        int max_weakness = 0;
        for(int i = 0; i < n; i++){
        if(weakness[i] > max_weakness) max_weakness = weakness[i];
        }
        int[] sol = new int[2];
        sol[0] = max_weakness;
        int count = 0;
        for(int i = 0; i < n; i++){
        if(weakness[i] == max_weakness) count++;
        }
        sol[1] = count;
        return sol;
        }

        int uocCuaN(int n){
        int result = 0;
        for(int i = 1; i <= n / 2; i++){
        if(n % i == 0) result++;
        }
        return result;
        }