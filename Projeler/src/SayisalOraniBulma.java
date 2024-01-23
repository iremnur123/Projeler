import java.util.*;

public class SayisalOraniBulma {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int sayi, sayac;
        int toplam1=0;
        int toplam2=0;

        for (sayac = 1; sayac <= 10; sayac++) {
            System.out.print(sayac+". Sayıyı Giriniz: ");
            sayi = input.nextInt();
            if (sayi >= 50) {
                toplam1=toplam1+sayi;
            } else {
                toplam2=toplam2+sayi;
            }
        }
        System.out.println("50'den büyük sayıların toplamı: "+toplam1);
        System.out.println("50'den küçük sayıların toplamı: "+toplam2);
        System.out.println("iki toplamın oranı: "+(double)toplam1/toplam2);
    }
}