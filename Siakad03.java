
import java.util.Scanner;

public class Siakad03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir, nilaiUAS;

        System.out.println("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukkan Kelas: ");
        kelas = sc.nextLine();
        System.out.println("Masukkan Nomor Absen");
        absen = sc.nextByte();
        System.out.println("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan Nilai Ujian");
        nilaiUjian = sc.nextDouble();
        System.out.println("Masukkan nilai uas");        
        nilaiUAS  = sc.nextDouble();

        nilaiAkhir = (nilaiKuis*0.20 + nilaiTugas*0.15 + nilaiUjian*0.3 + nilaiUAS*0.3);
        
        System.out.println("Nama: "+ nama );
        System.out.println("NIM: "+ nim);
        System.out.println("Kelas: "+ kelas );
        System.out.println("Absen: "+ absen );
        System.out.println("Nilai Kuis: "+ nilaiKuis );
        System.out.println("Nilai Tugas: "+ nilaiTugas );
        System.out.println("Nilai Ujian: "+ nilaiUjian );
        System.out.println("Nilai UAS: " + nilaiUAS);
        System.out.print("Mahasiswa dengan nama " + nama);
        System.out.print(" NIM " + nim);
        System.out.print(" kelas " + kelas);
        System.out.println(" nomor absen " + absen);
        System.out.println(" Nilai Akhir: " + nilaiAkhir);
    }
}
