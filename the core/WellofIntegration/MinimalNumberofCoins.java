int solution(int[] coins, int price) {
        int count = 0;
        while(price > 0){
        for(int i = coins.length - 1; i >= 0; i--){
        count += price / coins[i];
        price -= coins[i] * (price / coins[i]);
        }
        }
        return count;
        }
