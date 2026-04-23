import java.util.Scanner;

public class ATMSwitchCase {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                do {
                    System.out.println("MENÜ");
                    System.out.println("1-Para yatırma");
                    System.out.println("2-Para Çekme");
                    System.out.println("3-Bakiye Sorgula");
                    System.out.println("4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            int yatirilacakMiktar = input.nextInt();
                            balance += yatirilacakMiktar;
                            System.out.println("İşlem başarılı. Yeni bakiyeniz: " + balance);
                            break;

                        case 2:
                            System.out.print("Para miktarı : ");
                            int cekilecekMiktar = input.nextInt();
                            if (cekilecekMiktar > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= cekilecekMiktar;
                                System.out.println("İşlem başarılı. Yeni bakiyeniz: " + balance);
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : " + balance + " TL");
                            break;

                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;

                        default:
                            System.out.println("Geçersiz işlem! Lütfen 1-4 arasında bir seçim yapınız.");
                            break;
                    }

                } while (select != 4);

                break;

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");

                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }

        input.close();
    }
}