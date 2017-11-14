public class Osoba {

    private String imie;
    private String nazwisko;

    public Osoba()
    {

    }

    public Osoba(String imie, String nazwisko)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
    }

    public void WypiszInfo()
    {
        System.out.println("imię i nazwisko: "+imie+" "+nazwisko);
    }


}
