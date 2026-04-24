import java.util.Random;
import java.util.Scanner;

class MineSweeper {
    int row;
    int col;
    int mineCount;
    String[][] mineMap;
    String[][] gameMap;
    int openedCells;

    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.mineMap = new String[row][col];
        this.gameMap = new String[row][col];
        this.mineCount = (row * col) / 4;
        this.openedCells = 0;
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        initMaps();
        placeMines();

        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");

        while (true) {
            printMap(gameMap);

            System.out.print("Satır Giriniz : ");
            int r = input.nextInt();
            System.out.print("Sütun Giriniz : ");
            int c = input.nextInt();

            if (r < 0 || r >= row || c < 0 || c >= col) {
                System.out.println("Geçersiz koordinat! Tekrar dene.");
                continue;
            }

            if (!gameMap[r][c].equals("-")) {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
                continue;
            }

            if (mineMap[r][c].equals("*")) {
                System.out.println("Kaybettin.");
                break;
            }

            int mineCountAround = countMinesAround(r, c);
            gameMap[r][c] = String.valueOf(mineCountAround);
            openedCells++;


            if (openedCells == (row * col - mineCount)) {
                System.out.println("Oyunu Kazandınız !");
                printMap(gameMap);
                break;
            }
        }
    }

    public void initMaps() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mineMap[i][j] = "-";
                gameMap[i][j] = "-";
            }
        }
    }

    public void placeMines() {
        Random rand = new Random();
        int placedMines = 0;

        while (placedMines < mineCount) {
            int r = rand.nextInt(row);
            int c = rand.nextInt(col);

            if (!mineMap[r][c].equals("*")) {
                mineMap[r][c] = "*";
                placedMines++;
            }
        }
    }

    public int countMinesAround(int r, int c) {
        int count = 0;

        for (int i = r - 1; i <= r + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {
                if (i >= 0 && i < row && j >= 0 && j < col) {
                    if (mineMap[i][j].equals("*")) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public void printMap(String[][] map) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class MineSweeperMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col;

        while (true) {
            System.out.print("Satır sayısını giriniz: ");
            row = input.nextInt();
            System.out.print("Sütun sayısını giriniz: ");
            col = input.nextInt();

            if (row < 2 || col < 2) {
                System.out.println("Matris boyutu en az 2x2 olmalıdır. Tekrar dene.");
            } else {
                break;
            }
        }

        MineSweeper game = new MineSweeper(row, col);
        game.run();
    }
}