public class KaydirmaProblemi {
    public static void main(String[] args){
        String kelime = "Programlama" ;
        int adimSayisi = 12;

        for (int i=0;i<adimSayisi; i++) {
            String kaydirilmiş= kelime.substring(i) + kelime.substring(0,i);
            System.out.println(" - "+kaydirilmiş);
        }

    }
}
