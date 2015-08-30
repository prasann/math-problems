public static void main(String[] args) {
    System.out.print(LookAndSay(parseStart(start), n - 1));
}

static String LookAndSay(String start, int n) {
    if (n == 0) {
        return start;
    }
    return LookAndSay(parseStart(start), n - 1);
}

static String parseStart(String start) {
    char[] charArray = start.toCharArray();
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < charArray.length; i++) {
        int counter = 1;
        while(i+1 < charArray.length && charArray[i] == charArray[i+1]){
            counter++;
            i++;
        }
        res.append(counter);
        res.append(charArray[i]);
    }
    return res.toString();
}

