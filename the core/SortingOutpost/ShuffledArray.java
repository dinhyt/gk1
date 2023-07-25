int[] solution(int[] shuffled) {
        Arrays.sort(shuffled);
        int[] sol = new int[shuffled.length - 1];
        int sol_index = 0;
        int sum = 0;
        int check_count = 0;
        for(int i = 0; i < shuffled.length; i++){
        sum += shuffled[i];
        }
        for(int i = 0; i < shuffled.length; i++){
        if(shuffled[i] == sum / 2 && check_count < 1){
        check_count++;
        continue;
        }
        else{
        sol[sol_index] = shuffled[i];
        sol_index++;
        }
        }
        return sol;
        }


