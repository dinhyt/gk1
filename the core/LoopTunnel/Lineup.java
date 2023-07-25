int solution(String commands) {
        int size = commands.length();
        int deg = 0;
        int temp = 0;
        for(int i = 0; i < size; i++){
        if(commands.charAt(i) == 'L')
        deg += -90;
        else if(commands.charAt(i) == 'R')
        deg += 90;
        else if(commands.charAt(i) == 'A')
        deg += 180;
        if(deg % 180 == 0){
        temp += 1;
        deg = 0;
        }
        }
        return temp;
        }
