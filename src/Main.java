import java.util.*;

public class Main {
    public static void main(String[] args) {



        Numbers num1 = new Numbers(2, 2);
        Numbers num2 = new Numbers(2, 3);
        Numbers num3 = new Numbers(2, 4);
        Numbers num4 = new Numbers(2, 5);
        Numbers num5 = new Numbers(2, 6);
        Numbers num6 = new Numbers(2, 7);
        Numbers num7 = new Numbers(2, 8);
        Numbers num8 = new Numbers(2, 9);
        Numbers num9 = new Numbers(2, 2);
        Numbers num10 = new Numbers(3, 4);
        Numbers num11 = new Numbers(4, 5);
        Numbers num12 = new Numbers(5, 6);
        Numbers num13 = new Numbers(6, 7);
        Numbers num14 = new Numbers(7, 8);
        Numbers num15 = new Numbers(8, 9);

        Set<Numbers> set = new HashSet<>();

        set.add(num1);
        set.add(num2);
        set.add(num3);
        set.add(num4);
        set.add(num5);
        set.add(num6);
        set.add(num7);
        set.add(num8);
        set.add(num9);
        set.add(num10);
        set.add(num11);
        set.add(num12);
        set.add(num13);
        set.add(num14);
        set.add(num15);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}