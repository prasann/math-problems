public class Base7 {

    public static void main(String[] args) {
        char[] base7 = "0atlsin".toCharArray();
        String inputString = Long.toString(input, 7);
        System.out.println(inputString);
        StringBuilder res = new StringBuilder();
        int counter = 0;
        if (inputString.charAt(0) == '-') {
            counter = 1;
            res.append("-");
        }

        for (int i = counter; i < inputString.length(); i++) {
            Integer index = Character.getNumericValue(inputString.charAt(i));
            res.append(base7[index]);
        }
        System.out.println(res.toString());
    }


}
