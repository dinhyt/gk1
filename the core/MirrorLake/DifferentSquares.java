int solution(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;;
        Set<String> uniqueMatrix = new HashSet<String>();
        for(int i = 0; i < row - 1; i++){
        for(int j = 0; j < col - 1; j++){
        uniqueMatrix.add(matrix[i][j] + "" + matrix[i][j+1] + "" + matrix[i+1][j] + "" + matrix[i+1][j+1]);
        }
        }
        return uniqueMatrix.size();
        }
