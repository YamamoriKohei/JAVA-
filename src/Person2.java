class Person2 {
    public String name;
    public int age;
    public double height;
    public double weight;

    // クラスフィールドとして人数をカウントする count を定義
    public static int count = 0;

    // コンストラクタ
    Person2(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        
        // 新しい Person2 が作られるたびに count をインクリメント
        count++;
    }

	// BMIを計算して返すメソッド
	double bmi() {
		// 小数点以下第1位を切り捨て、かつ小数点以下1桁が0となるようにする
		return Math.floor(this.weight / (this.height * this.height));
	}

    // 人の詳細を出力するメソッド
    public void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "才です");
        System.out.println("BMIは" + this.bmi() + "です");
    }

    // 合計人数を出力するクラスメソッド
    public static void printCount() {
        System.out.println("合計" + count + "人です");
    }
}
