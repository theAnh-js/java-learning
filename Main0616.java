public class Main0616 {
    public static void main(String[] args) {
        // 勇者
        Hero h = new Hero();

        h.name = "ironMan";
        h.hp = 100;

        // モンスター
        Monster m1 = new Monster();
        m1.hp = 50;
        m1.suffix = '1';
        Monster m2 = new Monster();
        m2.hp = 48;
        m2.suffix = '2';

        // 物語
        System.out.println("勇者" + h.name + "が生まれた！");
        m1.run();
        m2.run();
        h.slip();
        h.sit(3);
        h.run();
    }
}
