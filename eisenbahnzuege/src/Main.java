public class Main {

    public static void main(String[] args) {
        Lokomotive lokomotive = new Lokomotive(15,10);
        Lokomotive lokomotive2 = new Lokomotive(15,5);
        Wagen wagen1 = new Wagen(20,110);
        Wagen wagen2 = new Wagen(30,100);
        Wagen wagen3 = new Wagen(40,90);
        Wagen wagen4 = new Wagen(20,110);
        Wagen wagen5 = new Wagen(30,100);
        Wagen wagen6 = new Wagen(40,90);


        Zug zug = new Zug(lokomotive);
        Zug zug2 = new Zug(lokomotive2);
        zug.wagenHinzufuegen(wagen1);
        zug.wagenHinzufuegen(wagen2);
        zug.wagenHinzufuegen(wagen3);
        zug2.wagenHinzufuegen(wagen4);
        zug2.wagenHinzufuegen(wagen5);
        zug2.wagenHinzufuegen(wagen6);
        zug.zugAnhaengen(zug2);
        zug.info();
        zug2.info();
        zug2.zugAnhaengen(zug);
        zug.info();
        zug2.info();
    }


}