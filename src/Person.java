class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;

	// コンストラクタを定義し、インスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++; // 人数をカウント
	}

	// BMIを計算して返すメソッド
	double bmi() {
		// 小数点以下第1位を切り捨て、かつ小数点以下1桁が0となるようにする
		return Math.floor(this.weight / (this.height * this.height));
	}

	// インスタンスの情報を出力するメソッド
	void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + this.bmi() + "です");
		System.out.println();
	}

	// 人数をカウントするための静的変数
	static int count = 0;

	// 人数の合計を出力するメソッド
	static void printTotalCount() {
		System.out.println("合計" + count + "人です");
	}

}
