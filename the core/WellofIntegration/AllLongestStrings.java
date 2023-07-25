String[] solution(String[] inputArray) {
        int[] numberOfElements = new int[inputArray.length];

        // lay ra do dai cua tung phan tu cua inputarray
        for(int i = 0; i < inputArray.length; i++){
        numberOfElements[i] = inputArray[i].length();
        }
        int max = 0;

        // tim max do dai cua cac phan tu cua inputarray
        for(int i = 0; i < numberOfElements.length; i++){
        if(max < numberOfElements[i]){ max = numberOfElements[i];
        }
        }

        // tim ra so luong cac phan tu co chieu dai bang max
        int count = 0;
        for(int i = 0; i < numberOfElements.length; i++){
        if(numberOfElements[i] == max) count++;
        }
        String[] result = new String[count];

        int count1 = 0;
        for(int i = 0; i < numberOfElements.length; i++){
        if(numberOfElements[i] == max){
        result[count1] = inputArray[i];
        count1++;
        }
        }
        return result;
        }
