public enum PojemnoscDiesela {
    Poj1_6(1.6f),
    Poj1_9(1.9f);

    private final float pojemnosc;

    PojemnoscDiesela(float pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public float getWartosc() {
        return pojemnosc;
    }
}
