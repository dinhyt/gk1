int solution(int[] inputArray) {
        int count = 0;
        while(inputArray.length > 1){
        int[] tmp = new int[inputArray.length / 2];
        int j = 0;
        for(int i = 0; i < inputArray.length; i += 2){
        if(count % 2 == 0){
        tmp[j] += inputArray[i] + inputArray[i + 1];
        }
        else{
        tmp[j] += inputArray[i] * inputArray[i + 1];
        }
        j++;
        }
        inputArray = tmp;
        count++;
        }
        return inputArray[0];
        }