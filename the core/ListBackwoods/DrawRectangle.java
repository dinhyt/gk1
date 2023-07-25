char[][] solution(char[][] canvas, int[] rectangle) {
        int x1 = rectangle[0];
        int y1 = rectangle[1];
        int x2 = rectangle[2];
        int y2 = rectangle[3];
        canvas[y1][x1] = '*';
        canvas[y1][x2] = '*';
        canvas[y2][x1] = '*';
        canvas[y2][x2] = '*';
        for(int i = x1 + 1; i < x2; i++){
        canvas[y1][i] = '-';
        canvas[y2][i] = '-';
        }
        for(int i = y1 + 1; i < y2; i++){
        canvas[i][x1] = '|';
        canvas[i][x2] = '|';
        }
        return canvas;
        }