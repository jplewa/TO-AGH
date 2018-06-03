public enum PojemnoscBenzynowego {
    Poj1_0(1.0f),
    Poj1_2(1.2f),
    Poj1_4(1.4f),
    Poj1_6(1.6f);

    private final float pojemnosc;

    PojemnoscBenzynowego(float pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public float getWartosc() {
        return pojemnosc;
    }
}
