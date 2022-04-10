/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import postest2.toko;
 
/**
 *
 * @author Hp
 */
public class barangtoko {
    public static void main(String[] args) {
      List<toko> brg = new ArrayList<toko>();
      Scanner s = new Scanner(System.in);
      Scanner s1 = new Scanner(System.in);
      int pilih;
      do{
         System.out.println("+------------------------------------+");
         System.out.println("|-----Daftar Menu Toko Muslimah -----|");
         System.out.println("+------------------------------------+");
         System.out.println("|      1. Tambah Data Barang         |");
         System.out.println("|      2. Lihat Data Barang          |");
         System.out.println("|      3. Hapus Data Barang          |");
         System.out.println("|      4. Update Data Barang         |");
         System.out.println("|      5. Keluar                     |");
         System.out.println("|------------------------------------|");
         System.out.print("Pilihan Menu Toko : ");
         pilih = s.nextInt();
         System.out.print("\n");

         switch(pilih){
            case 1:
               System.out.println("+-----------------------------------------------------------+");
               System.out.println("|-----------     TAMBAH DATA BARANG TOKO        ------------|");
               System.out.println("+-----------------------------------------------------------+");
               System.out.println("Masukkan ID Barang          : "); int no = s.nextInt();
               System.out.println("Masukkan Jumlah Barang      : "); int jum = s.nextInt();
               System.out.println("Masukkan Nama Barang        : "); String Barang = s1.nextLine();
               System.out.println("Masukkan Jenis Barang       : "); String Jenis = s1.nextLine();
               System.out.println("Masukkan harga Barang       : "); int harga = s.nextInt();
               System.out.println("-----------------------------------------------------------");

               brg.add(new toko(no,jum,Barang,Jenis,harga));
            break;

            case 2:
               System.out.println("+-----------------------------------------------------------+");
               System.out.println("|---------      Barang Yang Tersedia Di Toko        --------|");
               System.out.println("+-----------------------------------------------------------+");
               Iterator<toko> i = brg.iterator();
               
               for (toko M : brg) {
                   System.out.println(" ");
                   System.out.println("\tID         : " + M.setId());
                   System.out.println("\tJumlah     : " + M.setjumlah());
                   System.out.println("\tbarang     : " + M.setBarang());
                   System.out.println("\tJenis      : " + M.setJenis());
                   System.out.println("\tHarga      : " + M.setHarga());
               }
               System.out.println("+----------------------------------------------------------+");
            break;

            

            case 3:
               System.out.println("+-----------------------------------------------------------+");
               System.out.println("|---------      Barang Yang Tersedia Di Toko        --------|");
               System.out.println("+-----------------------------------------------------------+");               
               for (toko M : brg) {
                   System.out.println(" ");
                   System.out.println("\tID         : " + M.setId());
                   System.out.println("\tJumlah     : " + M.setjumlah());
                   System.out.println("\tbarang     : " + M.setBarang());
                   System.out.println("\tJenis      : " + M.setJenis());
                   System.out.println("\tHarga      : " + M.setHarga());
                 }
                    System.out.println("+----------------------------------------------------------+");
                boolean found = false;
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("------ Masukkan ID data Barang yang ingin dihapus ------- :");
                    System.out.println("-----------------------------------------------------------");
               int Id = s.nextInt();
                i = brg.iterator();
               while(i.hasNext()){
                  toko e = i.next();
                  if(e.setId() == Id)  {
                     i.remove();
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("+-----------------------------------------------------------+");
                  System.out.println("|               Data Barang tidak ditemukan                 |");
                  System.out.println("+-----------------------------------------------------------+");
               }else{
                  System.out.println("+-----------------------------------------------------------+");
                  System.out.println("|              Data Barang berhasil dihapus...!             |");
                  System.out.println("+-----------------------------------------------------------+");
               }
            break;
            
            case 4:
               System.out.println("+-----------------------------------------------------------+");
               System.out.println("|---------      Barang Yang Tersedia Di Toko        --------|");
               System.out.println("+-----------------------------------------------------------+");
               
               for (toko M : brg) {
                   System.out.println(" ");
                   System.out.println("\tID         : " + M.setId());
                   System.out.println("\tJumlah     : " + M.setjumlah());
                   System.out.println("\tbarang     : " + M.setBarang());
                   System.out.println("\tJenis      : " + M.setJenis());
                   System.out.println("\tHarga      : " + M.setHarga());
               }
               System.out.println("+----------------------------------------------------------+");
               found = false;

               System.out.println("+-----------------------------------------------------------+");
               System.out.println("|          Masukkan ID data yang akan di Update :           |");
               System.out.println("+-----------------------------------------------------------+");
               Id = s.nextInt();
               
               ListIterator<toko>li = brg.listIterator();
               while(li.hasNext()){
                  toko e = li.next();
                  if(e.setId() == Id)  {
                     System.out.println("+------------------------------------------------------------+");
                     System.out.println("         Masukkan ID data Barang yang ingin diupdate :       |");
                     System.out.println("+------------------------------------------------------------+");
                     System.out.println("Masukkan Nama Barang Baru    : ");Barang = s1.nextLine();
                     System.out.println("Masukkan Jenis Baru          : ");Jenis = s1.nextLine();
                     System.out.println("Masukkan Jumlah Baru         : ");jum = s1.nextInt();
                     System.out.println("Masukkan Harga Baru          : ");harga = s.nextInt();
                     System.out.println("+-----------------------------------------------------------+");                     
                     li.set(new toko(Id,jum,Barang,Jenis,harga));
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("+-----------------------------------------------------------+");
                  System.out.println("|              Data Barang tidak ditemukan                  |");
                  System.out.println("+-----------------------------------------------------------+");
               }else{
                  System.out.println("+-----------------------------------------------------------+");
                  System.out.println("|              Data berhasil di Update...!!!                |");
                  System.out.println("+-----------------------------------------------------------+");
               }
               
            break;
            
            case 5:
              System.out.println("+--------------------------------------------------------------+");
              System.out.println("                  Program Selesai Terima Kasih!!!              |");
              System.out.println("+--------------------------------------------------------------+");
               
            break;

            
         }
      }while(pilih!=5);
        
    }
}
