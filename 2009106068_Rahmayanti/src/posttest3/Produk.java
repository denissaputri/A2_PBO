/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest3;


//posttest 3 enkapsulasi dan setter getter
/**
 *
 * @author ASUS
 */
public class Produk {
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    private String nama; //enkapsulasi
    private int harga;
    private String ukuran;
    private int id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getUkuran() {
        return ukuran;
    }
}


