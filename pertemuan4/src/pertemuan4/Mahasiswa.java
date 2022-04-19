/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;


public class Mahasiswa extends Manusia {
    private String nim;
    
    private String nama, nim, jeniskelamin, alamat;
    
//    constructor
    public Mahasiswa(String nama, String nim, String jeniskelamin,String alamat){
        super(nama, jeniskelamin, alamat);
//        this.nama = nama;
        this.nim = nim;
//        this.jeniskelamin = jeniskelamin;
//        this.alamat = alamat;
        
    
}
    
//    public String getNama() {
//        return nama;
//    }
//
//    public void setNama(String nama) {
//        this.nama = nama;
//    }
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

//    public String getJeniskelamin() {
//        return jeniskelamin;
//    }
//
//    public void setJeniskelamin(String jeniskelamin) {
//        this.jeniskelamin = jeniskelamin;
//    }
//
//    public String getAlamat() {
//        return alamat;
//    }
//
//    public void setAlamat(String alamat) {
//        this.alamat = alamat;
//    }
}  
    

    
    
    
}
