/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan20.targetsaldotabungan;

/**
 *
 * @author Aditya
 * Nama                 : Aditya Nur Iskandar
 * Kelas                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program yang berisi tentang mengetahui coding 
 * Target Saldo Tabungan.
 */
public class PBO210117070Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1;
        int saldo = 35000000;
        double bunga = 0.08;
        double saldoPerbulan;
        
        
        
        while (saldo <= 6000000){
            saldoPerbulan = bunga * saldo;
            saldo = (int) (saldo + saldoPerbulan);
        
            System.out.println("Saldo di bulan Ke-" + i + " Rp."+saldo);
            i++;
            
        }
        
         }
            
            
        }

