public class Zug {
    private Lokomotive lok;

    public Zug(Lokomotive lok){
        this.lok = lok;
    }

    public void wagenHinzufuegen(Wagen wagen){
        if (lok.getErsterWagen() == null) {
            lok.setErsterWagen(wagen);
        }
        else{
                Wagen aktuellerWagen = lok.getErsterWagen();
                while (aktuellerWagen.getNaechsterWagen() != null){ //!= ist ungleich etwas
                    aktuellerWagen = aktuellerWagen.getNaechsterWagen();
                }
                aktuellerWagen.setNaechsterWagen(wagen);
        }

    }
    public Wagen erstenWagenEntfernen(){
        if (lok.getErsterWagen() == null) {
            return null;
        }
        Wagen ersterWagen =lok.getErsterWagen();
        lok.setErsterWagen(ersterWagen.getNaechsterWagen());//erster Wagen aus Kette entfernen
        ersterWagen.setNaechsterWagen(null);//entfernter Wagen hat keinen nächsten Wagen
        return ersterWagen;
    }

    public void zugAnhaengen(Zug andererZug){
        Wagen letzterWagen = this.L ;
        if(letzterWagen == null){



        }

    }



    public int getWagenAnzahl(){
        int wagencounter = 0;
        Wagen aktuellerWagen = lok.getErsterWagen();
        while (aktuellerWagen != null){
            wagencounter++;
            aktuellerWagen = aktuellerWagen.getNaechsterWagen();
        }
        return wagencounter;
    }


    public int getKapazitaet(){
        int gesamtkapazitaet = 0;
        Wagen aktuellerWagen = lok.getErsterWagen();
        while (aktuellerWagen != null){
            gesamtkapazitaet += aktuellerWagen.getPersonenanzahl();
            aktuellerWagen = aktuellerWagen.getNaechsterWagen();
        }
        return gesamtkapazitaet;
    }

    public int getLaenge(){
        int gesamtLaenge = 0;
        Wagen aktuellerWagen = lok.getErsterWagen();
        gesamtLaenge = gesamtLaenge+lok.getLaenge();
        while (aktuellerWagen != null){
            gesamtLaenge += aktuellerWagen.getLaenge();
            aktuellerWagen = aktuellerWagen.getNaechsterWagen();
        }
        return gesamtLaenge;
    }

    public void info(){
        System.out.println("Zuginfo:");
        System.out.println("Anzahl der Wagen: " + getWagenAnzahl() + " Wagen");
        System.out.println("Gesamtlänge: " + getLaenge()  + " Meter");
        System.out.println("Passagierkapazität: " + getKapazitaet()  + " Personen");
        System.out.println("Der Zug besteht aus folgenden Einzelteilen:");
        System.out.println("Lokomotivenlänge: " + lok.getLaenge() + " Meter");
        System.out.println("Lokomotivenpassagierkapazität: " + lok.getPersonenanzahl() + " Personen");
        Wagen aktuellerWagen = lok.getErsterWagen();
        int wagennummer = 1;
        while (aktuellerWagen != null){
            System.out.println("Wagen: " + (wagennummer++) + " Länge: " + aktuellerWagen.getLaenge()
                    + " Personenkapazität: " + aktuellerWagen.getPersonenanzahl() );
            aktuellerWagen = aktuellerWagen.getNaechsterWagen();
        }

    }

}
