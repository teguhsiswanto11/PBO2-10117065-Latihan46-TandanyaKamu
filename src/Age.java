public class Age {
    private int yearBirth;
    private int yearNow;
    private String red;

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public int hitungUmur() {

        return yearNow-yearBirth;}

    public String tandanyaKamu(int umur) {
        String tanda = " ";
        if (0 <= umur && umur <= 5) {tanda = "LAGI LUCU-LUCUNYA"; }
        else if (5 < umur && umur <= 10){tanda = "MASIH ANAK-ANAK"; }
        else if (10 < umur && umur <= 13){tanda = "MASIH REMAJA"; }
        else if (13 < umur && umur <= 19){tanda = "ALAY"; }
        else if (19 < umur && umur <= 29){tanda = "LAGI NYARI JODOH"; }
        else if (29 < umur && umur <= 35){tanda = "LAGI SIBUK NYARI UANG"; }
        else if (35 < umur && umur <= 150){tanda = "SUDAH TUA"; }
        else {tanda = "TIDAK TERDETEKSI DI KEHIDUPAN"; }
        return tanda;}

}
