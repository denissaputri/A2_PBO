/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;


public class Mahasiswa {
    String nama,prodi;
    int nim;
    double ipk;
    
    
    Mahasiswa (String nama,int nim, double ipk, String prodi){
        this.nama = nama;  //gaharus sama nama parameter sm property > property dlu bru parameter
        this.nim = nim;
        this.ipk = ipk;
        this.prodi = prodi;
    }
    //method
    public void belajar(){
        System.out.println(this.nama + " sedang berjalan." );
    }
    public void makan(){
        System.out.println(this.nama + " sedang makan." );
    }
    
}
