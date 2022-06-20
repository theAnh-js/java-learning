public class Main0609 {
    public static void main(String[] args) {
        boolean b = false;
        int i = 0;
        if (i++ > 5 && !b) {
            i++;
            System.out.println("i: " + i);
            System.out.println("hello guy");
        }
        System.out.println("i is: " + i);
        if (i > 0) {
            b = true;
        }
        System.out.println("b=" + b + ", i=" + i);
        System.out.println("-----------------");
        System.out.println(10 % 3);
        float a = 3;
        int d = 4;
        double c = 8;
        System.out.println(a);
        System.out.println(d);
        System.out.println(c);

        int x = 5;
        int y = 10;
        String str = (x > y ? "hello" : "bye");
        System.out.println(str);
        int z = 1;
        switch (z) {
            case 1:
                System.out.println("A");
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
        }

        String s = "100";
        s = s + 200;
        System.out.println(s);
        System.out.println("------------");

        int[] j = new int[3];
        boolean[] h = new boolean[3];
        System.out.println("j[0] = " + j[0] + ", h[0] = " + h[0]);

        int anh = 0;
        if (anh == 1) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
        System.out.println("C");

    }

}
