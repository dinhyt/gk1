int[] solution(int[] items) {
        int[] result = new int[items.length];
        for(int i = 0; i < items.length; i++){
        int pos = -1;
        for(int j = 0; j < i; j++){
        if(items[j] < items[i]){
        pos = j;
        }
        }
        if(pos == -1) result[i] = - 1;
        else{
        result[i] = items[pos];
        }
        }
        return result;
        }
