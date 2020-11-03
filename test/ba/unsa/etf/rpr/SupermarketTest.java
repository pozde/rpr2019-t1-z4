package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    private Korpa korpa;
    private Artikl artikl;

    @BeforeEach
    void set(){
        korpa = new Korpa();
        artikl = new Artikl("drugi",200,"ab34");
    }

    @Test
    void dodajArtikl() {
        boolean dodavanje = korpa.dodajArtikl(artikl);
        assertTrue(dodavanje);
    }

    @Test
    void izbaciArtiklSaKodom() {
        korpa.dodajArtikl(artikl);
        Artikl izbaceniArtikl = korpa.izbaciArtiklSaKodom("ab34");
        assertAll("izbacivanje artikla",
                () -> assertEquals(artikl.getKod(),izbaceniArtikl.getKod())
        );
    }
}