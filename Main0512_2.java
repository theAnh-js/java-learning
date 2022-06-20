public class Main0512_2{
    public static void main(String[] args){
        int mark = 10;
        switch(mark){
            case 0:
                System.out.println("Bad");
            case 1:
                System.out.println("So so");
            case 2: 
                System.out.println("No bad");
            case 3: 
                System.out.println("Good");
            default: 
                System.out.println("Invalid mark, please input valid mark again");
        }
        int temp = 28;
        int time = 0;
        while(temp > 25){
            temp--;
            time++;
            System.out.println(time + "回目は" + temp + "度ですね");
        }
        System.out.println(temp + "まで下がりましたよ");
    }


}