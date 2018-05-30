public abstract class Model {
    private float cena;
    private String opis;

    public Model(float cena, String opis){
        this.cena = cena;
        this.opis = opis;
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
}
