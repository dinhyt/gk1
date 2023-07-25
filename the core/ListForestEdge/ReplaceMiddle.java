int[] solution(int[] arr) {
        int[] result1 = new int[arr.length - 1];
        int[] result2 = new int[1];
        if(arr.length % 2 == 0){
        for(int i = 0; i < arr.length / 2 - 1; i++){
        result1[i] = arr[i];
        }
        result1[arr.length / 2 - 1] = arr[arr.length / 2] + arr[arr.length / 2 - 1];
        for(int i = arr.length / 2; i < arr.length - 1; i++){
        result1[i] = arr[i + 1];
        }
        return result1;
        }
        else{
        return arr;
        }

        }
