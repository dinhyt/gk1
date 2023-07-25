int[] solution(String part, String total) {
        double sum1 = ((total.charAt(0) - '0') * 10 + (total.charAt(1) - '0')) * 3600
        + ((total.charAt(3) - '0') * 10 + (total.charAt(4) - '0')) * 60
        + ((total.charAt(6) - '0') * 10 + (total.charAt(7) - '0'));
        double sum2 = ((part.charAt(0) - '0') * 10 + (part.charAt(1) - '0')) * 3600
        + ((part.charAt(3) - '0') * 10 + (part.charAt(4) - '0')) * 60
        + ((part.charAt(6) - '0') * 10 + (part.charAt(7) - '0'));
        double division = sum1 / sum2;
        int[] sol = new int[2];
        if(division % 1 == 0){
        sol[0] = 1;
        sol[1] = (int)division;
        return sol;
        }
        else{
        int i = 2;
        while(true){
        if((division * i) % 1 == 0){
        break;
        }
        i++;
        }
        sol[0] = i;
        sol[1] = (int)(division * i);
        return sol;
        }
        }
