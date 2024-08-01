package character;

public class Character {
    private String name;
    private int hp;
    private int mp;
    private int attack;
    private int speed;
    private int defense;

    public Character(String name) {
        this.name = name;
        // ランダムな数値を生成するためのMath.random()を使用
        this.hp = (int) (Math.random() * 1000);
        this.mp = (int) (Math.random() * 1000);
        this.attack = (int) (Math.random() * 1000);
        this.speed = (int) (Math.random() * 1000);
        this.defense = (int) (Math.random() * 1000);
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getAttack() {
        return attack;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDefense() {
        return defense;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
