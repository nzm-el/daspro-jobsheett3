import java.util.Scanner;

public class Siakad18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;  

        System.out.print("Masukan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukan nama absen: ");
        absen = sc.nextByte(); 
        System.out.print("Masukan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukan nilai UAS: ");
        nilaiUAS = sc.nextDouble();
    
        nilaiAkhir = (nilaiKuis*0.20) + (nilaiTugas*0.15) + (nilaiUTS*0.30) + (nilaiUAS*0.35) ;  

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + "Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}