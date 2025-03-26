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
        int passagierkapazität = 0;
        Wagen aktuellerWagen = lok.getPersonenanzahl();
        
    }


}
