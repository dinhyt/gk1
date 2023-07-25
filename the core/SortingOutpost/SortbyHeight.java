int[] solution(int[] a){
        int count1 = 0;
        for(int i = 0; i < a.length; i++){
        if(a[i] != -1){
        count1++;
        }
        }
        int[] arr1 = new int[count1];
        int arr1_index = 0;
        for(int i = 0; i < a.length; i++){
        if(a[i] != -1){
        arr1[arr1_index] = a[i];
        arr1_index++;
        }
        }
        Arrays.sort(arr1);
        arr1_index = 0;
        for(int i = 0; i < a.length; i++){
        if(a[i] != -1){
        a[i] = arr1[arr1_index];
        arr1_index++;
        }
        }
        return a;
        }
