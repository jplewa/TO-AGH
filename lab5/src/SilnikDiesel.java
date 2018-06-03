public class SilnikDiesel extends Silnik {

    private PojemnoscDiesela pojemnosc;

    public SilnikDiesel(float cena,String opis,PojemnoscDiesela pojemnosc){
        this.setCena(cena);
        this.setOpis(opis);
        this.setPojemnosc(pojemnosc);
    }

    public void setPojemnosc(PojemnoscDiesela pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public PojemnoscDiesela getPojemnosc(){return this.pojemnosc;}

    @Override
    public String toString() {
        return pojemnosc.getWartosc() + " diesel";
    }
}
