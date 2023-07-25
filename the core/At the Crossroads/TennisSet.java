boolean solution(int score1, int score2) {
        if(score1 < 5){
        if(score2 == 6) return true;
        else return false;
        }
        else if(score2 < 5){
        if(score1 == 6) return true;
        else return false;
        }
        else{
        if(score1 == 7 && score2 < 7) return true;
        else if(score2 == 7 && score1 < 7) return true;
        else return false;
        }
        }
