import java.util.Scanner;

public class SifreKontrol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String dogruKullaniciAdi = "patika";
        String dogruSifre = "java123";

        System.out.print("Kullanıcı Adınız : ");
        String kullaniciAdi = input.nextLine();

        System.out.print("Şifreniz : ");
        String sifre = input.nextLine();

        if (kullaniciAdi.equals(dogruKullaniciAdi) && sifre.equals(dogruSifre)) {
            System.out.println("Giriş Yaptınız!");
        } else {
            System.out.println("Kullanıcı adınız veya şifreniz yanlış!");

            if (!sifre.equals(dogruSifre)) {
                System.out.print("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır) : ");
                String cevap = input.nextLine();

                if (cevap.equalsIgnoreCase("Evet")) {
                    System.out.print("Yeni Şifrenizi Giriniz : ");
                    String yeniSifre = input.nextLine();

                    if (yeniSifre.equals(dogruSifre) || yeniSifre.equals(sifre)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu");
                        dogruSifre = yeniSifre;
                    }
                } else {
                    System.out.println("Şifre sıfırlama işlemi iptal edildi.");
                }
            }
        }

        input.close();
    }
}
