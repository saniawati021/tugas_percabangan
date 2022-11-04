/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package percabangan.percabangan_tugas;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Percabangan_tugas {

    public static void main(String[] args) {
                // deklarasi variabel
        int bilangan;
        
        //scanner
        Scanner x = new Scanner (System.in);
        System.out.print("Masukan Angka : ");
        
        //struktur kondisi if
        if (x.hasNextInt()){
           bilangan = x.nextInt();
            if (bilangan < 6){
                System.out.println("Angka harus lebih dari 6");
            } else if (bilangan > 100){
                System.out.println("Angka harus kurang dari 100");
            } else if (bilangan%2==0){
                System.out.println("Anda Menginput Bilangan Genap");
            } else {
                System.out.println("Anda Menginputkan Bilangan Ganjil");
            }
        }else{
              System.out.println("Anda harus menginputkan bilangan");  
            }
    }
}
