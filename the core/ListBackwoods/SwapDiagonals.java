int[][] solution(int[][] matrix) {
        int size = matrix.length;
        for(int i = 0; i <= (size - 1) / 2; i++){
        int temp = matrix[i][i];
        matrix[i][i] = matrix[i][size - i - 1];
        matrix[i][size - i - 1] = temp;
        temp = matrix[size - i - 1][i];
        matrix[size - i - 1][i] = matrix[size - i - 1][size - i - 1];
        matrix[size - i - 1][size - i - 1] = temp;
        }
        return matrix;
        }