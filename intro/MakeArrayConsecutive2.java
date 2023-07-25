int solution(int[] statues) {
        int max = statues[0];
        for(int i = 1; i < statues.length; i++) {
        max = Math.max(max, statues[i]);
        }
        int min = statues[0];
        for(int i = 1; i < statues.length; i++) {
        min = Math.min(min, statues[i]);
        }
        return max - min + 1 - statues.length;
        }