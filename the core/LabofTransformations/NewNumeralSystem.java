String[] solution(char number) {
        char[] alpha = {'A','B','C','D','E','F','G','H','I','J','K','L',
        'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};


        int start = 0, end = 0;
        for(int i = 0; i<26; i++){
        if(number == alpha[i]){
        end = i;
        break;
        }
        }

        ArrayList<String> list = new ArrayList<String>();

        while(start <= end){
        String str = String.valueOf(alpha[start]) + " + "+ String.valueOf(alpha[end]);
        list.add(str);
        start++;
        end--;
        }

        return list.toArray(new String[list.size()]);
        }
