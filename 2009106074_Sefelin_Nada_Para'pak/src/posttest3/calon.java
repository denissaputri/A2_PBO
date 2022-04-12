/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest3;

public class calon {
    private String partai, namacalonkepaladaerah, namacalonwakilkepaladaerah;
    private int nomorurut;
    
    public calon (String partai, String namacalonkepaladaerah, String namacalonwakilkepaladaerah, int nomorurut){
        this.partai                     = partai;
        this.namacalonkepaladaerah      = namacalonkepaladaerah;
        this.namacalonwakilkepaladaerah = namacalonwakilkepaladaerah;
        this.nomorurut                  = nomorurut;
    }
    void tambah(){
        System.out.println(" Berhasil menambahkan");
    }
    
    void update(){
        System.out.println(" Berhasil mengupdate");
    }
     void display() {
        System.out.println("*****************************");
        System.out.println("|partai                     : " + this.partai   );
        System.out.println("|namacalonkepaladaerah      : " + this.namacalonkepaladaerah);
        System.out.println("|namacalonwakilkepaladaerah : " + this.namacalonwakilkepaladaerah);
        System.out.println("|nomorurut                  : " + this.nomorurut );
        System.out.println("*****************************");
    }
    
    public void Setpartai (String partai ){
        // System.out.println("partai    : ");
        this.partai    = partai ;
    }
    public void Setnamacalonkepaladaerah  (String namacalonkepaladaerah  ){
        // System.out.println("namacalonkepaladaerah   : ");
        this.namacalonkepaladaerah      = namacalonkepaladaerah  ;
    }
    public void Setnamacalonwakilkepaladaerah(String namacalonwakilkepaladaerah){
        // System.out.println("namacalonwakilkepaladaerah    : ");
        this.namacalonwakilkepaladaerah       = namacalonwakilkepaladaerah;
    }
    public void Setnomorurut  (int nomorurut  ){
        // System.out.println("nomorurut       : ");
        this.nomorurut          = nomorurut  ;
    }
    
    public String getpartai (){
        return partai ;
    }
    public String getnamacalonkepaladaerah (){
        return namacalonkepaladaerah ;
    }
    public String getnamacalonwakilkepaladaerah (){
        return namacalonwakilkepaladaerah ;
    }
    public int getnomorurut  (){
        return nomorurut  ;
    }
    
}
