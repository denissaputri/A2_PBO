/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
        ArrayList<calon> datacalon = new ArrayList<>();
        
        //Author
        while (true) {
        System.out.println("||************ MENU ************||");
        System.out.println("||1.Mengisi data      **********||");
        System.out.println("||2.Melihat data      **********||");
        System.out.println("||3.Merubah data      **********||");
        System.out.println("||4.Menghapus data    **********||");
        System.out.println("||5.Exit              **********||");
        System.out.println("||******************************||");
        System.out.println("Pilih Menu :                   ");
            int menu = Integer.parseInt(input.readLine());
            
            switch (menu) {
                case 1:
                    System.out.println("|*************Mengisi Data*************|");
                    System.out.print("| partai                     : ");
                    String partai  = input.readLine();
                    System.out.print("| namacalonkepaladaerah      : ");
                    String namacalonkepaladaerah  = input.readLine();
                    System.out.print("| namacalonwakilkepaladaerah : ");
                    String namacalonwakilkepaladaerah = input.readLine();
                    System.out.print("| nomorurut                  : ");
                    int nomorurut = Integer.parseInt(input.readLine());
                  
                    
                    calon dataBaru = new calon(partai, namacalonkepaladaerah, namacalonwakilkepaladaerah, nomorurut);
                    datacalon.add(dataBaru);
                    break;
                    
                case 2:
                    System.out.println("|*************Melihat Data*************|");
                    for (int i = 0; i < datacalon.size(); i += 1) {
                        System.out.println("| Data ke-" + (i + 1));
                        datacalon.get(i).display();
                    }
                    break;
                case 3:
                    System.out.println("|*************Merubah Data*************|");
                    System.out.print("| Masukkan namacalonwakilkepaladaerah :   ");
                    String nomor = input.readLine();
                    for (calon calon : datacalon) {
                        if (calon.getpartai().equals(nomor)) {
                            System.out.print("| partai     : ");
                            calon.Setpartai(input.readLine());
                            System.out.print("| namacalonkepaladaerah      : ");
                            calon.Setnamacalonkepaladaerah(input.readLine());
                            System.out.print("| namacalonwakilkepaladaerah       : ");
                            calon.Setnamacalonwakilkepaladaerah   (input.readLine());
                            System.out.print("| nomorurut         : ");
                            calon.Setnomorurut (Integer.parseInt(input.readLine()));
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("|*************Menghapus Data*************|");
                    System.out.print("| Masukan namacalonwakilkepaladaerah  : ");
                    String namacln = input.readLine();
                    for (int i = 0; i < datacalon.size(); i++) {
                        if (datacalon.get(i).getnamacalonwakilkepaladaerah().equals(namacln)) {
                            datacalon.remove(i);
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("|*************Menghapus Data*************|");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak ada");
                    break;
            }
        }
    }
}