public class Laptop {
    
    private String merk;
    private String jenis;
    private String warna;
    
    public void harga(){
        System.out.println("\nharga laptop:");
    }

    public String getMerk() {
        return merk;
    }

    public String getJenis() {
        return jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public void tampilkandata(){
        System.out.println("merk laptop: "+getMerk());
        System.out.println("jenis laptop: "+getJenis());
        System.out.println("warna laptop: "+getWarna());
        
    }
    
    public void inputdata (String m, String j, String w){
        setMerk(m);
        setJenis(j);
        setWarna(w);
    }
}
