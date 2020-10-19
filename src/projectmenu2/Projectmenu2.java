/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmenu2;
import java.util.Scanner;
/**
 *
 * @author MOKLET1
 */
public class Projectmenu2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("|Daftar Menu Masakan Padang Murah|");
        System.out.println("----------------------------------");
        String[]menu = {"Nasi Ayam","Nasi Ikan","Nasi Cincang","Nasi Kikil",
            "Nasi Gulai Kepala Kakap","Nasi Telor Dadar","Nasi Telor Bulat",
            "Nasi Dendeng","Nasi Paru","Nasi Putih","Sayur Nangka",
            "Perkedel","Kerupuk"};
        int []harga = {15000,15000,17000,20000,35000,11000,10000,18000,15000,5000,5000,3000,1000};
        for (int i = 0; i <menu.length; i++)
            System.out.println(i+". "+menu[i]+" --> Rp."+harga[i]);
        System.out.println("----------------------------------");
        System.out.print("Masukkan nomor pesanan :");
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        System.out.println("Menu pilihan : "+menu[pilihan]+" --> Rp."+harga[pilihan]);
        System.out.print("Jumlah Pesanan:");
        int jumlah = input.nextInt();
        System.out.println("----------------------------------");
        
        System.out.println("<<<<<<<<<<Nota Pembayaran>>>>>>>>>>");
        System.out.print("Nama Pelanggan :");
        String nama = input.next();
        System.out.print("Nomor Meja :");
        int meja= input.nextInt();
        System.out.println("Pesanan : "+menu[pilihan]);
        System.out.println("Harga :RP."+harga[pilihan]);
        System.out.println("Jumlah Pesanan:"+jumlah);
        System.out.println("Total :Rp."+(harga[pilihan]*jumlah));
        
        System.out.print("Bayar :Rp.");
        int uang = input.nextInt();
        
        if (uang > harga[pilihan]){
            System.out.println("Kembalian :Rp."+(uang - (harga[pilihan]*jumlah)));
            System.out.println("Terima Kasih, Selamat Datang Kembali^^");
    
        }else if (uang == harga[pilihan]){
            System.out.println("Kembalian :-");
            System.out.println("Terima Kasih, Selamat Datang Kembali^^");
        }else{
            System.out.println("Uang anda kurang "+(harga[pilihan]-uang));
        
    }
    }   
}
