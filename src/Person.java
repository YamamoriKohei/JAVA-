class Person {
  // インスタンスフィールドを定義
  String name;
  int age;
  double height;
  double weight;  // weightフィールドを追加

  // コンストラクタを定義し、インスタンスフィールドに値をセット
  Person(String name, int age, double height, double weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
    count++;  // 人数をカウント
  }

  // BMIを計算して返すメソッド
  double bmi() {
    return this.weight / (this.height * this.height);
  }

  // インスタンスの情報を出力するメソッド
  void print() {
    System.out.println("名前は" + this.name + "です");
    System.out.println("年は" + this.age + "です");
    System.out.println("BMIは" + this.bmi() + "です");
  }

  // 人数をカウントするための静的変数
  static int count = 0;

  // 人数の合計を出力するメソッド
  static void printTotalCount() {
    System.out.println("合計" + count + "人です");
  }
}
