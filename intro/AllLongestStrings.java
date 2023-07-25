String[] solution(String[] inputArray) {
        int max = 0;
        for(int i = 0; i < inputArray.length; i++){
        if(max < inputArray[i].length()) max = inputArray[i].length();
        }
        int sol_counter = 0;
        for(int i = 0; i < inputArray.length; i++){
        if(max == inputArray[i].length()) sol_counter++;
        }
        String[] sol = new String[sol_counter];
        int sol_index = 0;
        for(int i = 0; i < inputArray.length; i++){
        if(max == inputArray[i].length()){
        sol[sol_index] = inputArray[i];
        sol_index++;
        }
        }
        return sol;
        }