class Main {
    public static void main(String[] args){
        Samochod sA = new Samochod(
                new ModelA(23456.78f, "model"),
                new SilnikDiesel(23456.78f, "silnik", PojemnoscDiesela.Poj1_6));
        System.out.println(sA);
        sA.dodajPodzespol(new Podzespol(567.89f, "klimatyzacja", Typ.klimatyzacja));
        System.out.println(sA);
        sA.dodajPodzespol(new Podzespol(345.67f, "nawigacja!!!", Typ.nawigacja));
        System.out.println(sA);
        Samochod sB = new Samochod(
                new ModelB(23456.78f, "model"),
                new SilnikBenzynowy(23456.78f, "silnik", PojemnoscBenzynowego.Poj1_2));
        System.out.println(sB);
        sB.dodajPodzespol(new Podzespol(567.89f, "klimatyzacja", Typ.klimatyzacja));
        System.out.println(sB);
        sB.dodajPodzespol(new Podzespol(345.67f, "nawigacja!!!", Typ.nawigacja));
        System.out.println(sB);
    }
}
