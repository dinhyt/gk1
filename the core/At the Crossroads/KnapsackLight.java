int solution(int value1, int weight1, int value2, int weight2, int maxW) {
        if(maxW < weight1 && maxW < weight2) return 0;
        else if(maxW == weight1 && maxW == weight2){
        if(value1 > value2) return value1;
        else if(value2 > value1) return value2;
        return value1;
        }
        else if(maxW == weight1 && maxW < weight2) return value1;
        else if(maxW == weight2 && maxW < weight1) return value2;
        else if(maxW > weight1 && maxW < weight2) return value1;
        else if(maxW < weight1 && maxW > weight2) return value2;
        else{
        if(maxW < (weight1 + weight2)){
        if(value1 > value2) return value1;
        else return value2;
        }
        else if( maxW == weight1 + weight2) return value1 + value2;
        else{
        if(weight1 == weight2) return value1 + value2;
        else{
        int count = 0;
        int max = 0;
        while(true){
        if(count % 2 == 0 && (maxW - weight1) >= 0){
        count++;
        maxW -= weight1;
        max += value1;
        }
        if(count % 2 == 0 && (maxW - weight2) >= 0){
        count++;
        maxW -= weight2;
        max += value2;
        }
        else break;
        }
        return max;
        }

        }
        }
        }
