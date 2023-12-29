
public class Hayvan {
   
    private String isim;
    private int kilo;
    private int boy;
    private int bacaksayisi;
    
    public Hayvan(String isim,int kilo,int boy,int bacaksayisi)
    {
        this.isim=isim;
        this.kilo=kilo;
        this.boy=boy;
        this.bacaksayisi=bacaksayisi;
    }
    
    public void yemekye()
    {
        System.out.println("Hayvan şu anda yemek yiyor...");
    }
    public void hareket(int hız)
    {
        System.out.println("Hayvan "+hız+"hız ile hareket ediyor...");
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the kilo
     */
    public int getKilo() {
        return kilo;
    }

    /**
     * @param kilo the kilo to set
     */
    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    /**
     * @return the boy
     */
    public int getBoy() {
        return boy;
    }

    /**
     * @param boy the boy to set
     */
    public void setBoy(int boy) {
        this.boy = boy;
    }

    /**
     * @return the bacaksayisi
     */
    public int getBacaksayisi() {
        return bacaksayisi;
    }

    /**
     * @param bacaksayisi the bacaksayisi to set
     */
    public void setBacaksayisi(int bacaksayisi) {
        this.bacaksayisi = bacaksayisi;
    }
    
    
}
