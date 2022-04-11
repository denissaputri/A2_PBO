public class acer extends Laptop {
    public void tampilkan(){
        String pemilik;
        
        pemilik = "caca";
        
        Laptop m = new Laptop();
        
        m.inputdata("aspire 14","tebal","hitam");
        m.tampilkandata();
        
        System.out.println("nama pemilik: "+pemilik);
    }
    
    public void harga(){
        System.out.println("harga laptop acer 6.000.000");
    }
    
}
