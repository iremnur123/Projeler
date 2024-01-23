import java.util.Scanner;

public class SesliSessizHarf {

    public static void main(String[] args) {

        String metin;

        char k;
        char l;
        int sayac = 0;
        int sayacc=0;
        int i;
        int x;

        Scanner scan = new Scanner(System.in);

        System.out.println("Metin giriniz: ");
        metin = scan.nextLine();

        for(i=0; i<metin.length(); i++) {
            k = metin.charAt(i);
            if (k=='a'|| k=='e'|| k=='ı'|| k=='i'|| k=='o'|| k=='ö'|| k=='u'|| k=='ü' ) sayac++;
        }
        System.out.println(sayac + " adet sesli harf vardır.");
        for(x=0; x<metin.length(); x++) {
            l = metin.charAt(x);
            if (l=='b'|| l=='c'|| l=='ç'|| l=='d'|| l=='f'|| l=='g'|| l=='ğ'|| l=='h'|| l=='j'|| l=='k'|| l=='l'|| l=='m'|| l=='n'|| l=='p'|| l=='r'|| l=='s'|| l=='ş'|| l=='t'|| l=='v'|| l=='y'|| l=='z' ) sayacc++;
        }
        System.out.println(sayacc + " adet sessiz harf vardır.");

    }
}