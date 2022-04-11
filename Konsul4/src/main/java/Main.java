public class Main {
    
    public static void main(String[] args) {
        System.out.println("Asus");
        
        asus h = new asus();
        h.tampilkan();
        
        System.out.println("\nAcer");
        
        acer c = new acer();
        c.tampilkan();
    
    Laptop LAPTOP = new Laptop();
    asus ASUS = new asus();
    acer ACER = new acer();
    
    LAPTOP.harga();
    
    LAPTOP = ASUS;
    LAPTOP.harga();
    
    LAPTOP = ACER;
    LAPTOP.harga();
    
}
}
        

