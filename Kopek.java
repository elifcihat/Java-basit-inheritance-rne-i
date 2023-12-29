
public class Kopek extends Hayvan {
    
    private int dissayisi;
    public Kopek(String isim,int kilo,int boy,int bacaksayisi,int dissayisi)
    {
        super(isim,kilo,boy,bacaksayisi);
        this.dissayisi=dissayisi;
    }  
    
    public void kos(int hız)
    {
        System.out.println("Köpek koşuyor...");
        super.hareket(hız);
    }

    /**
     * @return the dissayisi
     */
    public int getDissayisi() {
        return dissayisi;
    }

    /**
     * @param dissayisi the dissayisi to set
     */
    public void setDissayisi(int dissayisi) {
        this.dissayisi = dissayisi;
    }
}
