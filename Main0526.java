public class Main0526 {

    // Thứ tự gọi các method: luôn gọi từ hàm main.

    public static void main(String[] args) {
        /**
         * int[] scores;
         * scores = new int[5];
         * int num = scores.length;
         * scores[0] = 10;
         * scores[1] = 100;
         * scores[2] = 1000;
         * scores[3] = 10000;
         * scores[4] = 100000;
         * System.out.println("Length is: " + num);
         * for(int i = 0; i < num; i++){
         * System.out.println(scores[i]);
         * }
         */

        /**
         * 
         * int[] scores = {10,20,25,30,40,50,50,60,70,80};
         * int count = 0;
         * int ucount = 0;
         * int equal = 0;
         * for(int i = 0; i < scores.length; i++){
         * System.out.println(scores[i]);
         * 
         * if(scores[i] > 50) count++;
         * if(scores[i] < 50) ucount++;
         * if(scores[i] == 50) equal++;
         * 
         * 
         * }
         * System.out.println("There are " + count + " scores over 50");
         * System.out.println("There are " + ucount + " scores less than 50");
         * System.out.println("There are " + equal + " scores less than 50");
         */

        /**
         * 
         * int[][] scores = new int[2][3];
         * scores[0][0] = 40;
         * scores[0][1] = 50;
         * scores[0][2] = 60;
         * scores[1][0] = 80;
         * scores[1][1] = 60;
         * scores[1][2] = 70;
         * System.out.println(scores[1][1]);
         * 
         * int[] point = new int[4];
         * point[0] = 4;
         * double[] weights = new double[4];
         * weights[0] = 5.4;
         * boolean[] answers = new boolean[3];
         * answers[0] = true;
         * String[] names = new String[3];
         * names[0] = "java";
         * System.out.println(point[0]);
         * System.out.println(weights[0]);
         * System.out.println(answers[0]);
         * System.out.println(names[0]);
         */

        printHello();

        System.out.println("メソッドを呼び出しますね");
        hello();
        goodbye();
        System.out.println("メソッドの呼び出しが終わりましたよ");

        methodA();
    }

    static void printHello() {
        String a = "Hello!";
        System.out.println(a);
    }

    public static void hello() {
        System.out.println("こんにちは！");
    }

    public static void goodbye() {
        System.out.println("またね！");
    }

    public static void methodA() {
        System.out.println("i am A from Main");
        methodB();
    } // 1 method // function

    public static void methodB() {
        System.out.println("i am B from A");
    }

}