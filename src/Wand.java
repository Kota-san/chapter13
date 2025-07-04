public class Wand {
    private String name;
    double power;

    public void setName(String name) {// 妥当性チェック
        if (name == null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        if (name.length() <= 2) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
        }
        this.name = name;
    }
}
