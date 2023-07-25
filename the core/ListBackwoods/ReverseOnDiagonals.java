int[][] solution(int[][] matrix) {
        for(int i = 0; i <= (matrix.length - 1) / 2; i++){
        int tmp1 = matrix[i][i];
        matrix[i][i] = matrix[matrix.length - i - 1][matrix.length - i - 1];
        matrix[matrix.length - i - 1][matrix.length - i - 1] = tmp1;
        int tmp2 = matrix[i][matrix.length - i - 1];
        matrix[i][matrix.length - i - 1] = matrix[matrix.length - i - 1][i];
        matrix[matrix.length - i - 1][i] = tmp2;
        }
        return matrix;
        }

