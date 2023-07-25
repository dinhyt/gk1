String solution(String startTag) {
        if(startTag.contains(" ")){
        String[] a = startTag.split(" ", 2);
        char[] b = a[0].toCharArray();
        return startTag.copyValueOf(b, 0, 1) + "/" + startTag.copyValueOf(b, 1, a[0].length() - 1) + ">";
        }
        else{
        char[] b = startTag.toCharArray();
        return startTag.copyValueOf(b, 0, 1) + "/" + startTag.copyValueOf(b, 1, b.length - 1);
        }
        }
