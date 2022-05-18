/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;
import posttest6.Ksr.ksrSamarinda;

/**
 *
 * @author Hp
 */
//public class ksrUmum {
    public class ksrUmum implements ksrSamarinda{
        
        private String terdataKsr;
        private String tdkterdataKsr;
    
        @Override
        public void terdataKsr() {
                System.out.println("KSR unmul sudah terdata di Kota Samarinda.");

            }
        
        @Override
        public void tdkterdataKsr() {
            System.out.println("KSR poltekkes belum terdata di Kota Samarinda.");
            }         
        
        
    public String getTerdata(){
        return this.terdataKsr;
    }
    public String getTdkTerdata(){
        return this.tdkterdataKsr;
    }
    
    public class ksrData {

    private ksrSamarinda ksrsmd;
    
    public ksrData(ksrSamarinda ksrsmd){
        this.ksrsmd = ksrsmd;
    }

    void terdataKsrini(){
        this.ksrsmd.terdataKsr();
    }
    
    void tdkterdataKsrini(){
        this.ksrsmd.tdkterdataKsr();
    }
    }
}


