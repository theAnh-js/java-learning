public class Main0512{
    public static void main(String[] args){
        int fortune = 50;
        switch(fortune){
            case 1: 
                System.out.println("Good");
                break;
            case 2: 
            case 3: 
                System.out.println("So so");
                break;
            case 4: 
            case 5: 
                System.out.println("Bad");
                break;
            default:
                System.out.println("Invalid mark");

        }
    }
}