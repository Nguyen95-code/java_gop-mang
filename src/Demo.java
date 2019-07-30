import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[4];
        int[] array3 = new int[array1.length + array2.length];
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap mang 1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + " la: ");
            array1[i] = scanner.nextInt();
            array3[i] = array1[i];
        }
        System.out.println("nhap mang 2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + " la: ");
            array2[i] = scanner.nextInt();
            array3[array1.length + i] = array2[i];
        }
        System.out.println("mang thu nhat la :");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println("mang thu hai la :");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        System.out.println("mang sau khi gop la :");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
