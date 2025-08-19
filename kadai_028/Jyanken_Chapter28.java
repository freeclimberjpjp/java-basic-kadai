package kadai_028;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter28 {
    // じゃんけんの手を表す配列
    private static final String[] HANDS = {"r", "s", "p"};
    private static final Map<String, String> HANDS_MAP = new HashMap<>();
    static {
        HANDS_MAP.put("r", "グー");
        HANDS_MAP.put("s", "チョキ");
        HANDS_MAP.put("p", "パー");
    }

    // 自分のじゃんけんの手を入力する
    public String getMyChoice(Scanner scanner) {
        String input;
        while (true) {
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");
            input = scanner.nextLine().trim().toLowerCase();
            if (HANDS_MAP.containsKey(input)) {
                break;
            } else {
                System.out.println("正しい手を入力してください（r, s, p）");
            }
        }
        return input;
    }

    // 対戦相手のじゃんけんの手を乱数で選ぶ
    public String getRandom() {
        // Math.random()とMath.floor()を使って乱数を生成
        int idx = (int)Math.floor(Math.random() * HANDS.length);
        return HANDS[idx];
    }

    // じゃんけんを行う
    public void playGame(String myHand, String enemyHand) {
        System.out.println("自分の手は" + HANDS_MAP.get(myHand) + ",対戦相手の手は" + HANDS_MAP.get(enemyHand));
        if (myHand.equals(enemyHand)) {
            System.out.println("あいこです");
        } else if ((myHand.equals("r") && enemyHand.equals("s")) ||
                   (myHand.equals("s") && enemyHand.equals("p")) ||
                   (myHand.equals("p") && enemyHand.equals("r"))) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}