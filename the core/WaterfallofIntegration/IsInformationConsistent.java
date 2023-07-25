boolean solution(int[][] evidences) {
        for(int i = 0; i < evidences[0].length; i++){
        int info = 0;
        for(int j = 0; j < evidences.length; j++){
        if(evidences[j][i] * info < 0)
        return false;
        else{
        info += evidences[j][i];
        }
        }
        }
        return true;
        }
