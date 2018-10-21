/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117074.latihan49.biayaemaskawin;
import java.util.Scanner;
/**
 *Nama  : Brigita Julia Puspita Nai Goncalves;
 *Kelas : PBO-2
 *NIM   : 10117074
 *Deskripso Program : program ini berisi program yang menampilkan perhitungan
 *                    harga emas sesuai berat pergramnya.
 */
public class PBO210117074Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Emas emas = new Emas();
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        
        System.out.println("===Program Emas===");
        System.out.print("Berat emas = ");
        emas.setBeratEmas(scn1.nextFloat());
        System.out.print("Harga emas per-gram : ");
        emas.setHargaEmas(scn2.nextFloat());
        System.out.println("");
        System.out.println("Harga emas adalah = " + emas.totalBayar(15.7, 570000));
    }
    
}
