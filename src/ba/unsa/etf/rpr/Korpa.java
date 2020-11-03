package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private int prolaz=0;

    public int dajUkupnuCijenuArtikala() {
        int cijena=0;
        for(int i=0;i<prolaz;i=i+1){
            cijena = cijena + artikli[i].getCijena();
        }
        return cijena;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0;i<prolaz;i=i+1){
            if(artikli[i].getKod().equals(kod)){
                Artikl zamjena=new Artikl(artikli[i].getNaziv(),artikli[i].getCijena(),artikli[i].getKod());
                for(int j=0;j<prolaz;j=j+1){
                    artikli[j]=artikli[j+1];
                }
                prolaz=prolaz-1;
                return  zamjena;
            }
        }
        return null;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public boolean dodajArtikl(Artikl a) {
        if(prolaz>50)
                return false;
        artikli[prolaz]=new Artikl(a.getNaziv(),a.getCijena(),a.getKod());
        prolaz=prolaz+1;

        return true;
    }
}
