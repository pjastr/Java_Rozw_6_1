public class Student extends Osoba {
    private int rok;
    private int numerGrupy;
    private int numerAlbumu;

    public Student()
    {

    }

    public Student(String imie, String nazwisko, int rok, int numerGrupy, int numerAlbumu)
    {
        super(imie,nazwisko);
        this.rok=rok;
        this.numerGrupy=numerGrupy;
        this.numerAlbumu=numerAlbumu;
    }

    @Override
    public void WypiszInfo()
    {
        super.WypiszInfo();
        System.out.println("rok: "+rok);
        System.out.println("numer grupy: "+numerGrupy);
        System.out.println("numer albumu: "+numerAlbumu);
    }
}
