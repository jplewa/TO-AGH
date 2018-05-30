import java.util.HashSet;

public class Samochod {
    private Model model;
    private Silnik silnik;
    private HashSet<Podzespol> podzespoly;

    public Samochod(Model model, Silnik silnik, HashSet<Podzespol> podzespoly){
        this.setModel(model);
        this.setSilnik(silnik);
        this.podzespoly = podzespoly;
    }

    public Samochod(Model model, Silnik silnik){
        this.model = model;
        this.silnik = silnik;
        this.podzespoly = new HashSet<>();
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Silnik getSilnik() {
        return silnik;
    }

    public void setSilnik(Silnik silnik) {
        this.silnik = silnik;
    }

    public void dodajPodzespol(Podzespol podzespol){
        podzespoly.add(podzespol);
    }

    public float obliczCene(){
        float cena = silnik.getCena();
        cena += model.getCena();
        if(!podzespoly.isEmpty()){
            for(Podzespol podzespol : podzespoly){
                cena += podzespol.getCena();
            }
        }
        return cena;
    }

    public String pobierzOpis(){
        String opis = "Skonfigurowany pojazd typu ";
        if(model instanceof ModelA) opis = opis + "ModelA";
        else opis = opis + "ModelB";
        if(silnik instanceof SilnikDiesel) opis = opis + " z silnikiem " +  ((SilnikDiesel) silnik).getPojemnosc() + " diesel";
        else opis = opis + " z silnikiem " + ((SilnikBenzynowy) silnik).getPojemnosc() + " benzynowy";
        if(!podzespoly.isEmpty()){
            for(Podzespol podzespol : podzespoly){
                opis = opis + ", " + podzespol.getTyp();
            }
        }
        opis = opis + ". Cena pojazdu: " + obliczCene() + "zł.\n";
        return opis;
    }
}
