class Main2 {
	public static void main(String[] args) {
		Person2 person1 = new Person2("鈴木太郎", 20, 1.7, 60);
		person1.print();

		Person2 person2 = new Person2("山田花子", 22, 1.5, 40);
		person2.print();

		// クラスメソッド printCount を呼び出して、合計人数を出力
		Person2.printCount();
	}
}
