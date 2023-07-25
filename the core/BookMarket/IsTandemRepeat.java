boolean solution(String inputString) {
        int size = inputString.length();
        String left = inputString.substring(0, (size / 2));
        String right = inputString.substring(size / 2);
        return left.equals(right);
        }