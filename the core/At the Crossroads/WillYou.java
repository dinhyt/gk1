boolean solution(boolean young, boolean beautiful, boolean loved) {
        if(loved == true){
        if(young == true){
        if(beautiful == false) return true;
        return false;
        }
        else{
        return true;
        }
        }
        else{
        if(young == true && beautiful == true) return true;
        else return false;
        }
        }
