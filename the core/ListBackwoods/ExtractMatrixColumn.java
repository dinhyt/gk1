int[] solution(int[][] matrix, int column) {
        int[] extract = new int[matrix.length];
        for(int i = 0; i < matrix.length; i++){
        extract[i] = matrix[i][column];
        }
        return extract;
        }
