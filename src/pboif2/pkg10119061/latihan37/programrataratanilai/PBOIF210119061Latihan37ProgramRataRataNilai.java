/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan37.programrataratanilai;

/**
 *
 * @author Rheiza
 * NAMA  : RHEIZA AKMAL R
 * KELAS : IF2
 * NIM   : 10119061
 */
public class PBOIF210119061Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Nilai nilai = new Nilai();
        
        nilai.inputNilai();
        nilai.nilaiMahasiswa();
        System.out.println("Maka, Rata-rata Nilainya adalah : " + nilai.rataRataNilai());
    }
    
}
