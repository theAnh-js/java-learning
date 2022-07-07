public class SuperHero0707 extends Hero0707 {
    boolean jp;

    public void jump() {
        this.jp = true;
        System.out.println("飛び上がった！");

    }

    public void land() {
        this.jp = false;
        System.out.println("着地した！");
    }

    // public void run() {
    // System.out.println(this.name + "は撤退!");
    // }
}
