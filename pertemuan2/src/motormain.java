/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class motormain {
    public static void main(String[] args) {
        motor mtr1 = new motor("Vario","hijau",2);
        mtr1.merk = "Vario";
        mtr1.warna = "hijau";
        mtr1.roda = 2;
        
        System.out.println("merk : " + mtr1.merk);
        System.out.println("warna  : " + mtr1.warna);
        System.out.println("jumlah roda  : " + mtr1.roda);
        
        
        mtr1.nyusruk();
    }
}
