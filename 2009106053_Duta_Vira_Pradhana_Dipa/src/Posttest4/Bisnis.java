/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest4;

/**
 *
 * @author HP
 */
public class Bisnis extends Tiket_Pesawat{ // Child Class
    private String fasilitas;
    int biaya_tambah;

    public Bisnis(String asal, String tujuan, String nama, int harga, int tanggal) {
        super(asal, tujuan, nama, harga, tanggal);
        this.fasilitas = "\n| -Meals on Board Premium\n| -Free WiFi\n| -Bagasi 30Kg\n| -Seat Premium";
        this.biaya_tambah = 1000000;
    }
    
        @Override
        void BerhasilPesan() {
        System.out.println("\n*================================*");
        System.out.println("| Tiket Atas Nama : " + this.nama);
        System.out.println("| Kelas Tiket     : Bisnis ");
        System.out.println("| Dengan Rute     : \n| \t" + this.asal + " -> " + this.tujuan);
        System.out.println("*================================*");
        System.out.println("|        Berhasil Dipesan        |");
        System.out.println("*================================*\n");
    }
    
    @Override
    void BatalPesan() {
        System.out.println("\n*================================*");
        System.out.println("| Tiket Atas Nama : " + this.nama);
        System.out.println("| Kelas Tiket     : Bisnis ");
        System.out.println("| Dengan Rute     : \n| \t" + this.asal + " -> " + this.tujuan);
        System.out.println("*================================*");
        System.out.println("|       Berhasil Dibatalkan      |");
        System.out.println("*================================*\n");
    }
    
    @Override
    void UbahPesanan() {
        System.out.println("\n*================================*");
        System.out.println("| Tiket Atas Nama : " + this.nama);
        System.out.println("| Kelas Tiket     : Bisnis ");
        System.out.println("| Dengan Rute     : \n| \t" + this.asal + " -> " + this.tujuan);
        System.out.println("*================================*");
        System.out.println("|       Berhasil Ditetapkan      |");
        System.out.println("*================================*\n");
    }
    
    public void overloading(int total_harga){
        System.out.println("| Fasilitas Yang Didapat : " + this.fasilitas);
        total_harga = this.harga + this.biaya_tambah;
        System.out.println("|\n| Biaya Tambahan : \n| \t\t" + this.biaya_tambah + " Rupiah ");
        System.out.println("| Total Biaya    : \n| \t\t" + total_harga + " Rupiah");
        System.out.println("*================================*\n");
        
    }
    
}
