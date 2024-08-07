package basicClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Java_29_main {
	public static void main(String[] args) {
		// 都道府県情報の配列
		Java_29_prefecture[] prefectures = {
				new Java_29_prefecture("北海道", "札幌市", 83424),
				new Java_29_prefecture("青森県", "青森市", 9646),
				new Java_29_prefecture("岩手県", "盛岡市", 15275),
				new Java_29_prefecture("宮城県", "仙台市", 7282),
				new Java_29_prefecture("秋田県", "秋田市", 11638),
				new Java_29_prefecture("山形県", "山形市", 9323),
				new Java_29_prefecture("福島県", "福島市", 13784),
				new Java_29_prefecture("茨城県", "水戸市", 6097),
				new Java_29_prefecture("栃木県", "宇都宮市", 6408),
				new Java_29_prefecture("群馬県", "前橋市", 6362),
				new Java_29_prefecture("埼玉県", "さいたま市", 3798)
		};

		// コンソールに入力を促すメッセージを表示
		Scanner scanner = new Scanner(System.in);
		System.out.println("コンソールに数字と昇順・降順の値を入力してください（例：8,5,9 asc/desc）");
		String input = scanner.nextLine();
		scanner.close();

		// 入力の解析
		String[] parts = input.split(" ");
		String[] indicesStr = parts[0].split(",");
		String order = parts[1];

		// 入力されたインデックスを整数に変換
		int[] indices = new int[indicesStr.length];
		for (int i = 0; i < indicesStr.length; i++) {
			indices[i] = Integer.parseInt(indicesStr[i]);
		}

		// 指定されたインデックスの都道府県を抽出
		Java_29_prefecture[] selectedPrefectures = new Java_29_prefecture[indices.length];
		for (int i = 0; i < indices.length; i++) {
			selectedPrefectures[i] = prefectures[indices[i]];
		}

		// ソート
		if (order.equalsIgnoreCase("asc")) {
			Arrays.sort(selectedPrefectures, Comparator.comparing(Java_29_prefecture::getName));
		} else if (order.equalsIgnoreCase("desc")) {
			Arrays.sort(selectedPrefectures, Comparator.comparing(Java_29_prefecture::getName).reversed());
		}

		// 結果をコンソールに出力
		for (Java_29_prefecture p : selectedPrefectures) {
			System.out.println(p);
		}
	}
}
