package depo05;

public class Depo {
    private int id;
    private String urunAdi;
    private String uretici;
    private String birim;
    private int miktar = 0;
    private String raf = "-";
    public Depo(String urunAdi, String uretici, String birim) {
        this.urunAdi = urunAdi;
        this.uretici = uretici;
        this.birim = birim;
    }
    public String getUrunAdi() {
        return urunAdi;
    }
    public String getUretici() {
        return uretici;
    }
    public String getBirim() {
        return birim;
    }
    public int getMiktar() {
        return miktar;
    }
    public void setMiktar(int miktar) {
        if (this.miktar<-miktar){
            System.out.println("Yeterli Ürün Yok!");
        }else {
            this.miktar += miktar;
        }
    }
    public String getRaf() {
        return raf;
    }
    public void setRaf(String raf) {
        this.raf = raf;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Depo{" +
                ", urunAdi='" + urunAdi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", birim='" + birim + '\'' +
                ", miktar=" + miktar +
                ", raf='" + raf + '\'' +
                '}';
    }
}
