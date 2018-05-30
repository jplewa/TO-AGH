public class Podzespol {
    private float cena;
    private String opis;
    private Typ typ;

    public Podzespol(float cena, String opis, Typ typ){
        this.setCena(cena);
        this.setOpis(opis);
        this.setTyp(typ);
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Typ getTyp() {
        return typ;
    }

    public void setTyp(Typ typ) {
        this.typ = typ;
    }
}
