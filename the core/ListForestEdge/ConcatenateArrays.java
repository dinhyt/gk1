int[] solution(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for(int i = 0; i < a.length; i++){
        result[i] = a[i];
        }
        for(int i = 0; i < b.length; i++){
        result[a.length + i] = b[i];
        }
        return result;
        }
