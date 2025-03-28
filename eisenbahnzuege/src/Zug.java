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

}
