import java.util.*;

public class ArrangeStash {
    public static void main(String[] args) {
        compute("PMLPMMMLPMLPMML");
    }

    static String compute(String instructions) {
        char[] charIns = instructions.toUpperCase().toCharArray();
        Map<Integer, Stack> area = new HashMap<Integer, Stack>();
        for (int i = 0; i < 10; i++) {
            area.put(i, new Stack());
        }
        int position = 0;
        boolean hasBlock = false;
        for (int i = 0; i < charIns.length; i++) {
            switch (charIns[i]) {
                case 'P': {
                    hasBlock = !hasBlock;
                    position = 0;
                    break;
                }
                case 'M':{
                    position = (position + 1) % 10;
                    System.out.println("M" + position);
                    break;
                }
                case 'L':{
                    Stack currentStack = area.get(position);
                    currentStack.push("X");
                    break;
                }
                default:
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Integer.toString(area.get(i).size(),15));
        }
        return null;
    }


}
