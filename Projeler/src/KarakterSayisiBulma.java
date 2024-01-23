import java.util.Scanner;

public class KarakterSayisiBulma {
    public static void main(String[] args) {
        String metin = " Java platformu, programcıların Java programlama uygulamalarını verimli bir \n şekilde geliştirmelerine ve çalıştırmalarına yardımcı olan bir program \n koleksiyonudur. Bir yürütme motoru, bir derleyici ve içinde  bir dizi \n kitaplık içerir. Bir dizi bilgisayar yazılımı ve spesifikasyonudur.James Gosling \n Java platformunu Sun Microsystems’de geliştirmiştir ve Oracle Corporation \n daha sonra satın almıştır.";
        System.out.println(metin);
        System.out.println("bir harf giriniz : ");
        Scanner scanner = new Scanner(System.in);
        char harf = scanner.next().charAt(0);
        int tane = 0;
        for (int i = 0; i < metin.length(); i++) {
            if (harf == metin.charAt(i)) {
                ++tane;
            }
        }

        System.out.println(harf + " yazı içinde  " + tane + " tanedir");
    }
}