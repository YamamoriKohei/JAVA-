class Person3 {
    public static int count = 0;
    public String firstName;
    public String lastName;  // lastNameフィールドの追加
    public int age;
    public double height, weight;

    // コンストラクタのオーバーロード
    Person3(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        Person3.count++;  // 人数をカウント
    }

    public String fullName() {
        return this.firstName + " " + this.lastName;
    }

    public void print() {
        System.out.println("名前は " + this.fullName() + " です");
        System.out.println("年は " + this.age + " です");
        System.out.println("BMIは " + this.bmi() + " です");
    }

    public double bmi() {
        return this.weight / (this.height * this.height);
    }

    public static void printCount() {
        System.out.println("合計 " + Person3.count + " 人です");
    }
}
