public class Matango {
    private int hp;
    private final int LEVEL = 10;
    private char suffix;
    public char getSuffix() {
        return this.suffix;
    }
    public void setSuffix(char suffix) {// 妥当性チェック
        this.suffix = suffix;
    }
    public void run() {
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
    }
}