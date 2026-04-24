import java.util.Arrays;

public class TekrarEdenCiftSayilar {
    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1, 10, 8, 8, 2};
        int[] duplicate = new int[list.length];
        int index = 0;

        Arrays.sort(list);

        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] % 2 == 0 && list[i] == list[i + 1]) {
                boolean alreadyAdded = false;
                for (int j = 0; j < index; j++) {
                    if (duplicate[j] == list[i]) {
                        alreadyAdded = true;
                        break;
                    }
                }
                if (!alreadyAdded) {
                    duplicate[index] = list[i];
                    index++;
                }
            }
        }

        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.print("Tekrar Eden Çift Sayılar: ");
        for (int i = 0; i < index; i++) {
            System.out.print(duplicate[i] + " ");
        }
    }
}