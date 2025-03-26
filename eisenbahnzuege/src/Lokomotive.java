public class Lokomotive {
    private int laenge;
    private int personenanzahl;
    private Wagen  ersterWagen;


    public Lokomotive(int laenge, int personenanzahl){
        this.laenge = laenge;
        this.personenanzahl = personenanzahl;
    }

    public int getLaenge(){
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }


    public int getPersonenanzahl(){
        return personenanzahl;
    }

    public void setPersonenanzahl(int personenanzahl){
        this.personenanzahl = personenanzahl;
    }

    public Wagen getErsterWagen(){
        return ersterWagen;
    }

    public void setErsterWagen(Wagen ersterWagen) {
        this.ersterWagen = ersterWagen;
    }
}
