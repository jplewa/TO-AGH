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
    // Zmieniliśmy nazwę z pobierzOpis na toString, żeby uniknąć pomyłki z getOpis i setOpis
    // Oprócz tego dodaliśmy metody toString() w poszczególnych częściach samochodu.
    public String toString(){
        StringBuilder opis = new StringBuilder("Skonfigurowany pojazd typu ");
        opis.append(model);
        opis.append(" z silnikiem ");
        opis.append(silnik);
        if(!podzespoly.isEmpty()){
            for(Podzespol podzespol : podzespoly){
                opis.append(", ");
                opis.append(podzespol);
            }
        }
        opis.append(". Cena pojazdu: ");
        opis.append(String.format("%.2f", obliczCene()));
        opis.append("zł.");
        return opis.toString();
    }
}
