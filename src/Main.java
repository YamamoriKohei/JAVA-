

class Main {
    public static void main(String[] args) {
        // コンストラクタを使ってインスタンスを作成
        Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
        person1.print();

        Person person2 = new Person("山田", "花子", 22, 1.5, 40);
        person2.print();

        // Personクラスの静的メソッド printCount を呼び出して、作成されたインスタンスの数を表示
        Person.printCount();
    }
}
