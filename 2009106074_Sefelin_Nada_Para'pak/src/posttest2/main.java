/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest2;
import java.util.ArrayList; 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author RA
 */
public class main {
static ArrayList<Data> data = new ArrayList<Data>(); 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        System.out.println("Nama    : Sefelin Nada Para'pak");
        System.out.println("Nim     : 2009106074\n"); 
        
        data.add(new Data());
        data.get(0).partai= "GOLKAR";
        data.get(0).namacalonkepaladaerah = "SANDI";
        data.get(0).namacalonwakilkepaladaerah = "INDI";
        data.get(0).nomorurut = 1;
        data.add(new Data());
        data.get(1).partai = "DEMOKRAT";
        data.get(1).namacalonkepaladaerah = "SIMON";
        data.get(1).namacalonwakilkepaladaerah = "ANDI";
        data.get(1).nomorurut = 2;
        data.add(new Data());
        data.get(2).partai = "PDI PERJUANGAN";
        data.get(2).namacalonkepaladaerah = "MAISAL";
        data.get(2).namacalonwakilkepaladaerah = "DERSAN";
        data.get(2).nomorurut = 3;
        
        while (true) {
            menu();
             }
    }
    public static void menu()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("||************ MENU ************||");
        System.out.println("||1.Mengisi data      **********||");
        System.out.println("||2.Melihat data      **********||");
        System.out.println("||3.Merubah data      **********||");
        System.out.println("||4.Menghapus data    **********||");
        System.out.println("||5.Exit              **********||");
        System.out.println("||******************************||");
        String inputan_m;
        System.out.print("Masukan Menu :");
        inputan_m = br.readLine();
        if(inputan_m.equals("1")){
            createData();
        } else if (inputan_m.equals("2")){
            readData();
        } else if (inputan_m.equals("3")){
            updateData();
        } else if (inputan_m.equals("4")){
            deleteData();
        } else if (inputan_m.equals("5")){
            System.exit(0);
        } else {
            System.out.println("SALAH MEMILIH MENU");
        }    
    }
    public static void readData()throws IOException{
        for (int i = 0; i < data.size(); i++){
            System.out.println("data ke-" + (i + 1));
            System.out.println("partai : " + data.get(i).partai);
            System.out.println("namacalonkepaladaerah: " + data.get(i).namacalonkepaladaerah);
            System.out.println("namacalonwakilkepaladaerah : " + data.get(i).namacalonwakilkepaladaerah);
            System.out.println("nomorurut : " + data.get(i).nomorurut);
        }
        System.out.println(" ");
    }
    public static void createData()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1;
        String input2;
        String input3;
        int input4;
        
        System.out.print("Masukan partai : ");
        input1 = br.readLine();
        System.out.print("Masukan nama calon kepala daerah : ");
        input2 = (br.readLine());
        System.out.print("Masukan nama calon wakil kepala daerah : ");
        input3 = (br.readLine());
        System.out.print("Masukan nomor urut : ");
        input4 = Integer.parseInt (br.readLine());
        
        Data buatdata = new Data();
        buatdata.partai = input1;
        buatdata.namacalonkepaladaerah = input2;
        buatdata.namacalonwakilkepaladaerah = input3;
        buatdata.nomorurut = input4;
        data.add(buatdata);
        
    }
    public static void updateData()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputind;
        String input1;
        String input2;
        String input3;
        int input4;
        
        readData();
        
        System.out.print("Masukan data ke-");
        inputind = Integer.parseInt(br.readLine());
        int indexe = inputind-1;
        
        System.out.print("Masukan partai : ");
        input1 = br.readLine();
        System.out.print("Masukan nama calon kepala daerah : ");
        input2 = (br.readLine());
        System.out.print("Masukan nama calon wakil kepala daerah : ");
        input3 = (br.readLine());
        System.out.print("Masukan nomor urut : ");
        input4 = Integer.parseInt (br.readLine());
        
        data.get(indexe).partai = input1;
        data.get(indexe).namacalonkepaladaerah = input2;
        data.get(indexe).namacalonwakilkepaladaerah = input3;
        data.get(indexe).nomorurut = input4;
    }
    public static void deleteData()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputd;
        
        readData();
        
        System.out.println("Data yang ingin di hapus");
        System.out.print("Masukan Data ke-");
        inputd = Integer.parseInt(br.readLine());
        int indexd = inputd-1;
        
        data.get(indexd).hapus();
        data.remove(indexd);
    }

    }
