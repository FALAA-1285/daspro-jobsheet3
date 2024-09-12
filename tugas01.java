
import java.util.Scanner;

public class tugas01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double  jmlListrik, totaltagihan, tarifListrik=1500;

        System.out.print("Masukkan jumlah pengguaan listrik anda? ");
        jmlListrik= sc.nextDouble();

        totaltagihan = tarifListrik*jmlListrik;
        boolean lebih= jmlListrik > 500;

        System.out.println("Total tagihan anda: " + totaltagihan);
        System.out.println("Apakah penggunaan listrik anda melebihi 500kWh: "+ lebih);
        
    }
}
