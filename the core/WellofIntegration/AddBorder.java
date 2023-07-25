String[] solution(String[] picture) {
        int l = picture[0].length() + 2;
        String[] result = new String[(picture.length + 2)];
        for(int i = 0; i < picture.length + 2; i++){
        if(i == 0 || i == picture.length + 1){
        result[i] = nStar(l);
        }
        else{
        result[i] = addStarInFirstAndLast(picture[i - 1]);
        }
        }
        return result;
        }

        String addStarInFirstAndLast(String n){
        return "*" + n + "*";
        }

        String nStar(int n){
        String n_star = new String();
        for(int i = 0; i < n; i++){
        n_star += "*";
        }
        return n_star;
        }
