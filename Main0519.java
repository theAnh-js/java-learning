public class Main0519{
    public static void main(String[] args){
        // for(int i = 0; i < 10; i++){
        //     System.out.println("こんにちは");
        //     System.out.println("iの値は: " + i);
        // }

        // for(int i = 0; i < 10; i++){
        //     System.out.print("現在" + (i + 1) + "週目->");
        // }

        // for(int i = 1; i < 10; i++){
        //     for(int j = 1; j < 10; j++){
        //         System.out.print(i * j);
        //         System.out.print(" ");
        //     }
        //     System.out.println(" ");       
        // }

        // int num = 10;
        // while(num > 0){
        //     System.out.println("numの値は: " + num);
        //     num--;
        // }
        for(int i = 1; i <= 10; i++) {
            System.out.println("knock " + i + " time.");
        }
        System.out.println("------------separate------------");
        for(int i = 0; i < 10; i++) {
            System.out.println("knock " + (i + 1) + " time.");
        }

        System.out.println("------------separate------------");
        for(int i = 10; i > 0; i--){
            System.out.println("countdown " + i + " time.");
        }

        for(int i = 1; i <= 40; i++){
            if((i % 4) == 0){
                System.out.println(i + " は4の倍数です。");
            }
        } 
        System.out.println("------------separate------------");
        for(int i = 0; i <= 40; i+=4){
            if((i % 4) == 0 && i != 0){
                System.out.println(i + " は4の倍数です。");
            }
        } 

        int month = 11;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                for(int i = 1; i <= 31; i++){
                    System.out.println("It is " + i + " date of " + month + "月");
                }
                break;
            case 2:
                 for(int i = 1; i <= 29; i++){
                    System.out.println("It is " + i + " date of 2月");
                }
                break;
            default:
                for(int i = 1; i <= 30; i++){
                    System.out.println("It is " + i + " date of " + month + "月");

                }

        }
    }

}