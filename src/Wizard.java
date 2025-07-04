public class Wizard {
    int hp;
    int mp;
    String name;
    Wand wand;
    void heal(Hero h){
        int basepoint = 10;
        int recovPoint = (int)(basepoint * this.wand.power);
        h.setHp(h.getHp()+recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }
}
