/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;
 class Data{
    String nama;
    int nim;
    double ipk;
    
    public Data(String nama, int nim, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }
    
    void tinjauData1(){
        System.out.println("Data pertama");
    }
    
    void tinjauData2(){
        System.out.println("Data kedua");
    }
}

/**
 *
 * @author RA
 */
public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    
      public static void main(String[] args)throws Exception {
   
        Data data1 = new Data("Sefelin Nada Para'pak", 2009106074, 3.00);
        Data data2 = new Data("Hildayanti", 2009106123,4.00 );
        
        data1.tinjauData1();
        System.out.println("");
        System.out.println(data1.nama);
        System.out.println(data1.nim);
        System.out.println(data1.ipk);
        System.out.println("\n");
        
        data2.tinjauData2();
        System.out.println("");
        System.out.println(data2.nama);
        System.out.println(data2.nim);
        System.out.println(data2.ipk);
        
        

        
    }
} 
  
