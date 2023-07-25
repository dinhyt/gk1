boolean solution(String inputString, int l, int r) {
        int size = inputString.length();
        for(int width = l; width < r + 1; width++){
        if(size % (width + 1) == width){
        boolean beautiful = true;
        for(int i = 0; i < (size + 1) / (width + 1) - 1; i++){
        char tmp = inputString.charAt((i+1)*(width+1)-1);
        if(tmp != ' '){
        beautiful = false;
        break;
        }
        }
        if(beautiful){
        return true;
        }
        }
        }
        return false;
        }
