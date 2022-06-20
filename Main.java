public class Main {
    public static void main(String[] args) {
        System.out.println(5 / 2);
        System.out.println(10 % 3);

        // if...else
        int i = 2;
        i *= 3;
        System.out.println(i);
        int a = 0;
        if (a == 1) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }

        // switch case:
        int b = 13;
        switch (b) {
            case 1:
                System.out.println("A");
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("no invalid value");
        }

        // loop:
        for (int j = 0; j <= 6; j += 2) {
            System.out.println("LOOP");
        }
    }
}
/**
 * javac Main.java
 * java Main
 */