int[][] solution(int[][] matrix, int width, int[] center, int t) {

        int rowCenter = center[0];
        int colCenter = center[1];
        width /= 2;
        for(int j = 0; j < t % 360; j++){
        for(int i = 0; i < width; i++){
        int temp = matrix[rowCenter-width+i][colCenter-width+i];
        matrix[rowCenter-width+i][colCenter-width+i] = matrix[rowCenter][colCenter-width+i];
        matrix[rowCenter][colCenter-width+i] = matrix[rowCenter+width-i][colCenter-width+i];
        matrix[rowCenter+width-i][colCenter-width+i] = matrix[rowCenter+width-i][colCenter];
        matrix[rowCenter+width-i][colCenter] = matrix[rowCenter+width-i][colCenter+width-i];
        matrix[rowCenter+width-i][colCenter+width-i] = matrix[rowCenter][colCenter+width-i];
        matrix[rowCenter][colCenter+width-i] = matrix[rowCenter-width+i][colCenter+width-i];
        matrix[rowCenter-width+i][colCenter+width-i] = matrix[rowCenter-width+i][colCenter];
        matrix[rowCenter-width+i][colCenter] = temp;
        }
        }
        return matrix;
        }
