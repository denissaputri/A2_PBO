public class asus extends Laptop {
    public void tampilkan(){
        String pemilik="hada";
        
        Laptop m = new Laptop();
        
        m.inputdata("M409D","slim","abu-abu");
        m.tampilkandata();
        
        System.out.println("nama pemilik: "+pemilik);
    }
    
    public void harga(){
        System.out.println("harga laptop asus 7.000.000");
    }
    
}
