public class Mikuji {
    public static void main(String[] args) {
        System.out.println("今から、占ってみましょう！");
        int forture = new java.util.Random().nextInt(4) + 1;
        if (forture == 1) {
            System.out.println("大吉");
        } else if (forture == 2) {
            System.out.println("中吉");
        } else if (forture == 3) {
            System.out.println("吉");
        } else {
            System.out.println("凶");
        }
        System.out.println("おみくじが終わりました！");
    }
}