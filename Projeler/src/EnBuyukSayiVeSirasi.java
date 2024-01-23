import java.util.Scanner;

public class EnBuyukSayiVeSirasi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 10 sayı giriniz.");
        int enBuyuk = Integer.MIN_VALUE;
        int girilenSira = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+". Sayıyı Giriniz: ");
            int sayi = scanner.nextInt();
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
                girilenSira = i;
            }
        }
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("Girildiği sıra: " + girilenSira);
        scanner.close();
    }
}