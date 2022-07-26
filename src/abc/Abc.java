/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

import java.util.Scanner;


/**
 *
 * @author ASUSVivoBook
 */
public class Abc {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
   
          int admin = 13000;
        String namaPelanggan[] = {"Galuh", "Indro", "Jedi", "Kanu"};
        String alamat[] ={"sawojajar","kedungkandang","batu","kayu"};
        System.out.println("1.Galuh     2.Indro     3.Jedi      4.Kanu");
        System.out.print("Masukkan Id Pelanggan= ");
        
       
        
        int id = input.nextInt();
        if (id < 1 || id > namaPelanggan.length) {
            System.out.print("INPUT SALAH");
            System.exit(id);
        }
        System.out.println("Golongan 1 = Sawojajar      Golongan 2 = Kedungkandang");
        System.out.println("Golongan 3 = Batu      Golongan 4 = Kayu ");
        
        System.out.print("Masukkan Golongan Anda = ");
        int pilih= input.nextInt();
        System.out.print("Pemakaian listrik (kwh)= ");
        int listrik = input.nextInt();
        int tagihan = hitung(listrik,pilih);
        System.out.println("===================|HASIL|====================");
        System.out.println("Id Pelanggan        :" + id);
        System.out.println("Nama Pelanggan      :" + namaPelanggan[id - 1]);
        System.out.println("Alamat              :" +alamat[id - 1]);
        System.out.println("Biaya Admin         :13000");
        System.out.println("Jumlah Tagihan      :" + tagihan);

    }

    static int hitung(int listrik,int pilih) {
        int tagihan = 0, admin = 13000;
        if (pilih==1) {
            tagihan = listrik*2000 + admin;
        } else if (pilih==2) {
            tagihan = listrik*5000 + admin;
        } else if (pilih==3) {
            tagihan = listrik*7000 + admin;;
        } 
        return tagihan;
    }
}
           
            
           