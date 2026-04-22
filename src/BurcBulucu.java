import java.util.Scanner;

public class BurcBulucu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gun, ay;
        String burc = "";
        boolean gecerliTarih = true;

        System.out.print("Doğduğunuz ayı giriniz (1-12): ");
        ay = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz: ");
        gun = input.nextInt();

        if (ay == 1) {
            if (gun >= 1 && gun <= 21) {
                burc = "Oğlak";
            } else if (gun >= 22 && gun <= 31) {
                burc = "Kova";
            } else {
                gecerliTarih = false;
            }
        } else if (ay == 2) {
            if (gun >= 1 && gun <= 19) {
                burc = "Kova";
            } else if (gun >= 20 && gun <= 29) {
                burc = "Balık";
            } else {
                gecerliTarih = false;
            }
        } else if (ay == 3) {
            if (gun >= 1 && gun <= 20) {
                burc = "Balık";
            } else if (gun >= 21 && gun <= 31) {
                burc = "Koç";
            } else {
                gecerliTarih = false;
            }
        } else if (ay == 4) {
            if (gun >= 1 && gun <= 20) {
                burc = "Koç";
            } else if (gun >= 21 && gun <= 30) {
                burc = "Boğa";
            } else {
                gecerliTarih = false;
            }
        } else if (ay == 5) {
            if (gun >= 1 && gun <= 21) {
                burc = "Boğa";
            } else if (gun >= 22 && gun <= 31) {
                burc = "İkizler";
            } else {
                gecerliTarih = false;
            }
        } else if (ay == 6) {
            if (gun >= 1 && gun <= 22) {
                burc = "İkizler";
            } else if (gun >= 23 && gun <= 30) {
                burc = "Yengeç";
            } else {
                gecerliTarih = false;
            }
        } else if (ay == 7) {
            if (gun >= 1 && gun <= 22) {
                burc = "Yengeç";
            } else if (gun >= 23 && gun <= 31) {
                burc = "Aslan";
            } else {
                gecerliTarih = false;
            }
        } else if (ay == 8) {
            if (gun >= 1 && gun <= 22) {
                burc = "Aslan";
            } else if (gun >= 23 && gun <= 31) {
                burc = "Başak";
            } else {
                gecerliTarih = false;
            }
        } else if (ay == 9) {
            if (gun >= 1 && gun <= 22) {
                burc = "Başak";
            } else if (gun >= 23 && gun <= 30) {
                burc = "Terazi";
            } else {
                gecerliTarih = false;
            }
        } else if (ay == 10) {
            if (gun >= 1 && gun <= 22) {
                burc = "Terazi";
            } else if (gun >= 23 && gun <= 31) {
                burc = "Akrep";
            } else {
                gecerliTarih = false;
            }
        } else if (ay == 11) {
            if (gun >= 1 && gun <= 21) {
                burc = "Akrep";
            } else if (gun >= 22 && gun <= 30) {
                burc = "Yay";
            } else {
                gecerliTarih = false;
            }
        } else if (ay == 12) {
            if (gun >= 1 && gun <= 21) {
                burc = "Yay";
            } else if (gun >= 22 && gun <= 31) {
                burc = "Oğlak";
            } else {
                gecerliTarih = false;
            }
        } else {
            gecerliTarih = false;
        }

        if (gecerliTarih) {
            System.out.println("Burcunuz: " + burc);
        } else {
            System.out.println("Hatalı tarih girişi!");
        }

        input.close();
    }
}