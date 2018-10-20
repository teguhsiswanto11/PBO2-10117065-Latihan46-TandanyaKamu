import java.util.Scanner;
/**
 * @author
 * NAMA     : Teguh Siswanto
 * KELAS    : PBO2
 * NIM      : 10117065
 * Deskripsi Program :
 *
 */
public class Main {
//    kode warna
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
//    utama
    public static void main(String[] args) {

        Scanner scn1 = new Scanner(System.in);
        Age ag = new Age(2018);

        System.out.print("Masukkan Tahun Lahir Anda : ");
        ag.setYearBirth(scn1.nextInt());
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir Anda : "+ag.getYearBirth());
        System.out.println("Hari ini tahun : "+ag.getYearNow());
        System.out.println("Umur Kamu sampai hari ini adalah : "+ag.hitungUmur()+" tahun");
        System.out.println("Tandanya kamu : "+ANSI_RED+ag.tandanyaKamu(ag.hitungUmur())+ANSI_RESET);

    }
}
