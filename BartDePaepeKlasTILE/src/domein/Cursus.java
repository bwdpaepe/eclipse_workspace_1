package domein;

public class Cursus
{
    private String olod, titel;
    private int prijs;
    private static int studentenkorting;
    
    public Cursus(String olod, String titel, int prijs)
    {
        this.olod = olod;
        this.titel = titel;
        this.prijs = prijs;
    }

    public String getTitel()
    {
        return titel;
    }

    public static int getStudentenkorting()
    {
        return studentenkorting;
    }

    public static final void setStudentenkorting(int studentenkorting)
    {
        Cursus.studentenkorting = studentenkorting;
    }
    
    public double berekenPrijsNaKorting()
    {
        return prijs * (1 - studentenkorting/100.0);
    }
    
    @Override
    public String toString()
    {
        return String.format("%s met titel \"%s\" voor %s wordt verkocht tegen %.2f euro", this.getClass().getSimpleName(), titel, olod, berekenPrijsNaKorting());
    }
}
