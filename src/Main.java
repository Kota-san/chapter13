public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.setName("ミナト");
        int n = h.getHp();
        h.setHp(40);
        King k = new King();
        Inn i = new Inn();
        Matango m = new Matango();
        m.setSuffix('A');

        System.out.println(h.getName() + "の現在のHP：" + h.getHp());
        k.talk(h);
        i.checkIn(h);
        System.out.println(h.getName() + "の現在のHP：" + h.getHp());
        h.sleep();
        h.attack(m);
    }
}