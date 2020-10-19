/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsuhu;
import java.util.Scanner;
/**
 *
 * @author MOKLET1
 */
public class ProjectSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Konversi Suhu Celcius (°C)");
        System.out.println("--------------");
        System.out.println("Pilihan Konversi Suhu:\n 1. Fahrenheit (°F)\n "
                + "2. Kelvin (K)\n 3. Reamur (°R)");
        System.out.println("-------------------------------------------------------------------");
        
        Scanner inputUser;
        float celcius,hasil;
        String konversi;
        inputUser = new Scanner(System.in);
        
        System.out.print("Masukkan Suhu Dalam Celcius = ");
        celcius = inputUser.nextFloat(); 
        System.out.print("Masukkan Satuan Konversi = ");
        konversi = inputUser.next();
        
        System.out.println("-------------------------------------------------------------------");
        
        //Percabangan
        switch (konversi){
            case "F":
                //Konversi Fahrenheit
                hasil = (celcius*9/5) + 32;
                System.out.println("("+celcius+"°C*9/5)+32= "+hasil+"°F");
                break;
            case "K":
                //Konversi Kelvin
                hasil = celcius + 273;
                System.out.println(celcius+"°C+273 "+" = "+hasil+"K");
                break;
            case "R":
                //Konversi Reamur
                hasil = celcius*4/5;
                System.out.println("(4/5*"+celcius+"°C) = "+hasil+"°R");
                break;  
            default:
                System.out.println("Konversi Suhu dari C ke "+konversi+" Tidak Ditemukan");
    }
    }
}
