/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author Hp
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Pertemuan2 {
    public static void main(String[] args) {
//        Mahasiswa mhs1 = new Mahasiswa("Anto", 20091067, 3.90, "informatika");
//        mhs1.nama = "Anto";
//        mhs1.nim = 20091067;
//        mhs1.ipk = 3.90;
//        mhs1.prodi = "informatika";
//        
//        System.out.println("nama : " + mhs1.nama);
//        System.out.println("nim  : " + mhs1.nim);
//        System.out.println("ipk  : " + mhs1.ipk);
//        System.out.println("prodi: " + mhs1.prodi);
//        
//        mhs1.makan();

          InputStreamReader prepare =  new InputStreamReader(System.in);
          BufferedReader input = new BufferedReader(prepare);
          
          ArrayList<Motor> dataMotor = new ArrayList<>();
          while(true){
            System.out.println(" ====================== ");
            System.out.println("          menu          ");
            System.out.println(" ====================== ");
            System.out.println(" [1] Create ");
            System.out.println(" [2] Read ");
            System.out.println(" [3] Update ");
            System.out.println(" [4] Delete");
            System.out.println(" ====================== ");
            System.out.println("Pilih >> ");
            int pilih = Integer.parseInt(input.readLine());
            switch(pilih){
              case 1:
                  System.out.println("");
                  System.out.print("input plat : ");
                  String plat = input.readLine();
                  System.out.print("Input CC : ");
                  int cc = Integer.parseInt(input.)
                  
              case 2:
                  System.out.println("Read");
                  for (int i=0; i < dataMobil.size();i += 1){
              
              case 3:
                break;
              case 4:
                System.Out.println("Delete");
                System.out.print("Input plat motor : ");
                String noPlat = input.readLine();
                for(int i=0; i < dataMotor.size();i++){
                    if(dataMotor.get(i).plat.equals(noPlat))
                  }
                break;
              case 5:
                System.exit(0);
                break;
              default :
                System.out.println("Maaf pilihan tidak tersedia");
                break;
                     
                      
                  }
                              
          }
          
          
    }
}

