public class Wagen {
    private int laenge;
    private int personenanzahl;
    private Wagen naechsterWagen;

    public Wagen(int laenge, int personenanzahl){
        this.laenge =laenge;
        this.personenanzahl=personenanzahl;
    }


    public Wagen getNaechsterWagen() {
        return naechsterWagen;
    }

    public void setNaechsterWagen(Wagen naechsterWagen) {
        this.naechsterWagen = naechsterWagen;
    }

    public int getLaenge(){
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public int getPersonenanzahl() {
        return personenanzahl;
    }

    public void setPersonenanzahl(int personenanzahl){
        this.personenanzahl = personenanzahl;
    }
}
