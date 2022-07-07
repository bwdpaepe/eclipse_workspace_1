package testen;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Cursus;
import domein.CursusRepository;
import domein.TweedehandsCursus;

public class CursusRepositoryTest
{
    private CursusRepository cr;
    private Cursus c1, c2;
    private TweedehandsCursus tc1, tc2, tc3, tc4;
    private List lijst;
    
    @BeforeEach
    public void setUp()
    {
        lijst = new ArrayList<>();
        
        Cursus.setStudentenkorting(25);
        
        c1 = new Cursus("OOSD I", "Java How to program", 81);
        c2 = new Cursus("Databases", "Principles of Database Management", 53);
        
        tc1 = new TweedehandsCursus("IT Fundamentals", "Wiskunde voor IT", 35, 10);
        tc2 = new TweedehandsCursus("Databases", "Het SQL leerboek", 65, 50);
        tc3 = new TweedehandsCursus("IT Fundamentals", "Wiskunde voor IT", 35, 15);
        tc4 = new TweedehandsCursus("Web Development I", "Handboek HTML5 en CSS3", 90, 30);

        lijst.add(tc4);
        lijst.add(c1);
        lijst.add(tc3);
        lijst.add(tc2);
        lijst.add(c2);
        lijst.add(tc1);
        
        cr = new CursusRepository(lijst);
    }
    
    @Test
    public void geefGoedkoopsteCursus_geeftCursusITFundamentalsMet15procentKortingTerug()
    {
        Assertions.assertEquals(tc3, cr.geefGoedkoopsteCursus());
    }
    
    @Test
    public void geefAantalTweedehandsCursussen_geeft4Terug()
    {
        Assertions.assertEquals(4, cr.geefAantalTweedehandsCursussen());    
    }
}