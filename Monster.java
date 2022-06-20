public class Monster {
    int hp;
    final int level = 10;

    char suffix;

    public void run() {
        System.out.println("小さいモンスター" + this.suffix + "は逃げ出した！");
    }
}
