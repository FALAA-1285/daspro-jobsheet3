
import java.util.Scanner;

public class kafe03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        float diskon=0.1f;
        double hargaKopi=12000.0, hargaTeh=7000.0, hargaRoti=20000.0, totalHarga, nominalBayar;

        System.out.print("Masukkan Keanggotaan (True/false): ");
        keanggotaan = input.nextBoolean();
        System.out.println("Masukkan pembeli kopi");
        jmlKopi = input.nextInt();
        System.out.println("Masukkan pembei teh");
        jmlTeh = input.nextInt();
        System.out.println("Masukkan pembeli roti");
        jmlRoti = input.nextInt();

        totalHarga = (jmlKopi*hargaKopi) + (jmlTeh*hargaTeh) + (jmlRoti*hargaRoti);
        nominalBayar= totalHarga - (diskon*totalHarga);
        
        System.out.println("Keanggotaan Pelanggan " + keanggotaan);
        System.out.println("Masukkan jumlah pembelian kopi: "+ jmlKopi);
        System.out.println("Masukkan jumlah pembelian teh: "+ jmlTeh);
        System.out.println("Masukkan jumlah pembelian roti "+ jmlRoti);
        System.out.println("Item Pembelian "+ jmlKopi+ " Kopi, "+ jmlTeh+ " Teh, "+ jmlRoti+ " Roti");
        System.out.println("Nominal Pembayaran: Rp" + nominalBayar);
    }
    
}

