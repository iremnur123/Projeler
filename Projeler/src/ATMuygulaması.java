import java.util.Scanner;

public class ATMuygulaması {
    public static void main(String[] args){
        String islemSecenekleri="Bakiye görüntüleme-->1" +
                "Para çekme-->2" +
                "Para yatırma-->3" +
                "Çıkış için q tuşuna basınız";
        Scanner scanner = new Scanner(System.in);
        double abakiye=2540;
        String ahesapno= "0123456789012345";
        String asifre = "2345";
        System.out.println("ATM'ye HOŞGELDİNİZ");
        System.out.println("LÜTFEN BİLGİLERİNİZİ GİRİNİZ");
        System.out.print("Hesap No: ");
        String hesapNo =scanner.nextLine();
        System.out.print("Şifre: ");
        String sifre= scanner.nextLine();

        if (hesapNo.equals("0123456789012345") && sifre.equals("2345")){
            System.out.println("Hesabınıza Giriş Yapıldı.");
            System.out.println(islemSecenekleri);
            System.out.print("Lütfen Bir Seçim Yapınız: ");
            String secim = scanner.nextLine();
            switch (secim){
                case "1":
                    System.out.println("Bakiyeniz: "+abakiye);
                    break;
                case "2":
                    System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                    int cekilecektutar=scanner.nextInt();
                    if (abakiye>=cekilecektutar){
                        abakiye-=cekilecektutar;
                        System.out.println("Kalan tutar: "+abakiye);
                    }else{
                        System.out.println("Yetersiz bakiye");
                    }break;

                case "3":
                    System.out.println("Yatırılacak tutarı giriniz: ");
                    int yatirilacaktutar= scanner.nextInt();
                    abakiye+=yatirilacaktutar;
                    System.out.println("Yeni Bakiyeniz : "+abakiye);
                    break;
                case "q":
                    System.out.println("Hesabınızdan Çıkış Yapıldı.");
                default:
                    System.out.println("HATALI SEÇİM YAPILDI");
            }
        }
        else {
            System.out.println("KULLANICI ADINIZ VEYA ŞİFRENİZ YANLIŞ!");
        }
    }
}