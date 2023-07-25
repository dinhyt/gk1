int solution(int a0) {
        Set<Integer> arr = new HashSet<Integer>();
        arr.add(a0);
        int count = 1;
        int tmp = sub_solution(a0);
        while(count == arr.size()){
        arr.add(tmp);
        tmp = sub_solution(tmp);
        count++;
        }
        return count;
        }

        int sub_solution(int a){
        int result = 0;
        while(a > 0){
        result += (a % 10) * (a % 10);
        a = a / 10;
        }
        return result;
        }



