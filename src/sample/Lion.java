package sample;

 public class Lion {
	private String name;
	private double length;
	private double speed;

	// コンストラクタ
	public Lion(String name, double length, double speed) {
		this.name = name;
		this.length = length;
		this.speed = speed;
	}

	// nameのgetter
	public String getName() {
		return name;
	}

	// nameのsetter
	public void setName(String name) {
		this.name = name;
	}

	// lengthのgetter
	public double getLength() {
		return length;
	}

	// lengthのsetter
	public void setLength(double length) {
		this.length = length;
	}

	// speedのgetter
	public double getSpeed() {
		return speed;
	}

	// speedのsetter
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public static void main(String[] args) {
		// Lionインスタンスの作成
		Lion lion = new Lion("ライオン", 2.1, 80.0);

		// 情報の出力
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");
	}
}
