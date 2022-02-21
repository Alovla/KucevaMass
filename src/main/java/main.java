import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // 1 задание
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int array = arr.length;
        for (int i = 0; i < array; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < array; i++)
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        for (int i = 0; i < array; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        // 2 задание
        int[] all = new int[100];
        int allay = all.length;
        for (int j = 0; j < allay; j++) {
            all[j] = j + 1;
            System.out.print(all[j] + " ");
        }
        System.out.println("");
// 3 задание
        int[] mnog = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int mnogim = mnog.length;
        for (int y = 0; y < mnogim; y++) {
            System.out.print(mnog[y] + " ");
        }
        System.out.println("");
        for (int y = 0; y < mnogim; y++) {
            if (mnog[y] < 6) mnog[y] = mnog[y] * 2;

        }
        for (int y = 0; y < mnogim; y++) {
            System.out.print(mnog[y] + " ");
        }
        System.out.println("");
        //4 задание
        int[][] massiv = {{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 0}, {1, 0, 0, 1}};

        for (int u = 0; u < massiv.length; u++) {
            for (int coloms = 0; coloms < massiv[u].length; coloms++) {
                System.out.print(massiv[u][coloms]);
                System.out.print(" ");
            }
            System.out.println();
        }
        retLenArr(5, 567);
    }

    //задача 5
    public static int[] retLenArr(int len, int initialValue) {
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            System.out.println("");

        }
        return arr;

    }
}



