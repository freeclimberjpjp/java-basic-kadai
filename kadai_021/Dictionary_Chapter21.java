package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
    // 英単語の辞書として機能するHashMap
    private HashMap<String, String> dictionary;

    public Dictionary_Chapter21() {
        dictionary = new HashMap<>();
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    // 指定した英単語の意味を調べて返すメソッド
    public String searchWord(String word) {
        return dictionary.get(word);
    }

    // 指定した英単語が辞書に存在するか判定するメソッド
    public boolean containsWord(String word) {
        return dictionary.containsKey(word);
    }

    

    // 配列で複数の英単語をまとめて調べて出力するメソッド（referer）
    public void referer(String[] words) {
        for (String word : words) {
            if (containsWord(word)) {
                System.out.println(word + "：" + searchWord(word));
            } else {
                System.out.println(word + "は辞書に存在していません");
            }
        }
    }

    // ...今後のメソッド追加用...
}