public class Main0602 {
    public static void main(String[] args) {
        hello("Mr.john");
        hello("Ms.peter");
        hello("Mr.bean");
        System.out.println("--------------");

        add(100, 200);
        add(100, 50);
        System.out.println("--------------");

        int answer = addTen(5);
        System.out.println("answer is: " + answer);
        System.out.println("--------------");

        int ans = sum(100, 10);
        System.out.println("100+10 equal to " + ans);
        System.out.println("--------------");

        System.out.println(total(3.5, 6));
        System.out.println(total(3, 6, 10));
        System.out.println("--------------");

        int a = 10;
        int b = 5;
        int total = Main062.tasu(a, b);
        int delta = Main062.hiku(a, b);
        System.out.println("total is " + total + " and delta is " + delta);

    }

    // with paramester is string
    public static void hello(String name) {
        System.out.println("Hello " + name + ",Have a nice day!");
        goodbye(name);
    }

    public static void goodbye(String name) {
        System.out.println("Goodbye" + name);
    }

    // with paramestera is number:
    public static void add(int x, int y) {
        int ans = x + y;
        System.out.println(x + "+" + y + "=" + ans);
    }

    public static int addTen(int value) {
        return value + 10;
    }

    public static int sum(int x, int y) {
        int result = x + y;
        return result;
    }

    public static double total(double x, double y) {
        return x + y;
    }

    public static int total(int x, int y, int z) {
        return x + y + z;
    }

}
