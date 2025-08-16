package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
    public void setGivenName() {
    			// 姓は固定値として設定
        this.givenName = "太郎";
        
    }

    @Override
    public void eachIntroduce() {
        System.out.println("私はJavaが得意です");
    }
}