/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest6;


import java.util.ArrayList;
import java.util.Scanner;
import posttest6.Ksrpoltekkes;
import posttest6.Ksrunmul;
import posttest6.ksrUmum;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//            Scanner input2 = new Scanner(System.in);
        ArrayList<Ksr> data = new ArrayList<>();
        ArrayList<Ksrunmul> dataKsrunmul = new ArrayList<>();
        ArrayList<Ksrpoltekkes> dataKsrpoltekkes = new ArrayList<>();
//        Ksr KsrBaru = new Ksr();
        Ksrunmul ksrunmulNew = new Ksrunmul();
        Ksrpoltekkes ksrpoltekkesNew = new Ksrpoltekkes();
        ksrUmum Ksrbaru  = new ksrUmum();
        ksrUmum.ksrData dataBaru = Ksrbaru.new ksrData(Ksrbaru);
       
            int pilihMenu=0;
            do{
                System.out.println("=========================================");
                System.out.println("   SISTEM PENDATAAN KSR KOTA SAMARINDA   ");
                System.out.println("=========================================");
                System.out.println("Menu :");
                System.out.println("1. Tambahkan Data");
                System.out.println("2. Tampilkan Data");
                System.out.println("3. Ubah Data");
                System.out.println("4. Hapus Data");
                System.out.println("5. Info tambahan KSR Kota Samarinda ");
                System.out.println("6. keluar");
                System.out.println("=========================================");
                System.out.print("Pilih >> ");
                pilihMenu = input.nextInt();
                switch (pilihMenu){
                    case 1:
                        System.out.println("====================");
                        System.out.println("** Tambahkan data **");
                        System.out.println("====================");
//                        KSRunmulnew.ada();
                        System.out.println(Ksr.ksrJargon.jargon());
                        System.out.println("1. KSR unmul");
                        System.out.println("2. KSR poltekkes");
                        System.out.println("====================");
                        System.out.print("pilih >>  ");
                        int pilih = input.nextInt();
                        if (pilih == 1){
                            System.out.println(" ");
                            System.out.println("====================");
                            System.out.println("**     KSR Unmul  **");
                            System.out.println("====================");
//                            System.out.print("Status       : ");
//                            dataBaru.terdataKsr();
                            System.out.print("Masukkan nama ketua      : ");
                            String nama = input.next();
                            System.out.print("Masukkan alamat          : ");
                            String alamat = input.next();
                            System.out.print("Masukkan asal instansi   : ");
                            String asal = input.next();
                            System.out.print("Masukkan tahun berdiri   : ");
                            int tahun = input.nextInt();
                            System.out.print("Dibawah naungan PMI(y/t) : ");
                            String naungan = input.next();
                            System.out.print("Jumlah KSR kota Samarinda saat ini : ");
                            int jumlah = input.nextInt();
                            
                            dataKsrunmul.add(new Ksrunmul(nama, alamat, asal, tahun, naungan));
                        }else{
                            System.out.println(" ");
//                            System.out.println( kegiatan("KSR Poltekkes") );
                            System.out.println("====================");
                            System.out.println("**  KSR Poltekkes **");
                            System.out.println("====================");
//                            System.out.print("Status       : ");
//                            dataBaru.tdk_terdataKsr();
                            System.out.print("Masukkan nama ketua      : ");
                            String nama = input.next();
                            System.out.print("Masukkan alamat          : ");
                            String alamat = input.next();
                            System.out.print("Masukkan asal instansi   : ");
                            String asal = input.next();
                            System.out.print("Masukkan jumlah anggota  : ");
                            int jumlahAnggota = input.nextInt();
                            System.out.print("Jumlah KSR Kota Samarinda saat ini  : ");
                            int jumlah = input.nextInt();
                            
                            dataKsrpoltekkes.add(new Ksrpoltekkes(nama, alamat, asal, jumlah));
                        }
                        break;
                    case 2:
                        System.out.print(" ");
//                        KsrNew.ada();
                        System.out.println("====================");
                        System.out.println("** Tampilkan data **");
                        System.out.println("====================");
                        System.out.println(Ksr.ksrJargon.jargon());
                        System.out.println("1. KSR unmul");
                        System.out.println("2. KSR poltekkes");
                        System.out.println("====================");
                        System.out.print(" pilih >>  ");
                        int pilih2 = input.nextInt();
                        if(pilih2 == 1){
                            System.out.println("====================");
                            System.out.println("**     KSR Unmul  **");
                            System.out.println("====================");
                            for (int i=0; i < dataKsrunmul.size(); i += 1){
                                System.out.println("Data ke-" + (i + 1));
                                dataKsrunmul.get(i).tampil();
                            }
                            ksrunmulNew.ada();
                            System.out.println( kegiatan("KSR unmul","merupakan organisasi mahasiswa") );
                        }else{
                            System.out.println("====================");
                            System.out.println("**  KSR Poltekkes **");
                            System.out.println("====================");
                            for (int i=0; i < dataKsrpoltekkes.size(); i += 1){
                                System.out.println("Data ke-" + (i + 1));
                                dataKsrpoltekkes.get(i).tampil();
                            }
                           ksrpoltekkesNew.ada();
                           System.out.println( kegiatan("KSRPoltekkes") );
                        }   
                        break;
                        
                    case 3:
                        System.out.println("====================");
                        System.out.println("  ** Ubah data **   ");
                        System.out.println("===================="); 
                        System.out.println("1. KSR unmul");
                        System.out.println("2. KSR poltekkes");
                        System.out.println("====================");
                        System.out.print("pilih >>  ");
                        int pilih3 = input.nextInt();
                        if(pilih3 == 1){
                            System.out.println("====================");
                            System.out.println("**     KSR Unmul  **");
                            System.out.println("====================");
                            System.out.print("masukkan nama ketua   : ");
                            String namas = input.next();
                            for (Ksrunmul ksr : dataKsrunmul) {
                                if (ksr.getNama().equals(namas)) {
                                    System.out.println(" ");
                                    System.out.println(" ------ data baru ------ ");
                                    System.out.println(" ");
                                    System.out.print("Masukkan alamat          : ");
                                    ksr.setAlamat(input.next());
                                    System.out.print("Masukkan asal instansi   : ");
                                    ksr.setAsal(input.next());
                                    System.out.print("Masukkan tahun berdiri   : ");
                                    ksr.setTahun(input.nextInt());
                                    System.out.print("Dibawah naungan PMI(y/t) : ");
                                    ksr.setNaungan(input.next());
                                }
                            }
                        }else{
                            System.out.println("=====================");
                            System.out.println("**  KSR Poltekkes  **");
                            System.out.println("=====================");
                            System.out.print("masukkan nama ketua   : ");
                            String namas = input.next();
                            for (Ksrpoltekkes ksr : dataKsrpoltekkes) {
                                if (ksr.getNama().equals(namas)) {
                                    System.out.println(" ");
                                    System.out.println(" ------ data baru ------ ");
                                    System.out.println(" ");
                                    System.out.print("Masukkan alamat          : ");
                                    ksr.setAlamat(input.next());
                                    System.out.print("Masukkan asal instansi   : ");
                                    ksr.setAsal(input.next());
                                    System.out.print("Masukkan Jumlah anggota   : ");
                                    ksr.setJumlah(input.nextInt());

                                }
                            }
                        }
                        break;
                        
                    case 4:
                        System.out.println("======================");
                        System.out.println("** Menghapus data **  ");
                        System.out.println("======================");
                        System.out.println("1. KSRunmul");
                        System.out.println("2. KSR poltekkes");
                        System.out.println("======================");
                        System.out.print(" pilih >>  ");
                        int pilih4 = input.nextInt();
                        if (pilih4 == 1){
                            System.out.print("Masukkan nama ketua KSR yang datanya ingin dihapus : ");
                            String nama2 = input.next();
                            dataKsrunmul.clear();
                        }else{
                            System.out.print("Masukkan nama ketua KSR yang datanya ingin dihapus : ");
                            String nama2 = input.next();
                            dataKsrpoltekkes.clear();
                        }
                        break;
                                             
                    case 5:
                        System.out.println(" ");
                        System.out.println("** Info tambahan **");
                        System.out.println("====================");
                        System.out.println(Ksr.ksrJargon.jargon());
                        System.out.println("1. KSR unmul");
                        System.out.println("2. KSR poltekkes");
                        System.out.println("====================");
                        System.out.print(" pilih >>  ");
                        int pilih5 = input.nextInt();
                        System.out.println(" ");
                        if (pilih5 == 1){
                            System.out.println("Status KSR unmul : ");
                            dataBaru.terdataKsrini();
                        }else if(pilih5 == 2){
                            System.out.println("Status KSR poltekkes : ");
                            dataBaru.tdkterdataKsrini();
                        }else{
                            System.out.println("Maaf masukkan pilihan dengan benar.");
                        }
                    case 6:
                        System.out.println(" ");
                        System.out.println("** Terimakasih telah menggunakan program :) **");
                        System.out.println(" ");
                        break;
                        
                    default:
                        System.out.println("");
                        System.out.println("*** Maaf pilihan tidak tersedia ***");
                        System.out.println("");
                    break;

                }
            }
            while (pilihMenu != 5);
        
    
    }
    static String kegiatan(String var1, String var2) {
        return "note! " + var1 + " terdata di Samarinda dan " + var2 ;
    }
    
    static String kegiatan(String var1) {
        return var1 + " terdata di Samarinda" ;
    }

}
            
            