class Main3 {
    public static void main(String[] args) {
        Person3 person1 = new Person3("鈴木", "太郎", 20, 1.7, 60);
        person1.print();

        Person3 person2 = new Person3("山田", "花子", 22, 1.5, 40);
        person2.print();

        Person3.printCount();
    }
}
