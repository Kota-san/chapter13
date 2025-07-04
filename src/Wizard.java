public class Wizard {
    private int hp;
    private int mp;
    private String name;
    Wand wand;

    public void setName(String name) {// 妥当性チェック
        if (name == null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        if (name.length() <= 2) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
        }
        this.name = name;
    }
    public void setHp(int hp) {// 妥当性チェック
        if (hp <= 0) {
            hp = 0;
        }
        this.hp = hp;
    }

    public void setMp(int mp) {// 妥当性チェック
        if (mp <= 0) {
            mp = 0;
        }
        this.mp = mp;
    }
    void heal(Hero h){
        int basepoint = 10;
        int recovPoint = (int)(basepoint * this.wand.power);
        h.setHp(h.getHp()+recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }
}
