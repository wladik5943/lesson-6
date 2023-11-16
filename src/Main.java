import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[8][8];
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("m = ");
        int m = scanner.nextInt();
        n--;
        m--;
        arr[n][m] = 9;
        int nCopy = n;
        int mCopy = m;
        while (nCopy > 0 && mCopy > 0) {
            nCopy--;
            mCopy--;
        }
        for (int i = nCopy, j = mCopy; i < 8 && j < 8; i++, j++) {
            if (arr[i][j] == 9) continue;
            arr[i][j] = 1;
        }

        nCopy = n;
        mCopy = m;

        while (nCopy > 0 && mCopy < 7) {
            nCopy--;
            mCopy++;
        }

        for (int i = nCopy, j = mCopy; i < 8 && j >= 0; i++, j--) {
            if (arr[i][j] == 9) continue;
            arr[i][j] = 1;
        }

        for (int i = 0; i < 8; i++) {
            if (arr[n][i] == 9) continue;
            arr[n][i] = 1;
        }

        for (int i = 0; i < 8; i++) {
            if (arr[i][m] == 9) continue;
            arr[i][m] = 1;
        }

        for (int[] temp : arr) {
            for (int temp1 : temp) {
                System.out.print(temp1 + " ");
            }
            System.out.println();
        }

    }
}