import java.util.Arrays;
import java.util.Scanner;

public class Diziler {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        int sayi = input.nextInt();

        int[] dizi = {3, 32, 5, 90, 76, 2, 14};
        System.out.println("Dizimiz: " + Arrays.toString(dizi));
        System.out.println("Girilen Sayi: " + sayi);

        Arrays.sort(dizi);
        for (int i : dizi) {
            if (i > sayi) {
                int index = Arrays.binarySearch(dizi, i);
                System.out.println("Girilen sayidan kucuk en yakin sayi : " + dizi[index - 1]);
                System.out.println("Girilen sayidan buyuk en yakin sayi : " + i);
                break;
            }
        }
    }
}
//Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
