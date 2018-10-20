import java.util.Scanner;
/**
 * @author
 * NAMA     : Teguh Siswanto
 * KELAS    : PBO2
 * NIM      : 10117065
 * Deskripsi Program : Mengetahui tanda pada diri Anda sesuai dengan umur Anda
 *
 */
public class Main {

    public static void main(String[] args) {

        Scanner scn1 = new Scanner(System.in);
        Age ag = new Age(2018);

        System.out.print("Masukkan Tahun Lahir Anda : ");
        ag.setYearBirth(scn1.nextInt());
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir Anda : "+ag.getYearBirth());
        System.out.println("Hari ini tahun : "+ag.getYearNow());
        System.out.println("Umur Kamu sampai hari ini adalah : "+ag.hitungUmur()+" tahun");
        System.out.println("Tandanya kamu : "+ag.tandanyaKamu(ag.hitungUmur()));

    }
}
