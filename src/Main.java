public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.setName("ミナト");
        int n = h.getHp();
        h.setHp(40);

        System.out.println(h.getName() + "の現在のHP：" + h.getHp());
        King k = new King();
        k.talk(h);
        Inn i = new Inn();
        i.checkIn(h);
        System.out.println(h.getName() + "の現在のHP：" + h.getHp());
        h.sleep();
        Matango m = new Matango();
        m.suffix = 'A';
        h.attack(m);
    }
}