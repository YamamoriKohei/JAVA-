import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class animal {
    public static void main(String[] args) {
        // 動物の学名を辞書に保存
        Map<String, String> animalInfo = new HashMap<>();
        animalInfo.put("ライオン", "パンテラ レオ");
        animalInfo.put("ゾウ", "ロキソドンタ・サイクロティス");
        animalInfo.put("パンダ", "アイルロポダ・メラノレウカ");
        animalInfo.put("チンパンジー", "パン・トゥログロディテス");
        animalInfo.put("シマウマ", "チャップマンシマウマ");
        animalInfo.put("インコ", "不明");

        // コンソールに入力を促すメッセージを表示
        Scanner scanner = new Scanner(System.in);
        System.out.println("コンソールに文字を入力してください");
        String animalsData = scanner.nextLine();

        // 動物データを個別に分割
        String[] animals = animalsData.split(",");

        // 各動物の情報を処理
        for (String animal : animals) {
            // 動物の情報をさらに分割
            String[] details = animal.split(":");
            String name = details[0];
            String length = details[1];
            String speed = details[2];

            // 学名を辞書から取得
            String scientificName = animalInfo.get(name);

            // フォーマットしてコンソールに出力
            System.out.println("動物名：" + name);
            System.out.println("体長：" + length + "m");
            System.out.println("速度：" + speed + "km/h");
            System.out.println("学名：" + scientificName + "\n");
        }

        scanner.close();
    }
}
