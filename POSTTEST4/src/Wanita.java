
public class Wanita extends Masyarakat {
    private String Nama;

    public Wanita(String Nama, String nama, String alamat, String laporan) {
        super(nama, alamat, laporan);
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
   
//Override
public void display() {
        System.out.println("nama    : " + this.nama);
        System.out.println("alamat  : " + this.alamat);
        System.out.println("laporan : " + this.laporan);
        
    }
}

