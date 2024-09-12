
import java.util.Scanner;

public class tugas02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jamKerja, upahPerJam;
        double bonus, pajak, jumlahGaji, gaji;

        System.out.print("Masukkan Jumlah jam kerja karyawan: ");
        jamKerja= input.nextInt();
        System.out.print("Masukkan Upah karyawan per Jam: ");
        upahPerJam= input.nextInt();

        double kerja =upahPerJam*jamKerja;
        bonus=kerja*0.1;
        pajak=kerja*0.05;
        double gajibersih=kerja+bonus-pajak;

        System.out.println("Jumlah gaji bersih karyawan: "+gajibersih);
    }
}
