package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private Korpa korpa;
    private Artikl artikl;


    @Test
    void testDodajUKorpu(){
        korpa = new Korpa();
        artikl = new Artikl("prvi",100,"5678");
        boolean mozeDodati = korpa.dodajArtikl(artikl);
        assertTrue(mozeDodati);
    }

    @Test
    void tacnostDodanogArtiklaUKorpi() {
        korpa = new Korpa();
        artikl = new Artikl("prvi",100,"5678");
        korpa.dodajArtikl(artikl);
        assertEquals(artikl.getNaziv(),"prvi","Istog su imena");
    }

    @Test
    void testDodajArtiklUPunuKorpu() {
        korpa = new Korpa();
        artikl = new Artikl("prvi",100,"5678");
        for(int i=0;i<50;i=i+1){
            Artikl novi = new Artikl("ime",1000,String.valueOf(i));
            korpa.dodajArtikl(novi);
        }
        Artikl temp = new Artikl("lap",1555,"12ac");
        boolean mozeDodati = korpa.dodajArtikl(temp);
        assertAll("Korpa je vec popunjena",
                () -> assertFalse(mozeDodati)
                );
    }
}