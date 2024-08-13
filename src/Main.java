class Main {
	public static void main(String[] args) {
		// 問題5: Main.javaの引数にweightの60を追加
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		// インスタンスフィールドの値を出力
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);
		System.out.println();

		// 問題8・9: person1の情報を出力
		person1.print();

		// 問題10: 人数の合計を出力
		Person.printTotalCount();
	}
}
