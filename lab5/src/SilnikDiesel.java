public class SilnikDiesel extends Silnik {
    public SilnikDiesel(float cena,String opis,PojemnoscDiesela pojemnosc){
        this.setCena(cena);
        this.setOpis(opis);
        this.setPojemnosc(pojemnosc);
    }
    private PojemnoscDiesela pojemnosc;

    public void setPojemnosc(PojemnoscDiesela pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public PojemnoscDiesela getPojemnosc() {
        return pojemnosc;
    }
}
