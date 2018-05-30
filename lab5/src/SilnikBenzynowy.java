public class SilnikBenzynowy extends Silnik {
    private PojemnoscBenzynowego pojemnosc;
    public SilnikBenzynowy(float cena,String opis,PojemnoscBenzynowego pojemnosc){
        this.setCena(cena);
        this.setOpis(opis);
        this.setPojemnosc(pojemnosc);
    }

    public void setPojemnosc(PojemnoscBenzynowego pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public PojemnoscBenzynowego getPojemnosc() {
        return pojemnosc;
    }
}
