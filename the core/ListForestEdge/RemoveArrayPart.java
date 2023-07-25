int[] solution(int[] inputArray, int l, int r) {
        int[] result = new int[inputArray.length - r + l - 1];
        for(int i = 0; i < l; i++){
        result[i] = inputArray[i];
        }
        for(int i = 0; i < inputArray.length - r - 1; i++){
        result[l + i] = inputArray[r + i + 1];
        }
        return result;
        }


