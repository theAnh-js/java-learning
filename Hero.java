public class Hero {
    String name;
    int hp;

    public void sleep() {
        this.hp = 100;
        System.out.println(this.name);
    }

    public void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した");
    }

    public void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ！");
        System.out.println("5ダメージ!");
    }

    public void run() {
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("gameover");
        System.out.println("最終HPは" + this.hp + "でした");
    }

}
