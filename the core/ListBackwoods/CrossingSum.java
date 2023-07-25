int solution(int[][] matrix, int a, int b) {
        int row = matrix.length;
        int col = matrix[0].length;
        int sum = 0;
        for(int i = 0; i < row; i++){
        sum += matrix[i][b];
        }
        for(int i = 0; i < col; i++){
        sum += matrix[a][i];
        }
        return sum-matrix[a][b];
        }
