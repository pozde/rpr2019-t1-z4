package ba.unsa.etf.rpr;

public class Supermarket {

    Artikl[] artikli = new Artikl[1000];
    int prolaz=0;

    public void dodajArtikl(Artikl a) {
        prolaz=prolaz+1;
        artikli[prolaz]=new Artikl(a.getNaziv(),a.getCijena(),a.getKod());

    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0;i<prolaz;i++){
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
}
