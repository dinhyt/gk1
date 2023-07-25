String solution(String noun) {
        char[] array = noun.toCharArray();
        return noun.copyValueOf(array, 0, 1).toUpperCase() + noun.copyValueOf(array, 1, array.length - 1).toLowerCase();
        }