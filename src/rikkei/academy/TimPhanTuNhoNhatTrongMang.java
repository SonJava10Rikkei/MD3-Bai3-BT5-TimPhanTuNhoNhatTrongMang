package rikkei.academy;

import java.util.Scanner;

public class TimPhanTuNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Nhập vào số lượng phần tử bạn muốn so sánh: ");
            size = sc.nextInt();
            if (size > 10)
                System.out.println("Độ dài không được quá 10.");
        } while (size > 10);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + " :");
            array[i] = sc.nextInt();
            i++;
        }
        int result = minValue(array);
        System.out.println("Các phần tử trong mảng là: ");
        for (int item : array) {
            System.out.print(item + "\t");
        }
        System.out.println("Phần tử nhỏ nhất là: " + array[result]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
