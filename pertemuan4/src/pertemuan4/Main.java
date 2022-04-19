/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author Hp
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import pertemuan3.Mobil;
public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
        ArrayList<Mahasiswa> dataMobil = new ArrayList<>();
        boolean x;
        while (true) {
            System.out.println("====== Menu ======");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.println("==================");
            System.out.print("Input Menu : ");
            int menu = Integer.parseInt(input.readLine());
            switch (menu) {
                case 1:
                    System.out.println("1. Mahasiswa");
                    System.out.println("2. Dosen");
                    System.out.print("pilih >> ");
                    int pilih = Integer.parseInt(input.readLine());
                    if(pilih = 1){
                        System.out.println(x: "masukkan nama :");
                        String nama = input.readLine();
                        System.out.println(x: "masukkan nip :");
                        String nip = input.readLine();
                        System.out.println(x: "masukkan jenis kelamin :");
                        String jeniskelamin = input.readLine();
                        
                    }else{
                        
                    }
                    break;
                case 2:
                    System.out.println("Read");
                    for (int i = 0; i < dataMobil.size(); i += 1) {
                        
                        System.out.println("Mobil ke-" + (i + 1));
                        System.out.println("Pemilik     : " + dataMobil.get(i).getPemilik());
                        System.out.println("Merk        : " + dataMobil.get(i).getMerk());
                        System.out.println("CC          : " + dataMobil.get(i).getCc());
                        System.out.println("Plat        : " + dataMobil.get(i).getPlat());
//                        dataMobil.get(i).display();
                    }
                    // Cara Lain pakai foreach
                    // for (Mobil mobil : dataMobil) {
                    // mobil.display();
                    // }
                    break;
                case 3:
                    System.out.println("Update");
                    System.out.println("Input Plat Mobil : ");
                    String nomor = input.readLine();
                    for (Mahasiswa mobil : dataMobil) {
                        if (mobil.getPlat().equals(nomor)) {
                            System.out.print("Input Pemilik : ");
                            mobil.setPemilik(input.readLine());
//                            mobil.getPemilik();
                            System.out.print("Input Merk : ");
                            mobil.setMerk(input.readLine());
//                            mobil.getMerk();
                            System.out.print("Input CC : ");
                            mobil.setCc(Integer.parseInt(input.readLine()));
//                            mobil.getCc();
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Delete");
                    System.out.print("Input plat mobil : ");
                    String noPlat = input.readLine();
                    for (int i = 0; i < dataMobil.size(); i++) {
                        if (dataMobil.get(i).getPlat().equals(noPlat)) {
                            dataMobil.remove(i);
                            break;
                        }
                    }
                    // Nizzzzar : 059
                    // System.out.println("Mobil ke- : ");
                    // int nomor1 = Integer.parseInt(input.readLine());
                    // nomor1 -= 1;
                    // if (dataMobil.size() > nomor1) {
                    // dataMobil.remove(nomor1);
                    // }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak ada");
                    break;
            }
        }

    }
}
