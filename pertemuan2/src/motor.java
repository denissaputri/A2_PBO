/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class motor {
    String merk, warna;
    int roda;
    
    
    public motor (String merk, String warna, int roda){
        this.merk = merk;
        this.warna = warna;
        this.roda = roda;
    }
    //method
    public void kuat(){
        System.out.println(this.merk + " ini ga kuat tanjakan." );
    }
    public void nyusruk(){
        System.out.println(this.merk + " ini nyusruk seminggu 3x." );
    }
}
