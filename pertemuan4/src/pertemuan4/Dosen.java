/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;


public class Dosen {
//    private String nama, nip, jeniskelamin, alamat;
    private String nip;
    
//    constructor
    public Dosen(String nama, String nip, String jeniskelamin,String alamat){
//        this.nama = nama;
//        this.nip = nip
//        this.jeniskelamin = jeniskelamin;
//        this.alamat = alamat;
        super(nama, jeniskelamin, nip, alamat);
            
        
    
}
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getnip){
        return nip;
    }

    public void setNim(String nim) {
        this.nip = nip;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
        
    

    
    
    
}
