package character;

public class Hero extends Character {

    public Hero(String name) {
        super(name);
    }

    public void displayStatus() {
        System.out.println("こんにちは「" + getName() + "」さん");
        System.out.println("ステータス");
        System.out.println("HP：" + getHp());
        System.out.println("MP：" + getMp());
        System.out.println("攻撃力：" + getAttack());
        System.out.println("素早さ：" + getSpeed());
        System.out.println("防御力：" + getDefense());
        System.out.println("\nさあ冒険に出かけよう！");
    }
}
