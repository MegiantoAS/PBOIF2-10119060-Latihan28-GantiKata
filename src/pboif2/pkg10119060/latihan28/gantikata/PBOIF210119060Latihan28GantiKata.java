/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan28.gantikata;
 import java.util.Scanner;
/**
 *
  @author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Program Ganti Kata
 */
public class PBOIF210119060Latihan28GantiKata {

    public static void gantikata(String kalimat,String ganti,String jadi) {
        String hasil = kalimat.replace(ganti, jadi);
        System.out.println("Kalimat awal : "+kalimat);
        System.out.println("Kalimat baru : "+hasil);
  }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String kalimat, ganti, jadi;
       
        System.out.println("=====Program Mengganti kata====");
        System.out.println("");
        System.out.print("Masukan Kalimat : ");
        kalimat = input.nextLine();
        System.out.print("Ganti Kata : ");
        ganti = input.nextLine();
        System.out.print("Menjadi Kata : ");
        jadi = input.nextLine();
        System.out.println("");
        System.out.println("===Hasil Formating===");
        gantikata(kalimat, ganti, jadi);
    }
    
}
