package live.denisdev;

public class Main {
    public static void main(String[] args) {
        ArrayGenerico<Infisso> infissi = new ArrayGenerico<Infisso>();
        ArrayGenerico<Mobile> mobili = new ArrayGenerico<Mobile>();
        infissi.add(new Infisso("legno", 1.2, 1.5));
        mobili.add(new Mobile(2.5, 1.8));
        infissi.add(new Infisso("alluminio", 4, 3));
        mobili.add(new Mobile(3.5, 2.2));
        System.out.println(infissi.stampa());
        System.out.println(mobili.stampa());
        System.out.println(infissi.cerca(new Infisso("legno", 1.2, 1.5)));
        System.out.println(mobili.cerca(new Mobile(3.5, 2.2)));
    }
}