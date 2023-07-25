boolean solution(int[][] grid) {
        for(int i = 0; i < grid.length; i++){
        Set<Integer> grid_row = new HashSet<Integer>();
        for(int j = 0; j < grid.length; j++){
        grid_row.add(grid[i][j]);
        }
        if(grid_row.size() != 9) return false;
        }
        for(int i = 0; i < grid.length; i++){
        Set<Integer> grid_column = new HashSet<Integer>();
        for(int j = 0; j < grid.length; j++){
        grid_column.add(grid[j][i]);
        }
        if(grid_column.size() != 9) return false;
        }
        for(int i = 0; i < grid.length / 3; i++){
        Set<Integer> grid_box = new HashSet<Integer>();
        for(int j = 0; j < 3; j++){
        for(int k = 0; k < 3; k++){
        grid_box.add(grid[j + i * 3][k + i * 3]);
        }
        }
        if(grid_box.size() != 9) return false;
        }
        return true;
        }
