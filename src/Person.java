class Person {
    // クラスフィールド
    public static int count = 0;

    // インスタンスフィールド
    public String firstName;
    public String lastName; // 問題1: インスタンスフィールドに「lastName」を追加
    public int age;
    public double height;
    public double weight;

    // コンストラクタ1: lastNameを含む
    Person(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        Person.count++; // インスタンスが生成されるたびにカウントを増やす
    }

    // コンストラクタ2: lastNameを引数で受け取らない（オーバーロード）
    Person(String firstName, int age, double height, double weight) {
        this(firstName, "不明", age, height, weight); // デフォルトの lastName を "不明" に設定
    }

    // フルネームを返すメソッド
    public String fullName() {
        return this.firstName + " " + this.lastName;
    }

    // インスタンスの情報を出力するメソッド
    public void print() {
        System.out.println("名前は" + this.fullName() + "です");
        System.out.println("年は" + this.age + "です");
        System.out.println("BMIは" + this.bmi() + "です");
    }

    // BMI を計算するメソッド
    public double bmi() {
        return this.weight / (this.height * this.height);
    }

    // クラスメソッド: 合計人数を出力
    public static void printCount() {
        System.out.println("合計" + Person.count + "人です");
    }
}
