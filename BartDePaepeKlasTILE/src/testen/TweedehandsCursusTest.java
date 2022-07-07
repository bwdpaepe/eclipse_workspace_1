package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Cursus;
import domein.TweedehandsCursus;

public class TweedehandsCursusTest
{
private TweedehandsCursus tc1, tc2, tc3;
    
    @BeforeEach
    public void setUp()
    {
        Cursus.setStudentenkorting(20);
        tc1 = new TweedehandsCursus("OOSD I", "Java How to program", 81, 15);
        tc2 = new TweedehandsCursus("IT Fundamentals", "Wiskunde voor IT", 35, 10);
        tc3 = new TweedehandsCursus("Databases", "Het SQL leerboek", 65, 80);
    }
    
    @Test
    public void maakTweedehandsCursus_alleParametersIngevuld_geldigeKortingVerkoper_constructieLukt()
    {
        Assertions.assertEquals("Java How to program", tc1.getTitel());
        Assertions.assertEquals(15, tc1.getKortingVerkoper());
    }
    
    @Test
    public void maakTweedehandsCursus_alleParametersIngevuld_grensgevalTeLaag_constructieLukt()
    {
        Assertions.assertEquals("Wiskunde voor IT", tc2.getTitel());
        Assertions.assertEquals(10, tc2.getKortingVerkoper());
    }
    
    @Test
    public void maakTweedehandsCursus_alleParametersIngevuld_grensgevalTeHoog_constructieLukt()
    {
        Assertions.assertEquals("Het SQL leerboek", tc3.getTitel());
        Assertions.assertEquals(80, tc3.getKortingVerkoper());
    }
    
    @Test
    public void maakTweedehandsCursus_alleParametersIngevuld_kortingVerkoperTeLaag_gooitException()
    {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new TweedehandsCursus("Web Development I", "Handboek HTML5 en CSS3", 90, 5));
    }    
    
    @Test
    public void maakTweedehandsCursus_alleParametersIngevuld_kortingVerkoperTeHoog_gooitException()
    {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new TweedehandsCursus("Web Development I", "Handboek HTML5 en CSS3", 90, 85));
    }
    
    @Test
    public void berekenPrijsNaKorting_prijs81_studentenkorting20procent_kortingVerkoper15procent_geeft55punt08()
    {
        Assertions.assertEquals(55.08, tc1.berekenPrijsNaKorting(), 0.01);
    }

    @Test
    public void toString_CursusOOSDIvan81euro_studentenkorting20procent_kortingVerkoper15procent_geeftCorrecteTekstweergave()
    {
        Assertions.assertEquals("TweedehandsCursus met titel \"Java How to program\" voor OOSD I wordt verkocht tegen 55,08 euro in plaats van 64,80 euro", tc1.toString());
    }
}