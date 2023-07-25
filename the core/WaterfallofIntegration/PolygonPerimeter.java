int solution(boolean[][] matrix) {
        int nrow = matrix.length;
        int ncol = matrix[0].length;
        int perimeter = 0;
        for(int i = 0; i < nrow; i++){
        for(int j = 0; j < ncol; j++){
        if(matrix[i][j]){
        perimeter += 4;
        }
        }
        }
        for(int i = 0; i < nrow; i++){
        for(int j = 0; j < ncol; j++){
        if( j != ncol - 1){
        if(matrix[i][j] && matrix[i][j + 1]){
        perimeter -= 2;
        }
        }
        if(i != nrow - 1){
        if(matrix[i][j] && matrix[i+1][j]){
        perimeter -= 2;
        }
        }
        }
        }
        return perimeter;
        }

