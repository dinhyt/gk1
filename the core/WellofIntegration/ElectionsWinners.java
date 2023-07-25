int solution(int[] votes, int k) {
        int result = 0;
        Arrays.sort(votes);
        if(k == 0){
        if(votes[votes.length - 1] > votes[votes.length - 2]) result++;
        }
        else{
        for(int i = 0; i < votes.length; i++){
        if(votes[i] + k > votes[votes.length - 1]) result++;
        }
        }


        return result;
        }


