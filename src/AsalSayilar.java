public class AsalSayilar {
    public static void main(String[] args) {
        System.out.println("1 - 100 arasındaki asal sayılar:");

        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean asallik = true;

            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asallik = false;
                    break;
                }
            }

            if (asallik) {
                System.out.print(sayi + " ");
            }
        }
    }
}