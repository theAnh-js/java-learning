import javax.swing.text.html.StyleSheet;

public class Main0630 {
    public static void main(String[] args) {
        Sword s = new Sword();
        s.name = "Iron man's gun";
        s.damage = 10;

        // 私のヒーローは：
        Hero0630 myHero = new Hero0630();
        myHero.name = "Iron man";
        myHero.hp = 100;
        myHero.sword = s;

        // 戦い中：
        System.out.println("ヒーローは闘っている。");
        System.out.println("This weapon is " + myHero.sword.name);
        myHero.attack();
        System.out.println("Amazing good job my " + myHero.name + "!");
        myHero.backHome();

        // 成功したかどうか？
        System.out.println("闘いは終わったかな？");
        boolean isSuccess = false;
        if (!isSuccess) {
            System.out.println("Enemy is coming back");
            myHero.comeback();
            myHero.doubleAttack();
            System.out.println("Enemy mou shinde iru");

        } else {
            System.out.println("Enemy mou shinde iru!!!");
        }

        // Heroが何を食べたい？
        System.out.println("ヒーローは何を食べたい？");
        myHero.getFood("sushi");
        myHero.getFood("takoyaki");

        // Heroはもう眠たいかな？
        System.out.println("ヒーローは眠たいのか？");
        myHero.sleep(true);

        // 人々から見たHeroは：
        System.out.println("人々はヒーローのことをどう思っているか？");
        People someone = new People();
        someone.say(myHero.name, "cute");
        someone.say(myHero.name, "strong");
        someone.say(myHero.name, "nice guy");

        // 彼の趣味は：
        System.out.println("ヒーローの趣味は何か知ってる？");
        someone.think(myHero.name, "japanese foods");
        someone.think(myHero.name, "Coca-cola");
        someone.think(myHero.name, "sleeping");

        // Heroに会いたいのか？
        System.out.println("ヒーローに会いたいのか？");
        someone.wantTo(true);
        someone.wantTo(false);

    }
}
