public class Main {

    public static void main(String[] args) {
        Lokomotive lokomotive = new Lokomotive(15,10);
        Wagen wagen1 = new Wagen(15,100);
        Wagen wagen2 = new Wagen(15,100);
        Wagen wagen3 = new Wagen(15,100);

        Zug zug = new Zug(lokomotive);
        zug.wagenHinzufuegen(wagen1);
        zug.wagenHinzufuegen(wagen2);
        zug.wagenHinzufuegen(wagen3);
        zug.getWagenAnzahl();



    }


}