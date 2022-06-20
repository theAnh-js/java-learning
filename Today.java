public class Today{
    public static void main(String[] args){
        boolean tenki = true;
        int ondo = 35;
        if(tenki == true){
            if(ondo > 30){
                System.out.println("洗濯をします");
            }else{
                System.out.println("散歩に行きます");
            }
        }else{
            System.out.println("DVDを見ます");
        }
    }
}
