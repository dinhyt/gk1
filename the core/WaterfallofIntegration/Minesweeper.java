int[][] solution(boolean[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] sol = new int[row][col];
        for(int i = 0; i < row; i++){
        int[] temp = new int[col];
        for(int j = 0; j < col; j++){
        temp[j] = neighbors(matrix, i, j, row, col);
        }
        sol[i] = temp;
        }
        return sol;
        }


        int neighbors(boolean[][] matrix, int i, int j, int row, int col){
        int mine = 0;
        if(((i < 1) || (j < 1)) == false){
        if(matrix[i - 1][j - 1] == true) mine +=  1;
        }
        if((i < 1) == false){
        if(matrix[i - 1][j] == true) mine += 1;
        }
        if(((i < 1) || (j >= col - 1)) == false){
        if(matrix[i - 1][j + 1] == true) mine += 1;
        }
        if((j >= col - 1) == false){
        if(matrix[i][j + 1] == true) mine += 1;
        }
        if(((i >= row -1) || (j >= col -1)) == false){
        if(matrix[i + 1][j + 1] == true) mine++;
        }
        if((i >= row - 1) == false){
        if(matrix[i + 1][j] == true) mine++;
        }
        if(((i >= row - 1) || (j < 1)) == false){
        if(matrix[i + 1][j - 1] == true) mine++;
        }
        if((j < 1) == false){
        if(matrix[i][j - 1] == true) mine++;
        }
        return mine;
        }